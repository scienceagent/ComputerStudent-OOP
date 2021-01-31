package Exceptions;
public class Exceptie{
    public static void main(String[] args) {
        int[] s = {1,2,3,4};
        try{
            System.out.println(s[6]);
        } catch (IndexOutOfBoundsException Exceptie) {
            System.out.println("nu avem asa indice pentru tablou!");
        }
        System.out.println(s[0]);
    }
}