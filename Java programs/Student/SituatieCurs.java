    public class SituatieCurs{
        private int nota = 0;
        private String denumire;

        public SituatieCurs(String d){
            denumire = new String(d);
        }
        public void notare(int n){
            nota = n;
        }
        public int nota(){
            return nota;
        }
        public String toString(){
            if (nota == 0) return "Disciplina "+denumire + " nu a fost notat";
            else return "Rezultat la disciplina "+denumire+": "+nota;
        }
    }
