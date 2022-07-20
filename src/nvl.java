import java.util.Scanner;

public class nvl {
    public static void main(String[] args) {
        int m = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = s.next();
        System.out.println("Ok, " + a + " ,let's start.");
        while (m == 0) {
            m+=1;
            Scanner ss = new Scanner(System.in);
            System.out.println("Vy golodny. U vas est' 4 varianta: ");
            System.out.println("1. Dobyt' kokos");
            System.out.println("2. Poymat' craba");
            System.out.println("3. Nayti fructy");
            System.out.println("4. Dobyt' vodu");
            System.out.println(a + ", print the number of an action what will you choose.");
            int b = ss.nextInt();
            if (b == 1) {
                System.out.println("Vy zalezli na pal'mu, no poskolznulis' i upali. Vy umerli.");
                Scanner k = new Scanner(System.in);
                System.out.println("Will you restart? Print 1 if Yes, print 2 if no");
                int bb = k.nextInt();
                if (bb == 1 ) m-=1;
            } else if (b == 2) {

            } else if (b == 3) {

        }
        }
    }
}