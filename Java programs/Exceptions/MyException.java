package Exceptions;

public class MyException {
    public static void main(String[] args) {
        int nr1 = 10;
        int nr2 = 0;
        try {
            System.out.println("Impartire "+nr1/nr2);
        } catch(ArithmeticException MyException) {
            System.out.println("Exceptie Aritmerică");
        }
    }
}
