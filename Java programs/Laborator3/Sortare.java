package Laborator3;
import java.util.ArrayList;
import java.util.Scanner;

public class Sortare {
    
    private static int n;

    public static void main(String[] args) {
    ArrayList <Integer> pare=new ArrayList<>();
    ArrayList <Integer> impare=new ArrayList<>();

    System.out.println("Enter numere:");
    try (Scanner cin = new Scanner(System.in)) {
        n = cin.nextInt();
    while(n!=0){
        if(n%2==0) pare.add(n);
        else impare.add(n);
         n=cin.nextInt();
    } 
    cin.close();
    System.out.print("Lista de numere pare: ");
    for(int i:pare) 
        System.out.print(i+" ");

    System.out.print("\nLista de numere impare: ");
    for(int i:impare)
        System.out.print(i+" ");
        
    } catch(java.util.InputMismatchException Numere) {
        System.out.println("Enter numere intregi");
    }
   
    }
}