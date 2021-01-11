//import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);  
        int nr_1 = 4; //scan.nextInt();
        int nr_2 = 3; //scan.nextInt();
        int nr_3 = 1; //scan.nextInt();
        int p = nr_1*nr_2*nr_3;
        //scan.close();
        if(p>0) {
            if(nr_2>nr_3) System.out.print(nr_2);

            else System.out.print(nr_3);

        }
        else System.out.print(nr_1+nr_2);

    }

}