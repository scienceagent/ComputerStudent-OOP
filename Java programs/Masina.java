public class Masina {
    int kilometrajPlecare;
    int kilomatrajSosire;
    int litri;

    public Masina(
    int kilometrajPlecare,
    int kilomatrajSosire
    ){
        this.kilometrajPlecare = kilometrajPlecare;
        this.kilomatrajSosire = kilomatrajSosire;
    }

    public int consum(){
        kilometrajPlecare = 20;
        kilomatrajSosire = 50;
        litri = kilomatrajSosire - kilometrajPlecare;
        return litri;
    }
    public static void main(String[] args) {
        Masina m1 = new Masina(20,50);

        System.out.println("Consumul este de ="+m1.consum());
    }
}
