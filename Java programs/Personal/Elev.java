public class Elev {
    String nume;
    String prenume;
    String patronomicul;
    int varsta;
    String gen;
    int nrAbsente;
    float notaMedie;
// crearea constructorului
    public Elev(
    String nume,
    String prenume,
    String patronomicul,
    int varsta,
    String gen,
    int nrAbsente,
    float notaMedie )
                     { //referinta
        this.nume = nume;
        this.prenume = prenume;
        this.patronomicul = patronomicul;
        this.varsta = varsta;
        this.gen = gen;
        this.nrAbsente = nrAbsente;
        this.notaMedie = notaMedie;
    }
//setter
    public String setNume(String nume) {
        return nume;
    }
    public String setPrenume(String prenume) {
        return prenume;
    }
    public String setPatronomicul(String patronomicul) {
        return patronomicul;
    }
    public int setVarsta(int varsta) {
        return varsta;
    }
    public String setGen(String gen) {
        return gen;
    }
    public int setnrAbsente(int nrAbsente) {
        return nrAbsente;
    }
    public float setnotaMedie(float notaMedie) {
        return notaMedie;
    }
//getter
    public String getNume(String nume) {
        return nume;
    }
    public String getPrenume(String prenume) {
        return prenume;
    }
    public String getPatronomicul(String patronomicul) {
        return patronomicul;
    }
    public int getVarsta(int varsta) {
        return varsta;
    }
    public String getGen(String gen) {
        return gen;
    }
    public int getnrAbsente(int nrAbsente) {
        return nrAbsente;
    }
    public float getnotaMedie(float notaMedie) {
        return notaMedie;
    }
//subprogram return purtarea in dependeta de nr de absente
    public String purtare() {
        if(nrAbsente<=8) return "Excelenta";
        else if(nrAbsente<=20) return "Foarte Buna";
        else if(nrAbsente<=30) return "Purtarea Buna";
        else return "Satisfacatoare";
    }
//subprogram return bursa in dependenta de nota medie
    public float bursa() {
        if(notaMedie<5) return 0;
        else if(notaMedie<7) return 100;
        else if(notaMedie<8) return 20*notaMedie;
        else if(notaMedie<10) return 25*notaMedie;
        else return 300;
    }

    public static void main(String[] args) {
        Elev e1 = new Elev("Tom","Jerry","Linus",22,"M",10,9);
        Elev e2 = new Elev("Roxana","Bercaru","Vasile",8,"F",4,10);
        Elev e3 = new Elev("Octavian","Carnat","Tudor",24,"M",20,8);
        Elev e4 = new Elev("Cristi","Finica","Ion",30,"M",23,7);
        Elev e5 = new Elev("Adrian","Tacu","Fedea",21,"M",0,10);
        Elev e6 = new Elev("Igor","Mungiu","Dorin",13,"M",30,5);
        Elev e7 = new Elev("Ion","Cebotari","Sergiu",1,"M",50,4);
        Elev e8 = new Elev("Anastasia","Ciuperca","Cristi",16,"F",1,10);
        Elev e9 = new Elev("Gheorghe","Paraschiv","Marius",24,"M",29,8);
        Elev e10 = new Elev("Dan","Alexei","Alin",8,"M",15,7);

        String newline = System.lineSeparator();

        System.out.println("Numele = "+e1.nume+newline+"Prenumele = "+e1.prenume+newline+"Patronomicul = "+e1.patronomicul+newline+"Varsta = "+e1.varsta+newline+"Gen = "+e1.gen+newline+"Numarul abente = "+e1.bursa()+newline+"Nota medie = "+e1.purtare());
        System.out.println("");
        System.out.println("Numele = "+e2.nume+newline+"Prenumele = "+e2.prenume+newline+"Patronomicul = "+e2.patronomicul+newline+"Varsta = "+e2.varsta+newline+"Gen = "+e2.gen+newline+"Numarul abente = "+e2.bursa()+newline+"Nota medie = "+e2.purtare());                                                                    
        System.out.println("");
        System.out.println("Numele = "+e3.nume+newline+"Prenumele = "+e3.prenume+newline+"Patronomicul = "+e3.patronomicul+newline+"Varsta = "+e3.varsta+newline+"Gen = "+e3.gen+newline+"Numarul abente = "+e3.bursa()+newline+"Nota medie = "+e3.purtare());
        System.out.println("");
        System.out.println("Numele = "+e4.nume+newline+"Prenumele = "+e4.prenume+newline+"Patronomicul = "+e4.patronomicul+newline+"Varsta = "+e4.varsta+newline+"Gen = "+e4.gen+newline+"Numarul abente = "+e4.bursa()+newline+"Nota medie = "+e4.purtare());
        System.out.println("");
        System.out.println("Numele = "+e5.nume+newline+"Prenumele = "+e5.prenume+newline+"Patronomicul = "+e5.patronomicul+newline+"Varsta = "+e5.varsta+newline+"Gen = "+e5.gen+newline+"Numarul abente = "+e5.bursa()+newline+"Nota medie = "+e5.purtare());
        System.out.println("");
        System.out.println("Numele = "+e6.nume+newline+"Prenumele = "+e6.prenume+newline+"Patronomicul = "+e6.patronomicul+newline+"Varsta = "+e6.varsta+newline+"Gen = "+e6.gen+newline+"Numarul abente = "+e6.bursa()+newline+"Nota medie = "+e6.purtare());
        System.out.println("");
        System.out.println("Numele = "+e7.nume+newline+"Prenumele = "+e7.prenume+newline+"Patronomicul = "+e7.patronomicul+newline+"Varsta = "+e7.varsta+newline+"Gen = "+e7.gen+newline+"Numarul abente = "+e7.bursa()+newline+"Nota medie = "+e7.purtare());
        System.out.println("");
        System.out.println("Numele = "+e8.nume+newline+"Prenumele = "+e8.prenume+newline+"Patronomicul = "+e8.patronomicul+newline+"Varsta = "+e8.varsta+newline+"Gen = "+e8.gen+newline+"Numarul abente = "+e8.bursa()+newline+"Nota medie = "+e8.purtare());
        System.out.println("");
        System.out.println("Numele = "+e9.nume+newline+"Prenumele = "+e9.prenume+newline+"Patronomicul = "+e9.patronomicul+newline+"Varsta = "+e9.varsta+newline+"Gen = "+e9.gen+newline+"Numarul abente = "+e9.bursa()+newline+"Nota medie = "+e9.purtare());
        System.out.println("");
        System.out.println("Numele = "+e1.nume+newline+"Prenumele = "+e10.prenume+newline+"Patronomicul = "+e10.patronomicul+newline+"Varsta = "+e10.varsta+newline+"Gen = "+e10.gen+newline+"Numarul abente = "+e10.bursa()+newline+"Nota medie = "+e10.purtare());


    }
}
