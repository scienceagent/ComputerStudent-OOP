public class ex8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int rez = 1;

        for(int i=1;i<b;i++) {
             rez *= a ;
        }
        
        System.out.println("Puterea unei puteri = " + rez);
    }
}
