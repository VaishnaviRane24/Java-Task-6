# Java GUI ToDo Application

A simple and intuitive ToDo list application built using Java Swing for desktop GUI development.


## 📋 Overview

This application allows users to:
- Add new tasks to a todo list
- Delete selected tasks
- View all tasks in a scrollable list
- Receive warnings for empty tasks or when no task is selected for deletion


## 🛠️ Technologies Used

- **Java Swing** - For GUI components
- **Java AWT** - For layout management and event handling
- **DefaultListModel** - For dynamic task list management


## 🎯 Features

- **Clean GUI Interface**: Simple and user-friendly design
- **Task Management**: Add and delete tasks with button clicks
- **Input Validation**: Prevents empty tasks and provides warnings
- **Scrollable List**: Handles multiple tasks with scroll functionality
- **Center-aligned Window**: Automatically centers on screen


## 🏗️ GUI Components

### Main Components:
- **JFrame**: Main application window
- **JTextField**: Input field for new tasks
- **JList**: Display area for tasks with selection capability
- **JButton**: Add and Delete buttons
- **JScrollPane**: Scrollable container for task list
- **JPanel**: Container for input components

### Layout Management:
- **BorderLayout**: Main frame layout
- **FlowLayout**: Input panel layout


## 🔧 Code Structure

### Key Methods:
- **Constructor**: Sets up GUI components and event listeners
- **Action Listeners**: Handle Add and Delete button events
- **Input Validation**: Checks for empty tasks and selections

### Event Handling:
- **Add Button**: Adds task from text field to list
- **Delete Button**: Removes selected task from list
- **Warning Dialogs**: JOptionPane for user feedback


## 🚀 How to Run

### Compilation and Execution:
```bash
# Compile the Java file
javac ToDoApp.java

# Run the application
java ToDoApp
```

### Using IDE:
1. Open the project in your preferred Java IDE
2. Run the `ToDoApp.java` file directly
3. The application window will open automatically


## 📖 Usage Instructions

1. **Adding Tasks**:
   - Type your task in the text field
   - Click the "Add" button or press Enter
   - Task will appear in the list below

2. **Deleting Tasks**:
   - Click on any task in the list to select it
   - Click the "Delete" button to remove it
   - Only one task can be deleted at a time

3. **Error Handling**:
   - Empty task warning when trying to add blank tasks
   - Selection warning when no task is selected for deletion


## 🎓 Learning Objectives

This project demonstrates:
- **Swing Components**: Practical use of JFrame, JButton, JTextField, JList
- **Event Handling**: Implementing ActionListener with lambda expressions
- **Layout Management**: Using BorderLayout and FlowLayout effectively
- **GUI Best Practices**: Proper component organization and user feedback


## 🔍 Key Concepts Covered

- Java Swing framework
- Event-driven programming
- GUI component management
- Layout managers
- User input validation
- Exception handling in GUI applications

