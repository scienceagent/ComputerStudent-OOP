public class dog {
   int varsta;
   String nume;
   float inaltime;
   float greutate;
   String culoare;
   String vacinat;
   String rasa;
   String gen;

   public dog(int varsta,
   String nume,
   float inaltime,
   float greutate,
   String culoare,
   String vacinat,
   String rasa,
   String gen) {
       this.varsta = varsta;
       this.nume = nume ;
       this.inaltime = inaltime;
       this.greutate = greutate;
       this.culoare = culoare;
       this.vacinat = vacinat;
       this.rasa = rasa;
       this.gen = gen;
   }

//crearea setter 
public int setVarsta(int varsta) {
    return varsta;
}
   public String setNume(String nume) {
       return nume;
   }

   public float setInaltime(float inaltime) {
    return inaltime;
}

    public float setGrutatea(float greutate) {
    return greutate;
}

    public String setCuloare(String culoare) {
    return culoare;
}

    public String setVaccinat(String vaccinat) {
    return vaccinat;
}

    public String setRasa(String rasa) {
    return rasa;
}

    public String setGen(String gen) {
    return gen;
}

//crearea getter
public int getVarsta(int varsta) {
    return varsta;
}

public String getNume(String nume) {
    return nume;
}

public float getInaltime(float inaltime) {
 return inaltime;
}

 public float getGrutatea(float greutate) {
 return greutate;
}

 public String getCuloare(String culoare) {
 return culoare;
}

 public String getVaccinat(String vaccinat) {
 return vaccinat;
}

 public String getRasa(String rasa) {
 return rasa;
}

 public String getGen(String gen) {
 return gen;
}
    public String Talie() {
        if (inaltime > 65 ) return "Dog german,Saint-Bernant";
        else if (inaltime < 65 ) return "Labrador Retriever, Brac german";
        else if (inaltime < 50 ) return "Ciobanesc de Shetland, Bordez Collie";
        else return "Chihuahua, Bicion Maltez";
    }

        public static void main(String[] args) {
            dog d1 = new dog(2,"Tom",65,5,"Roz","Da","German","M");
            dog d2 = new dog(1,"Rex",54,5,"Negru","Da","Francez","M");
            dog d3 = new dog(4,"Saturn",34,5,"Albastru","Nu","German","M");
            dog d4= new dog(2,"Max",66,5,"Galben","Da","Lup","M");
            dog d5 = new dog(5,"Luna",89,5,"Alb","Nu","Padure","F");
            dog d6 = new dog(3,"Bella",44,5,"Rosu","Da","Salbatic","F");
            dog d7 = new dog(1,"Lucy",34,5,"Cafeniu","Da","Domestic","F");
            dog d8 = new dog(6,"Cooper",50,5,"Verde","Da","Englez","M");
            dog d9 = new dog(2,"Charlie",53,5,"Alb","Nu","Polar","M");
            dog d10 = new dog(5,"Coco",90,5,"Gri","Da","American","M");
            
            System.out.println("Varsta="+d1.varsta+"\nNumele="+d1.nume+"\nTalie="+d1.Talie()+"\nGrutatea="+d1.greutate+"\nCuloare="+d1.culoare+"\nVaccinat="+d1.vacinat+"\nRasa="+d1.rasa+"\nGen="+d1.gen);
            System.out.println("");
            System.out.println("Varsta="+d2.varsta+"\nNumele="+d2.nume+"\nTalie="+d2.Talie()+"\nGrutatea="+d2.greutate+"\nCuloare="+d2.culoare+"\nVaccinat="+d2.vacinat+"\nRasa="+d2.rasa+"\nGen="+d2.gen);
            System.out.println("");
            System.out.println("Varsta="+d3.varsta+"\nNumele="+d3.nume+"\nTalie="+d3.Talie()+"\nGrutatea="+d3.greutate+"\nCuloare="+d3.culoare+"\nVaccinat="+d3.vacinat+"\nRasa="+d3.rasa+"\nGen="+d3.gen);
            System.out.println("");
            System.out.println("Varsta="+d4.varsta+"\nNumele="+d4.nume+"\nTalie="+d4.Talie()+"\nGrutatea="+d4.greutate+"\nCuloare="+d4.culoare+"\nVaccinat="+d4.vacinat+"\nRasa="+d4.rasa+"\nGen="+d4.gen);
            System.out.println("");
            System.out.println("Varsta="+d5.varsta+"\nNumele="+d5.nume+"\nTalie="+d5.Talie()+"\nGrutatea="+d5.greutate+"\nCuloare="+d5.culoare+"\nVaccinat="+d5.vacinat+"\nRasa="+d5.rasa+"\nGen="+d5.gen);
            System.out.println("");
            System.out.println("Varsta="+d6.varsta+"\nNumele="+d6.nume+"\nTalie="+d6.Talie()+"\nGrutatea="+d6.greutate+"\nCuloare="+d6.culoare+"\nVaccinat="+d7.vacinat+"\nRasa="+d6.rasa+"\nGen="+d6.gen);
            System.out.println("");
            System.out.println("Varsta="+d7.varsta+"\nNumele="+d7.nume+"\nTalie="+d7.Talie()+"\nGrutatea="+d7.greutate+"\nCuloare="+d7.culoare+"\nVaccinat="+d8.vacinat+"\nRasa="+d7.rasa+"\nGen="+d7.gen);
            System.out.println("");
            System.out.println("Varsta="+d8.varsta+"\nNumele="+d8.nume+"\nTalie="+d8.Talie()+"\nGrutatea="+d8.greutate+"\nCuloare="+d8.culoare+"\nVaccinat="+d9.vacinat+"\nRasa="+d8.rasa+"\nGen="+d8.gen);
            System.out.println("");
            System.out.println("Varsta="+d9.varsta+"\nNumele="+d9.nume+"\nTalie="+d9.Talie()+"\nGrutatea="+d9.greutate+"\nCuloare="+d9.culoare+"\nVaccinat="+d1.vacinat+"\nRasa="+d9.rasa+"\nGen="+d9.gen);
            System.out.println("");
            System.out.println("Varsta="+d10.varsta+"\nNumele="+d10.nume+"\nTalie="+d1.Talie()+"\nGrutatea="+d10.greutate+"\nCuloare="+d10.culoare+"\nVaccinat="+d10.vacinat+"\nRasa="+d10.rasa+"\nGen="+d10.gen);

        }


}
