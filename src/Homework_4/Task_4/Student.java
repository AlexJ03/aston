package Homework_4.Task_4;

import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    public Rating rating;

    public Student(String name, String group, int course, Rating rating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;
    }

    public static class Rating {
        private Map<String, Integer> rating;

        public Rating(String[] subjects, int[] scores) {
            this.rating = new HashMap<>();

            for (int i = 0; i < subjects.length; i++) {
                this.rating.put(subjects[i], scores[i]);
            }
        }

        public Map<String, Integer> getRating() {
            return this.rating;
        }

        public void addSubject(String subject, int score) {
            this.rating.put(subject, score);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    /**
     * Данный метод проверяет, есть ли у студента предметы, по которым балл ниже 3.
     *
     * @return {@code true}, если все оценки 3 и выше, иначе {@code false}
     */
    public boolean checkRating() {
        Map<String, Integer> currentRating = this.rating.getRating();

        for (Map.Entry<String, Integer> entry : currentRating.entrySet()) {
            int score = entry.getValue();

            if (score < 3) {
                return false;
            }
        }

        return true;
    }

    /**
     * Удаляет студентов с плохой успеваемостью.
     *
     * @param students список студентов, которых нужно проверить
     * @return список студентов, у которых нет оценок ниже 3
     */
    public static List<Student> expel(List<Student> students) {
        List<Student> newStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.checkRating()) {
                newStudents.add(student);
            }
        }

        return newStudents;
    }

    /**
     * Печатает имя студента.
     */
    public void print() {
        System.out.printf("Name: %s \n", this.getName());
    }


    /**
     * Печатает имена студентов, которые обучаются на переданном курсе.
     *
     * @param students список студентов для печати
     * @param course   номер курса
     */
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                student.print();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(rating, student.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, rating);
    }
}
