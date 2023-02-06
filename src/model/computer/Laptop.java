package model.computer;

public class Laptop extends Computer {
    public Laptop(String name, String type, int ram, int hdd) {
        super(name, type, ram, hdd);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery");
        System.out.println("Laptop is switched on");
        super.switchOn();
    }
}
