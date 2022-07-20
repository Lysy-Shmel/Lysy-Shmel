import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        System.out.println("Kol-vo zvezd: ");
        int s = scan.nextInt();
        System.out.println("Kol-vo strok: ");
        int ss = scn.nextInt();
        int i = 0;
        int ii = 1;
        char n = '*';
        while (ss >= ii) {
            System.out.println(" ");
            while (s > i) {
                System.out.print(n + " ");
                i++;
            }
            ii++;
            i -= s;

        }
        int b = sn.nextInt();
        int o = 0;
        while (b > o) {

        }
    }
}
