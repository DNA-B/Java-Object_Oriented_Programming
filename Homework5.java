class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.printf(" Size: %s\n", this.monitorSize);
        System.out.printf(" Color: %s\n", this.color);
        System.out.printf(" Power: %s\n", this.power);
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.printf(" CPU: %s\n", this.cpu);
        System.out.printf(" Memory: %s\n", this.memory);
        System.out.printf(" HDD: %s\n", this.hd);
        System.out.printf(" Color: %s\n", this.color);
        System.out.printf(" Power: %s\n", this.power);
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn() {
        this.computer.turnOn();
        this.monitor.turnOn();
    }

    public void printInfo() {
        this.computer.printInfo();
        this.monitor.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("32 inch", "Black", "45W");
        Computer computer = new Computer("Core i7", "32GB", "2TB", "White", "700W");
        PersonalComputer pc = new PersonalComputer(computer, monitor);

        pc.turnOn();
        pc.printInfo();
    }
}
