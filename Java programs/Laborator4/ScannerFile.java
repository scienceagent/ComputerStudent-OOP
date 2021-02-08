/*package Laborator4;

import java.io.*;
import java.util.*;
class Elev{
    String nume; double media;
    Elev(String nume,
         double media){
             this.nume = nume; 
             this.media = media;
            }
}

class Scanner_File {

    static void scriere(ArrayList<Elev> x) throws IOException{
        FileWriter fw = new FileWriter("out.txt"); 
        for(Elev i :x) 
        fw.write(i.nume+" "+i.media+"\r\n");
        fw.close(); 
}
    static ArrayList<Elev> citire() throws IOException {

        ArrayList<Elev> x = new ArrayList<Elev>();

        Scanner filescan = new Scanner(new FileReader("out.txt"));

        while (filescan.hasNext()) {
    String n = filescan.next();
    double m = Double.parseDouble(filescan.next());
        x.add(new Elev(n,m));
}
filescan.close(); 
return x; 
}
    public static void main (String []args) throws IOException{
        ArrayList<Elev> x = new ArrayList<Elev>();
        x.add(new Elev("Mihai", 10)); 
        x.add(new Elev("Gabriela",9)); 
        x.add(new Elev("Laura", 8));
        scriere(x);

        ArrayList <Elev> citire=new ArrayList<Elev>();
        citire = citire();

        for(Elev i :citire) 
        System.out.println(i.nume+" "+i.media);
}
}*/