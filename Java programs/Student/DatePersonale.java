public class DatePersonale {
    private String nume;
    private String initiale;
    private String prenume;
    private int anNastere;

    public DatePersonale(String n, String i, String p, int an) {
        nume = new String(n);
        initiale = new String(i);
        prenume = new String(p);
        anNastere = an;
    }
    public String getNume() {
        return nume;
    }
    public String getPrenume(){
        return prenume;
    }
    public int getAnNastere(){
        return anNastere;
    }
    public String toString(){
        return nume+" "+initiale +" "+prenume+" ("+anNastere+")";
    }

}