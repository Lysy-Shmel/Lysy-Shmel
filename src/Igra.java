import java.util.Random;
import java.util.Scanner;

public class Igra {
    public static void main(String[] args) { Random rm = new Random(); Random rnm = new Random(); Scanner scnn = new Scanner(System.in); Scanner scnr = new Scanner(System.in);
        Scanner sn = new Scanner(System.in); Scanner scn = new Scanner(System.in); Random rdm = new Random(); Random rndm = new Random();

        System.out.println("Please, enter your name: ");
        int i = 0;
        String a = sn.next();
        System.out.println("Hello, " + a + ". Let's start.");
        int b = rm.nextInt(20, 999);
        int bb = rnm.nextInt(20, 999);
        System.out.println("Reshite primer: " + b + " + " + bb);
        int cc = b + bb;
        int c =  scn.nextInt();
        if (c == cc ) {
            System.out.println("Molodec!!!!!");
            i+=1;
        } else {
            System.out.println("Ne pravilno.");
        }
        int bbb = rm.nextInt(200, 9999);
        int bbbb = rnm.nextInt(200, 9999);
        System.out.println(bbb + " + " + bbbb);
        int ccc = bbbb + bbb;
        int cccc = scnn.nextInt();
        if (ccc == cccc) {
            System.out.println("Verno!");
            i+=1;
        }else {
            System.out.println("Ne verno...");
        }
        System.out.println("FORTINITE ILI BABAJI?");
        System.out.println("1.FORTINITE");
        System.out.println("2.BABAJI");
        int aa = scnr.nextInt();
        int ab = 2;
        if (aa == ab) {
            System.out.println("Pravilno!!!!!!!");
            i+=1;
        } else {
            System.out.println("Pozer :( ");
        }
        System.out.println("U tebya " + i + " balla iz 3");
        if (i == 3) {
            System.out.print(" Ty otvetil na vsyo pravilno!");
        }
    }
}
