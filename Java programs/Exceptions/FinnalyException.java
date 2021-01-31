package Exceptions;

public class FinnalyException {
    public static void main(String[] args) {
        int a[] = new int[2];
        try {
            System.out.println("Accesara elementului : "+a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceptia : "+ e);
        }
        finally {
            a[0] = 8;
            System.out.println("Primul element: "+a[0]);
            System.out.println("Aceasta parte se executa");
        }
    }
}
