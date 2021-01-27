public class Automobil {
    String denumire;
    String CompProducator;
    int nrPasageri;
    int anProducere;
    String culoare;
    int nrUsi;
    String rezervor;
    float viteza;
    String aerConditionat;
    int pret;

    public Automobil(String denumire,
    String CompProducator,
    int nrPasageri,
    int anProducere,
    String culoare,
    int nrUsi,
    String rezervor,
    int viteza,
    String aerConditionat,
    int pret ) {

        this.denumire = denumire;
        this.CompProducator = CompProducator;
        this.nrPasageri = nrPasageri;
        this.anProducere = anProducere;
        this.culoare = culoare;
        this.nrUsi = nrUsi;
        this.rezervor = rezervor;
        this.viteza = viteza;
        this.aerConditionat = aerConditionat;
        this.pret = pret;

    }

    public String setDenumire(String denumire){
        return denumire;
    }

    public String setCompProducator(String CompProducator){
        return CompProducator;
    }

    public int setNrPasageri(int nrPasageri){
        return nrPasageri;
    }

    public int setanProducere(int anProducere){
        return anProducere;
    }

    public String setCuloare(String culoare){
        return culoare;
    }
    
    public int setnrUsi(int nrUsi){
        return nrUsi;
    }

    public String setrezervor(String rezervor){
        return rezervor;
    }

    public int setViteza(int viteza){
        return viteza;
    }

    public String setAerConditionat(String aerCoditionat){
        return aerCoditionat;
    }

    public int setPret(int pret){
        return pret;
    }


    public String getDenumire(String denumire){
        return denumire;
    }

    public String getCompProducator(String CompProducator){
        return CompProducator;
    }

    public int getNrPasageri(int nrPasageri){
        return nrPasageri;
    }

    public int getanProducere(int anProducere){
        return anProducere;
    }

    public String getCuloare(String culoare){
        return culoare;
    }
    
    public int getnrUsi(int nrUsi){
        return nrUsi;
    }

    public String getrezervor(String rezervor){
        return rezervor;
    }

    public int getViteza(int viteza){
        return viteza;
    }

    public String getAerConditionat(String aerCoditionat){
        return aerCoditionat;
    }

    public int getPret(int pret){
        return pret;
    }

    public static void main(String[] args) {
        Automobil a1 = new Automobil("BMW","Germania",2,201,"albastra",2,"diesel",120,"Da",500);
        System.out.println("Denumire="+a1.denumire+"CompProducator="+a1.CompProducator+"\nNumarul Pasageri="+a1.nrPasageri+"\nAnProducator="+a1.anProducere+"\nCuloare="+a1.culoare+"\nNrUsi="+a1.nrUsi+"\nRezervor="+a1.rezervor+"\nViteza="+a1.viteza+"\nAerconditionar="+a1.aerConditionat+"\nPret="+a1.pret);
    }
}
