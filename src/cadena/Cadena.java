
package cadena;

import cadena_01.newCadena;
import java.util.Scanner;
public class Cadena {

 
    public static void main(String[] args) {
       newCadena usuario = new newCadena();
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una frase");
       usuario.setFrase(leer.nextLine());
       
       System.out.println("Frase: "+usuario.getFrase());
       System.out.println("longtug : "+usuario.getLongitug());
       
       usuario.mostrarVocales();
       usuario.invertirFrase();
       usuario.vecesRepetido();
       System.out.println("ingrese la nueva frase");
       String n = leer.nextLine();
       usuario.compararLoggitud(n);
        System.out.println("ingrese una frase para concatenar");
       String l = leer.nextLine();
       usuario.unirFrase(l);
       System.out.println("ingrese la letra que quiere remplazar");
       String m = leer.nextLine();
       usuario.reemplazar(m);
       System.out.println("Ingrese la letra que desea buscar");
       String letra= leer.nextLine();
       boolean letrabuscada = usuario.contiene(letra);
       System.out.println("la letra ingresada ("+letra+" ) contiene la frase? : "+letrabuscada);
       
    }
    
}
