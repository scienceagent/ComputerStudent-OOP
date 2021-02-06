package Laborator3;
import java.util.Scanner;

class Animale {
    private String denumire, culoare;
    private int nr_picioare,an_Nastere;
    private String are_arpi;

    public Animale(String denumire, String culoare, int nr_picioare , int an_Nastere, String are_arpi) {
        this.denumire = denumire;
        this.culoare = culoare;
        this.nr_picioare = nr_picioare;
        this.an_Nastere = an_Nastere;
        this.are_arpi = are_arpi;
    }

    public String getDenumire() {
        return denumire;
    }
    public String getCuloare() {
        return culoare;
    }
    public int getNr_picioare() {
        return nr_picioare;
    }
    public int getAn_Nastere() {
        return an_Nastere;
    }
    public String getAre_arpi(){
        return are_arpi;
    }
    public void Afisare(){
        System.out.println(denumire+", culoare "+culoare+" "+nr_picioare+" picioare, nascut in "+an_Nastere+", are Aripi: "+are_arpi);
    }
}

public class ArrayList {

    static int Animale_gri(Animale[] g){
         int gri = 0;
         String def = "gri";
         for (int i = 0; i < g.length; i++) {
        if (g[i].getCuloare().equals(def)) 
             gri++;
         }
         return gri;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Cate animale are lista : ");
        int n = cin.nextInt();
        Animale[] animale = new Animale[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter datele animalului : "+(i+1));
            System.out.println("");
            System.out.print("Denumirea = ");
            String denumire = cin.next();
            System.out.print("Culoare = ");
            String culoare = cin.next();
            System.out.print("Numarul de picioare = ");
            int nr_picioare = cin.nextInt();
            System.out.print("Anul de nastere = ");
            int an_Nastere = cin.nextInt();
            System.out.print("Are aripi (true - are) (false - nu are) : ");
            String are_arpi = cin.next();
            animale[i] = new Animale(denumire,culoare,nr_picioare,an_Nastere,are_arpi);
            cin.nextLine();
        }
        cin.close();
        System.out.println("");
        System.out.println("Animalele din lista pe care le-ati introdus : ");
        for (Animale i : animale) 
            i.Afisare();
        System.out.println("----------------------------------------");
        int gri = Animale_gri(animale);
        System.out.println("Sunt "+gri+ " animale de culoare gri");

        
        System.out.println("----------------------------------------");
        System.out.println("Lista cailor : ");
        for (Animale i : animale)
        if(i.getDenumire().equals("Cal")){
            i.Afisare();
        }

        System.out.println("------------------------------------------");
        System.out.println("Lista animalelor cu 2 picioare: ");
        for (Animale i : animale) 
            if(i.getNr_picioare() == 2)
            i.Afisare();

        System.out.println("------------------------------------------");
        System.out.println("Lista animalelor cu aripi: ");
        for (Animale i : animale) 
        if(i.getAre_arpi().equals("true"))
        i.Afisare();
        

    }
} 