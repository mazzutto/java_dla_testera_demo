package model.computer;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int ram, int hdd, int batteryLevel) {
        super(name, type, ram, hdd);
        this.batteryLevel = batteryLevel;
    }


    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 10) {
            System.out.println("Laptop is switching on");
            super.switchOn();
        } else {
            System.out.println("Bettery level too low");
        }
    }
    public int volumeUp() {
        return volume += 10;
    }


    public int volumeDown() {
        return volume -= 15;
    }



}