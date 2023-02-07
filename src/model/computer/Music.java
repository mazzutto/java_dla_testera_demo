package model.computer;

public interface Music {
    String NAME = "Music";

    void playMusic();
    void stopMusic();
    void pauseMusic();
    default void sayHello() {
        System.out.println("Hello, I'm " + NAME);
    }
}
