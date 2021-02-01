package Laborator3;


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
            if (p[i].getVarsta()<18)nr++; {
                return nr;
            }
    }
        public static void main(String[] args) {
            Persoana[] persoane = new Persoana[4];
            persoane[0] = new Persoana("Creanga","Ion",35);
            persoane[1] = new Persoana("Eminescu","Mihai",15);
            persoane[2] = new Persoana("Alecsandri","Vasile",10);
            persoane[3] = new Persoana("Donici","Aleco",18);

            for(int i=0;i<persoane.length;i++)
            persoane[i].detalii();;
            System.out.println("--------------");
            int minori = nrMinori(persoane);
            System.out.println("Minori sunt "+minori+" persoane.");
        }
    }

