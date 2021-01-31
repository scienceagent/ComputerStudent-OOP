package Exceptions;

public class Exception {
    static int divideZero(int a, int b){
        int i = a/b;
        return i;
    }

    static int comptDivison(int a, int b) {
        int res = 0 ;
        try {
            res = divideZero(a, b);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        return res; 
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
             divideZero(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
