package Laborator4;
import java.io.*;
import java.util.*;

class Elev{
    String nume,prenume,grupa;
    int nr_absente;
    double media;

   public Elev(){}

    public Elev(String nume,
    String prenume,
    String grupa,
    int nr_absente,
    double media){
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.nr_absente = nr_absente;
        this.media = media;
    }
    

}

public class TestElev{

    static void scriere(ArrayList<Elev> e) throws IOException{
        FileWriter fc = new FileWriter("iesire.txt");
        for (Elev i : e) 
            fc.write(i.nume+" "+i.prenume+" "+i.grupa+" "+i.nr_absente+" "+i.media+" \n");
        fc.close();
    }

    static  ArrayList<Elev> citire() throws IOException{
        // citirea cu Scanner
  /*      ArrayList<Elev> e = new ArrayList<Elev>();
        Scanner cin = new Scanner(System.in); 
        System.out.println("Enter numarul de elevi: ");
        int n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter datele despre studentul cu nr "+(i+1));
            System.out.print("Entar numele: ");
            String nume = cin.next();
            System.out.print("Enter prenumele: ");
            String prenume = cin.next();
            System.out.print("Enter grupa: ");
            String grupa = cin.next();
            System.out.print("Enter nr de absente: ");
            int nr_absente = cin.nextInt();
            System.out.print("Enter media : ");
            double media = cin.nextDouble();
            e.add(new Elev(nume,prenume,grupa,nr_absente,media));
            scriere(e);
        }
        cin.close();
        return e;*/

        ArrayList<Elev> e = new ArrayList<Elev>();
        Scanner filScanner = new Scanner(new FileReader("iesire.txt"));
        while (filScanner.hasNext()) {
            String nume = filScanner.next();
            String prenume = filScanner.next();
            String grupa = filScanner.next();
            int absente = filScanner.nextInt();
            double media = Double.parseDouble(filScanner.next());
            e.add(new Elev(nume,prenume,grupa,absente,media));
        }
        filScanner.close();
        return e; 
    }

    static void ElevGrupa(ArrayList<Elev> l) throws IOException{
        String aux = "P1921";
        for (Elev i : l) {
            if(i.grupa.equals(aux))
            System.out.println(i.nume+" "+i.prenume+" "+i.grupa+" "+i.nr_absente+" "+i.media);
        }
    }

    static void CelMaiDestept(ArrayList<Elev> y) throws IOException{
        double aux_med = 0;
        for (Elev i : y) 
            if(i.media > aux_med) {
                aux_med = i.media;
                System.out.println(i.nume+" "+i.prenume+" "+i.grupa+" "+i.nr_absente+" "+i.media);
            }
        } 
        
        static void celMaiExemplar(ArrayList<Elev> lista) throws IOException {
                Elev m = lista.get(0);
                for(Elev i:lista)
                    if(i.nr_absente<m.nr_absente){
                        m=i;
                    }                            
             System.out.println(m.nume+" "+m.prenume+" "+m.grupa+" "+ m.media+" "+m.nr_absente);
 }
    

    public static void main(String[] args) throws IOException{
        ArrayList<Elev> e = new ArrayList<Elev>();
        e.add(new Elev("Octavian","Cirnat","P1921",2,9.5));
        e.add(new Elev("Grigore","Raevschi","P1921",3,8.7));
        e.add(new Elev("Ion","Pintea","P1922",5,8.5));
        scriere(e); 

        ArrayList<Elev> citire = new ArrayList<Elev>();
        citire = citire();

        for (Elev i : citire) 
            System.out.println(i.nume+" "+i.prenume+" "+i.grupa+" "+i.nr_absente+" "+i.media);
            System.out.println("===============================");
            System.out.println("Elevii din P1921 sunt: "+"\n");
            ElevGrupa(citire); System.out.println("\n");
            System.out.println("===============================");
            System.out.println("Datele elevului cu cea mai mare medie generala: "+"\n");
            CelMaiDestept(citire); System.out.println("\n");
            System.out.println("==============================="+"\n");
            System.out.println("Datele elevului cel mai exemplar: "+"\n");
            celMaiExemplar(citire); System.out.println("\n");

    }
}