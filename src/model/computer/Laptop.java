package model.computer;

public class Laptop extends Computer implements Music, Video {

    private int batteryLevel;

    public Laptop(String name, String type, Ram ram, Hdd hdd, int batteryLevel) {
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


    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music");
    }

    @Override
    public void playVideo() {
        System.out.println("Pausing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Pausing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausing video");
    }
    public void sayHello() {
        Music.super.sayHello();
    }


}