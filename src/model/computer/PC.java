package model.computer;

public class PC extends Computer {


    public PC(String name, String type, int ram, int hdd) {
        super(name, type, ram, hdd);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking Power");
        System.out.println("Switching On");
        super.switchOn();
    }
}

