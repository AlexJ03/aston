package Homework_1.Task_1;

public class TodoTask {
    private static final String DEFAULT_VALUE;

    private String value;
    private boolean isCompleted;

    static {
        DEFAULT_VALUE = "-";
    }

    {
        this.isCompleted = false;
    }

    public TodoTask() {
        this(DEFAULT_VALUE);
    }

    public TodoTask(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void changeValue(String value) {
        this.value = value;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void toComplete() {
        this.isCompleted = true;
    }

    public void changeStatus() {
        this.isCompleted = !this.isCompleted;
    }
}
