package model.computer;

public interface Video {
    String NAME = "Video";

    void playVideo();
    void stopVideo();
    void pauseVideo();
    default void sayHello() {
        System.out.println("Hello, I'm " + NAME);
    }
}
