package Laborator3;
import java.util.Scanner;

    class Persoana {
    private String nume, prenume;
    private int varsta;
    Persoana(){}
    Persoana(String nume, String prenume, int varsta){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public String getNume() {
        return nume;
    }
    public String getPrenume(){ 
        return prenume;
    }
    public int getVarsta(){
        return varsta;
    }
    public void detalii() {
        System.out.println(nume+ " "+prenume+" "+varsta);
    } }

    public class TestPersoana {
    static int nrMinori(Persoana[] p){
        int nr=0;
        for(int i= 0;i<p.length;i++) 
            if (p[i].getVarsta()<18)
                nr++;
             {
                return nr;
            }
    }

    static int nrMajori(Persoana[] m){
        int nrAd = 0;
        for(int i=0;i<m.length;i++)
        if (m[i].getVarsta()>18)
        nrAd++; {
            return nrAd;
        }
    }
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            System.out.print("Cate persoane are lista : ");
        int n = cin.nextInt();
            Persoana[] persoane = new Persoana[n];
            for(int i = 0;i<n;i++){
                System.out.println("Enter datele persoanei >>> "+(i+1));
                System.out.print("Nume: ");
                String nume = cin.next();
                System.out.print("Prenume : ");
                String prenume = cin.next();
                System.out.print("Varsta : ");
                int varsta = cin.nextInt();
                persoane[i] = new Persoana(nume, prenume, varsta);
                cin.nextLine();
            }
            cin.close();
            System.out.println("<<<Persoanele din lista >>>");
            for(Persoana i:persoane)
                i.detalii();
                System.out.println("---------------------");
                int minori = nrMinori(persoane);
                int majori = nrMajori(persoane);
                System.out.println("Minori sunt "+minori+" persoane");
                System.out.println("Majori sunt "+majori+" persoane");
                if(minori>majori) {
                    System.out.println("Minori sunt mai multi");
                }
                else System.out.println("Majori sunt mai multi");
            
            /*
            Persoana[] persoane = new Persoana[4];
            persoane[0] = new Persoana("Creanga","Ion",35);
            persoane[1] = new Persoana("Eminescu","Mihai",15);
            persoane[2] = new Persoana("Alecsandri","Vasile",10);
            persoane[3] = new Persoana("Donici","Aleco",18);

            for(int i=0;i<persoane.length;i++)
            persoane[i].detalii();;
            System.out.println("--------------");
            int minori = nrMinori(persoane);
            System.out.println("Minori sunt "+minori+" persoane."); */
        }
    }

