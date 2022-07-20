import java.util.Scanner;

public class nvl {
    public static void main(String[] args) {
        int m = 0;
        while (m == 0) {
            m+=1;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String a = s.next();
            System.out.println("Ok, " + a + " ,let's start.");
            System.out.println("Vy golodny. U vas est' 4 varianta: ");
            System.out.println("1. Dobyt' kokos");
            System.out.println("2. Poymat' craba");
            System.out.println("3. Nayti fructy");
            System.out.println("4. Dobyt' vodu");
        }
    }
}