import java.util.Scanner;

/**
* 
* Ejercicios del 20 al 28. 
* 
* Funciones de una dimensión.
* 
* Nombre del archivo: Ejercicio20.java
* 
* @author Jorge Reina Romero
* 
*/

public class Ejercicio20 {

  /*
   * Ejercicio 20
   * 
   * Función generaArrayInt.
   * 
   * Genera un array de tamaño n con números aleatorios 
   * cuyo intervalo (mínimo y máximo) se indica como parámetro.
   */

   public static void generaArrayInt(int x, int max, int min) {
    
    int n[] = new int[x];
    
    for (int i = 0; i < x; i++) {
      n[i] = (int)(Math.random()* max + min);
    }

   }

   public static void muestraArray(int x[]) {
    for (int i = 0; i < x.length; i++) {
    System.out.print(x[i] + " ");
    }
    System.out.println();
    }
    

   public static void main(String[] args) {

    Scanner datos = new Scanner(System.in);

    System.out.println("Introduce el tamaño del array: ");
    int tamaño = datos.nextInt();

    System.out.println("Introduce el valor minimo del array: ");
    int max = datos.nextInt();

    System.out.println("Introduce el valor maximo del array: ");
    int min = datos.nextInt();
    
    System.out.printf("El array es el siguiente: ", generaArrayInt(tamaño, max, min));

   }
  
}
