public class Main {
    public static void main(String[] args) {
        int x = 48;
        int y = 2;
        int z = 6;
        int w = 84;
        boolean isTrue;
        boolean isFalse;

        if ((x + y) % 2 == 0) {
            System.out.println("suma x+y jest parzysta");
            isTrue = true;
        } else {
            System.out.println("suma x+y jest nieparzysta");
            isTrue = false;
        }if ((z + w) % 2 == 0) {
            System.out.println("suma z+w jest parzysta");
            isFalse = true;
        } else {
            System.out.println("suma z+w jest nieparzysta");
            isFalse = false;
        }
        if (isFalse && isTrue) {
            System.out.println("Wszystkie są parzyste");
        }else {
            System.out.println("Nie wszystkie są parzyste");
        }

    }
}