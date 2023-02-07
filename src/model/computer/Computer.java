package model.computer;

abstract public class Computer {
    protected String name;
    protected String type;
    protected Ram ram;
    protected Hdd hdd;
    protected boolean state;
    protected int volume;


    public Computer(String name, String type, Ram ram, Hdd hdd) {
        this.name = name;
        this.type = type;
        this.ram = ram;
        this.hdd = hdd;
        this.state = false;
        this.volume = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void switchOn() {
        state = true;
    }

    public void switchOff() {
        state = false;
    }

    public boolean getState() {
        return state;
    }
    public abstract int volumeUp();
    public abstract int volumeDown();
    public int volumeUp(int i) {

        if (volume +i > 100) {
            return volume = 100;
        } else {
            return volume+i;
        }
    }
    public int volumeDown(int i) {
        if (volume - i < 0) {
            return volume = 0;
        } else {
            return volume - i;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", state=" + state +
                ", volume=" + volume +
                '}';
    }
}
