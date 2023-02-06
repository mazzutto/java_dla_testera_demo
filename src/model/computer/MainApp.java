package model.computer;

public class MainApp {
    public static void main(String[] args) {

        PC homePC = new PC("Home PC", "Dell", 16, 500);
        Laptop laptopPC = new Laptop("Laptop PC", "Acer", 8, 1000);

        homePC.switchOn();
        laptopPC.switchOn();
        System.out.println(homePC.state);
        System.out.println(laptopPC.state);

    }


}
