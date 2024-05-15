// Demo

public class Main {
    public static void main(String[] args) {
        TodoList school = new TodoList("Университет");

        school.changeName("Школа");

        System.out.println(school.getName()); // Школа

        school.addTask();
        school.addTask("Написать реферат");
        school.addTask("Подготовиться к тесту");

        school.getTask(1).toComplete();

        school.getTask(school.getSize() - 1).changeValue("Подготовиться к контрольной");

        school.removeTask(0);

        school.printTasks();
    }
}