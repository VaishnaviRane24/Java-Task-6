import javax.swing.*;
import java.awt.*;

public class ToDoApp extends JFrame {
    private DefaultListModel<String> model = new DefaultListModel<>();
    private JList<String> taskList = new JList<>(model);
    private JTextField taskInput = new JTextField(20);

    public ToDoApp() {
        // Window setup
        setTitle("ToDo App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Buttons
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");

        // Add task action
        addButton.addActionListener(e -> {
            String task = taskInput.getText().trim();
            if (!task.isEmpty()) {
                model.addElement(task);
                taskInput.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Task cannot be empty!",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Delete task action
        deleteButton.addActionListener(e -> {
            int selected = taskList.getSelectedIndex();
            if (selected != -1) {
                model.remove(selected);
            } else {
                JOptionPane.showMessageDialog(this, "Select a task to delete!",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Panel for input and buttons
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(taskInput);
        panel.add(addButton);
        panel.add(deleteButton);

        // Task list with scroll bar
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Add components to frame
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ToDoApp().setVisible(true));
    }
}
