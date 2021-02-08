package Laborator4;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;

public class Pacient {
    String cnp, nume, diagnoza, medic;
    int salon;
    public Pacient(String cnp,
    String nume, 
    String diagnoza, 
    String medic,
    int salon){
        this.cnp = cnp;
        this.nume = nume;
        this.diagnoza = diagnoza;
        this.medic = medic;
        this.salon = salon;
    }
    static void delete() throws IOException{
        FileWriter fw = new FileWriter("file.txt");
        fw.close();
    }

    static void read(String s) throws IOException{
        FileWriter fw = new FileWriter("file.txt",true);
        fw.write(s+"\r\n");
        System.out.println(s);
        fw.close();
    }

    static ArrayList<Pacient> read(int n) throws IOException{
        ArrayList<Pacient> p = new ArrayList<Pacient>();
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("----> Pacientul "+(i+1)+" <------");
            System.out.print("Enter CNP: ");
            String cnp = cin.next();
            System.out.print("Enter numele: ");
            String nume = cin.next();
            System.out.print("Enter diagnoza: ");
            String diagnoza = cin.next();
            System.out.print("Enter medicul: ");
            String medic = cin.next();
            System.out.print("Enter salonul: ");
            int salon = cin.nextInt();
            p.add(new Pacient(cnp, nume, diagnoza, medic, salon));
        }
        cin.close();
        return p;
    }

    static void AfisareSalon(ArrayList<Pacient> pacienti,int sa) throws IOException{
        read("Pacientii din salonu "+sa+": ");
        for (Pacient i : pacienti) 
            if (i.salon == sa) 
                read(i.cnp+" "+i.nume+" diagnoz "+i.diagnoza+" medic:"+i.medic);;
                read(" ");

    }

    static void AfisareDiagnoz(ArrayList<Pacient> pacienti, String diagnoza, String medic) throws IOException{
        read("Pacientii cu diagnozul "+diagnoza+": ");
        for (Pacient i : pacienti) 
            if (i.diagnoza.equals(diagnoza) && i.medic.equals(medic)) 
            read(i.cnp+" "+i.nume+" salon:"+i.salon);
    }

    static void AfisarePacient(ArrayList<Pacient> pacienti, String s) throws IOException{
        read("Pacientul : "+s+": ");
        for (Pacient i : pacienti) 
            if(i.cnp.equals(s))
            read(i.nume+" diagnoz "+i.diagnoza+" salon:"+i.salon+" medic:"+i.medic);
        read("");
    }

    static void Afisare(ArrayList<Pacient> pacienti) throws IOException{
        for (Pacient i : pacienti) 
            read(i.cnp+" "+i.nume+" diagnoz "+i.diagnoza+" salon:"+i.salon+" medic:"+i.medic);
            read("");
    }


    public static void main(String[] args) throws IOException {
        Pacient.delete();
        ArrayList<Pacient> pacienti = new ArrayList<Pacient>();
        pacienti.add(new Pacient("901212","Ion","Gripa","Constantin",4));
        pacienti.add(new Pacient("892124","Cristi","COVID-19","Dumitru",81));
        pacienti.add(new Pacient("782157","Alin","Gripa","Vasile",10));
        Pacient.AfisareSalon(pacienti, 10);
        Pacient.AfisarePacient(pacienti, "782157");
        Pacient.AfisareDiagnoz(pacienti, "Gripa", "Dumitrescu");
    }
}
