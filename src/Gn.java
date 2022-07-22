import java.util.Random;

public class Gn {
    public static void main(String[] args) {

        int y = 10;
        int[] j = new int[y];
        Random r = new Random();
        int summa = 0;
        for (int c : j) {
            c = r.nextInt(1, 100);
            summa += c;
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println(summa + " -");
            int il = 0;
            while (il < 10) {
                il += 1;
                System.out.println(il);
            }
            System.out.println("");
            int yu = 1;
            while (yu < 17) {
                yu += 2;
                System.out.print(yu + " ");
            }
            int ii = 0;
            while (ii < 10) {
                ii += 2;
                System.out.print(" " + ii);
            }
            System.out.println("");
            int iii = 1;
            int b = 0;
            while (b < 10) {
                iii += 1;
                b = iii * iii;
                System.out.print(" " + b);
                b /= iii;
            }
            int p = 0;
            System.out.println("");
            while (p < 9) {
                System.out.print(1 + " ");
                System.out.print(-1 + " ");
                p += 1;
            }
            System.out.println("");

    }
}