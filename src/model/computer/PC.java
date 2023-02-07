package model.computer;

public class PC extends Computer {

    private boolean powerSuply;
    public PC(String name, String type, Ram ram, Hdd hdd, boolean powerSuply) {
        super(name, type, ram, hdd);
        this.powerSuply = powerSuply;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking Power");
        if (powerSuply) {
            System.out.println("Switching on");
            System.out.println("Switched on");
            super.switchOn();
        }else{
            System.out.println("No power suply");
        }
    }

    public void setPowerSuply() {
        powerSuply = true;
    }
    public int volumeUp() {
    return volume+=5;
    }
    public int volumeDown() {
        return volume -= 10;
    }


}

