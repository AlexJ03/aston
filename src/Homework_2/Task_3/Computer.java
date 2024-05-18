package Homework_2.Task_3;

public class Computer {

    static class Processor {
        private String model;

        public Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return "Processor: " + this.model;
        }
    }

    class RAM {
        private int size;

        public RAM(int size) {
            this.size = size;
        }

        public String getDetails() {
            return "RAM: " + this.size + "GB";
        }
    }

    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i3-10100");
        System.out.println(processor.getDetails());

        Computer computer = new Computer();
        Computer.RAM ram = computer.new RAM(8);
        System.out.println(ram.getDetails());
    }
}
