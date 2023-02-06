package model.computer;

public class Computer {
    protected String name;
    protected String type;
    protected int ram;
    protected int hdd;
    protected boolean state;


    public Computer(String name, String type, int ram, int hdd) {
        this.name = name;
        this.type = type;
        this.ram = ram;
        this.hdd = hdd;
        this.state = false;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
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
}
