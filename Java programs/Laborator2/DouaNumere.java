    class DouaNumere {
        int valoare;
        int a = 20;
         public int setVal(){
            valoare = a;
            return valoare;
        }

        public int getVal(){
            return valoare;
        }

        public int getHalf(){
            return valoare/2;
        }
    }

  class test {
    public static void main(String[] args) {
        DouaNumere v = new DouaNumere();
        v.valoare = 10;
        System.out.println("Initializarea : " + v.setVal() );
        System.out.println("Valoare : " + v.getVal() );
        System.out.println("Jumate : " + v.getHalf() );
    }
  }
   



