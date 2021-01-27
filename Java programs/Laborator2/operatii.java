public class operatii {
    int a , b;
    int sum,dif = 0;
    int inmultirea = 1;
    int impartirea = 1;
    public void Initializarea(int a, int b) {
        a = 6;
        b = 5;
    }

    public int Adunarea() {
      return sum = a + b; 
    }

    public int Scadere() {
        return dif = a - b;
    }

    public int Inmultirea() {
        return inmultirea = a * b;
    }

    public float Impartirea() {
        return impartirea = a/b;
    }

    public static void main(String[] args) {
        operatii op = new operatii();
        op.a = 10;
        op.b= 3;
        System.out.println("Adunarea = "+op.Adunarea()+"\nDiferenta="+op.Scadere()+"\nImpartirea="+op.impartirea+"\nInmultirea="+op.inmultirea);
    }
}
