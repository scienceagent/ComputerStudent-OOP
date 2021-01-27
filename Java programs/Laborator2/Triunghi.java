import static java.lang.Math.sqrt;
public class Triunghi {
    int a,b,c; 
    public void Laturi(int a,int b,int c){
        a = 5;
        b = 5;
        c = 5;
    }
    public double Aria() {
        int p = (a + b + c) / 2;
        double Aria = sqrt(p * (p - a) * (p - b) * (p - c));
        return Aria;
    }

    public String Tipul() {
        if (a==b && b==c) return "Echilateral";
        else if (a == b && a == c && b == c) return "Isoscel";
        else return "Oarecare";
    }

    public double Perimetru(){
        return a+b+c;
    }
    public double Semiperimetru(){
        return (a+b+c)/2;
    }
    public static void main(String[] args) {
        Triunghi valori = new Triunghi();
        valori.a = 5;
        valori.b= 5;
        valori.c= 5;
        System.out.println("Aria="+valori.Aria()+"\nTipul="+valori.Tipul()+"\nPerimetrul="+valori.Perimetru()+"\nSemiperimetrul="+valori.Semiperimetru());
    }
}
