package Laborator3;
import java.util.*;

class Student{
    String nume;
    int an;
    String grupa;
    int nota_1, nota_2;

    public Student(String nume, int an, String grupa, int nota_1, int nota_2) {
        this.nume = nume;
        this.an = an;
        this.grupa = grupa;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }

    public float Media(){
         return (nota_1 + nota_2 ) / 2;
        
    }

    public void Afisare(){
        System.out.println(nume+" "+an+" "+grupa+" "+Media());
    }

}

public class TestStudent {

    public static void main(String[] args) {
        float max=0;
        Scanner cin = new Scanner(System.in);
        System.out.print("Cati studenti are lista : ");
        int n = cin.nextInt();
        Student[] studenti = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter datele despre "+(i+1)+" student");
            System.out.print("Nume: ");
            String nume = cin.next();
            System.out.print("Anul: ");
            int an = cin.nextInt();
            System.out.print("Grupa: ");
            String grupa = cin.next();
            System.out.print("Prima nota: ");
            int nota_1 = cin.nextInt();
            System.out.print("A doua nota: ");
            int nota_2 = cin.nextInt();
            studenti[i] = new Student(nume, an, grupa, nota_1, nota_2);
            cin.nextLine();
        }
        cin.close();
        System.out.println("Studentii din lista: ");
        for (Student i : studenti) { 
            i.Afisare(); 
        if(i.Media()>max) max=i.Media();
        }
                
            System.out.println("Media cea mai mare : "+max);
        
    }
}
