//import java.lang.Math;

public class ex5 {
    public static void main(String[] args) {
        float greutatea = 65 ;
        float inaltimea = 1.54f;
        float imc;

        imc =  greutatea / ( inaltimea * inaltimea )  ;
        System.out.println(imc);
        
        if ( imc < 18.5 ) 
            System.out.println("Subponderal");
            else if ( imc < 24.9 ) 
                System.out.println("Normal");
            else if (imc < 29.9 ) 
                System.out.println("Supraponderal");
            else if (imc > 30)
                System.out.println("Obez");

    }
}
