package Homework_1.Task_1;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private String name;
    private List<TodoTask> tasks;

    {
        tasks = new ArrayList<>();
    }

    public TodoList(String name) {
        this.name = name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addTask() {
        this.tasks.add(new TodoTask());
    }

    public void addTask(String value) {
        this.tasks.add(new TodoTask(value));
    }

    public void removeTask(int id) {
        this.tasks.remove(id);
    }

    public TodoTask getTask(int id) {
        return this.tasks.get(id);
    }

    public void printTasks() {
        String text = "Id: %d; Value: %s; Completed: %b;";

        for (int i = 0; i < tasks.size(); i++) {
            System.out.printf(text, i, tasks.get(i).getValue(), tasks.get(i).isCompleted());
            System.out.println();
        }
    }

    public int getSize() {
        return this.tasks.size();
    }
}
