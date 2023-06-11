
package cadena_01;

import java.util.Scanner;
public class newCadena {
    /*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
      String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
      una frase que puede ser una palabra o varias palabras separadas por un espacio en
      blanco y a través de los métodos set, se guardará la frase y la longitud de manera
      automática según la longitud de la frase ingresada.*/
    
   private String frase;
   private int longitug;
    
   public newCadena(){};
   
    public newCadena(String frase,int longitug) {
        this.frase = frase;
        this.longitug = longitug;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitug() {
        return longitug;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitug = frase.length();
    }

    public void setLongitug(int longitug) {
        this.longitug = longitug;
    }
    
    /*a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
         frase ingresada.*/
         
      public void mostrarVocales(){
         int cantidadDeVocal=0;
         for(int i = 0;i<frase.length();i++){
            char caracter= frase.charAt(i);
            
            if(caracter == 'a'){
                cantidadDeVocal++;
            }else if(caracter=='e'){
                cantidadDeVocal++;           
            }else if(caracter == 'i'){
                cantidadDeVocal++;
              }else if(caracter=='o'){
                 cantidadDeVocal++;              
              }else if(caracter=='u'){
                  cantidadDeVocal++;
              }
            
            
         };
         
         System.out.println("La cantidad de vocales que contiene la frase ingresada es  :"+cantidadDeVocal);
      };
      /*b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
         ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
      
        public void invertirFrase(){
          String fraseInvertida="";
          
          for(int i = frase.length()-1;i>=0;i--){
             fraseInvertida += frase.charAt(i);
             
          }
          System.out.println("la frase invertida es : "+fraseInvertida);
        };
        /*c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
             contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
             d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
        
          public void vecesRepetido(){
              System.out.println("elije la letra !");
              Scanner leer = new Scanner(System.in);
              String l= leer.nextLine();
            int cantidadRepetida=0;
            for(int i=0;i<frase.length();i++){
              char n= frase.charAt(i);
              if(Character.toString(n).equals(l)){
                cantidadRepetida++;
              
              }
              
            }
            System.out.println("la cantidad de letra repetida es :"+cantidadRepetida);
            
          };
          
      /*e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
           compone la clase con otra nueva frase ingresada por el usuario.*/
          
          public void compararLoggitud(String frasenueva){
                 int longitudNuevaFrase =frasenueva.length();
              
                 if(longitudNuevaFrase==longitug){
                    System.out.println("la longitud de las frases son iguales");
                    
                 }else if(longitug > longitudNuevaFrase){
                    System.out.println("la frase tiene  mayor longitud que la frase nueva ");
                 }else{
                    System.out.println("la frase tiene menor longitud que la nueva frase ingresada");
                 };
          };
          
     /*f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
          con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
          
          public void unirFrase(String fraseNueva){
             
             String fraseUnida=frase.concat(fraseNueva);
             System.out.println("El resultado de la frase unida es ( "+fraseUnida +" )");
          }
    /*g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
         encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
         la frase resultante.*/
          
          public void reemplazar(String letra){
              Scanner leer = new Scanner(System.in);
               System.out.println("Ingrese el caracter de reemplazo");
               String caracterReemplazo=leer.nextLine();
               String fraseReemplazo = frase.replace(letra, caracterReemplazo);
               System.out.println("frase resultante : "+fraseReemplazo);
          }
          
          /*h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
             ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
          
          public boolean contiene(String letra){
             String letraBusqueda = letra;
              return frase.contains(letraBusqueda);
          };
}
