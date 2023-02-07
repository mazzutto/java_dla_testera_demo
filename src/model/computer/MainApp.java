package model.computer;

public class MainApp {
    public static void main(String[] args) {
        Ram ram1=new Ram("Samsung", 128);
        Ram ram2=new Ram("Apple", 256);
        Hdd hdd1=new Hdd("Western Digital", 1500);
        Hdd hdd2=new Hdd("Seagate", 1100);

        Computer homePC = new PC("Home PC", "Dell", new Ram("Patriot", 2000), new Hdd("Seagate", 1000), false);
        Computer homePC2 = new PC("Home PC2", "Asus", ram1, hdd1, false);
        Computer homePC3 = new PC("Home PC3", "IBM", ram2, hdd2, false);
        Computer laptopPC = new Laptop("Laptop PC", "Acer", ram1, hdd2, 5);
        Computer laptopPC2 = new Laptop("Laptop PC2", "Fujitsu", ram2, hdd1, 10);
        Laptop laptopPC3 = new Laptop("Laptop PC3", "HP",new Ram("GoodRam", 16), new Hdd("IBM", 3500), 75 );

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

        laptopPC3.playMusic();
        laptopPC3.stopMusic();
        laptopPC3.pauseMusic();
        laptopPC3.sayHello();

        System.out.println(homePC);
        System.out.println(homePC2);
    }


}
