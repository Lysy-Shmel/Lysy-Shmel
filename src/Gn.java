public class Gn {
    public static void main(String[] args) {

        int y = 5;
        int []j = new int[y];

        j[0]=7;
        j[1]=14;
        j[2]=21;
        j[3]=28;
        j[4]=31;

        System.out.println();
        for( int i = 0; i < j.length; i++){
            System.out.println(j[i]);
        }
        System.out.println("Max: " + j[4] + " , min: " + j[0]);
        int summa= j[0] + j[1] + j[2] + j[3] + j[4];
        double srAr = (double) summa / y;
        System.out.println(summa);
        System.out.println(srAr);

        }
    }
