// prima clasa
    class Caine {
        String nume;
        String rasa;
        int varsta;
    public Caine(
        String nume,
        String rasa,
        int varsta
    ){
        this.nume=nume;
        this.rasa=rasa;
        this.varsta=varsta;
    }
}
// a doua clasa
    class Cal{
        String nume;
        String culoare;
        int varsta;

    public Cal(
        String nume,
        String culoare,
        int varsta
    ){
        this.nume=nume;
        this.culoare=culoare;
        this.varsta=varsta;
    }
}
// a treia clasa care are main
    class DemoJava{
        public static void main(String[] args) {
            Caine c1 = new Caine("Johny","German",3);
            Cal cl1 = new Cal("Bartolomeu","Alb",3);
            System.out.println("Nume="+c1.nume+"\nRasa="+c1.rasa+"\nVarsta="+c1.varsta);
            System.out.println("Nume="+cl1.nume+"Culoare="+cl1.culoare+"Varsta="+cl1.varsta);
        }
    }
