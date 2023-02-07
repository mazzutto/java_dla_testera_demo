package model.computer;

public class MainApp {
    public static void main(String[] args) {

        Computer homePC = new PC("Home PC", "Dell", 16, 500, false);
        Computer homePC2 = new PC("Home PC2", "Asus", 16, 500, false);
        Computer homePC3 = new PC("Home PC3", "IBM", 16, 500, false);
        Computer laptopPC = new Laptop("Laptop PC", "Acer", 8, 1000, 5);
        Computer laptopPC2 = new Laptop("Laptop PC2", "Fujitsu", 8, 1000, 10);


        Computer[] computers = {homePC, homePC2, homePC3, laptopPC, laptopPC2};
        for (Computer i : computers) {
            System.out.println(i.name);
        }



        homePC.switchOn();
        laptopPC.switchOn();
        System.out.println(homePC.state);
        System.out.println(laptopPC.state);

        ((PC)homePC).setPowerSuply();
        homePC.switchOn();
        System.out.println(homePC.volumeUp(120));
        System.out.println(homePC.volumeDown());
        System.out.println(laptopPC.volumeUp(5));
        System.out.println(laptopPC2.volumeDown(120));
        System.out.println(laptopPC2.volumeUp());

    }


}
