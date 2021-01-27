class ex {
    public int adunare(int ... valori) {
        int s=0;
        for ( int i = 0 ; i<valori.length ; i++)
            s+=valori[i];
            return s;
    }
    public static void main(String[] args) {
        ex ob1 = new ex();
        System.out.println("Suma a 2 numere = "+ob1.adunare(30,50));
        System.out.println("Suma a 3 numere = "+ob1.adunare(23,43,99));
        System.out.println("Suma fara numere = "+ob1.adunare());
    }
}
