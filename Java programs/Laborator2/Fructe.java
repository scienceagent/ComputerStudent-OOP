public class Fructe {
    int pret;
    String producator;

    Fructe(int pret){
        this.pret = pret;
    }

     Fructe(int pret,String producator) {
        this.pret = pret ;
        this.producator = producator;
    }

    public void afisare(){
        System.out.println("Pret="+pret+"\nProducator="+producator);
    }
    
    public static void main(String[] args) {
        Fructe lamaie = new Fructe(45,"Srl");
        lamaie.afisare();
        Fructe banane = new Fructe(32);
        banane.afisare();
       
    }


}