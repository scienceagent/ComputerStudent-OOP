public class Student {
    private DatePersonale date;
    private SituatieCurs[] cursuri;
    private int numarCursuri = 0;

    //Constructori
    public Student(String nume, String initiale, String prenume, int anNastere) {
        date = new DatePersonale(nume,initiale,prenume,anNastere);
        cursuri = new SituatieCurs[10];
    }

    public void addCurs(String nume) {
        cursuri[numarCursuri++] = new SituatieCurs(nume);
    }
    public void notare(int numarCurs, int nota) {
        cursuri[numarCurs].notare(nota);
    }

    public String toString() {
        String s = "Studentul "+date +" are urmatoarele rezultate:\n";
        for (int i=0;i<numarCursuri;i++) s=s+cursuri[i].toString()+"\n";
        return (s);
    }

    public static void main(String[] args) {
        Student st1 = new Student("Linus","John","xy ",1987);
        st1.addCurs("AI");
        st1.addCurs("BETA");
        st1.notare(0, 9);

        System.out.println(st1.toString());
    }
}
