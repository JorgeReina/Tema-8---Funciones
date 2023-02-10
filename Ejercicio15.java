import java.util.Scanner;

/**
* 
* Ejercicio 15, Muestra los números primos que hay entre 1 y 1000.
* 
* Nombre del archivo: Ejercicio15.java
* 
* @author Jorge Reina Romero
* 
*/

public class Ejercicio15 {

  //Funciones

  /*
   * Función primos
   * 
   * Comprueba si un número entero positivo es primo o no.
	 * 
	 * @param x un número entero positivo
	 * @return <code>true</code> si el número es primo
	 * @return <code>false</code> en caso contrario
   * 
   */

   public static boolean primos(int x) {
    
    for (int i = 2; i < x; i++) {
			
			if ((x % i) == 0) {
				return false;
			}
			
		}
		
		return true;

   }

   public static void main(String[] args) {

    Scanner datos = new Scanner(System.in);

    int nuPrimos = 0;

    System.out.println("Los siguientes números son primos: ");

    for (int i = 0; i < 1000; i++) {
      
      if (primos(i) == true) {
        nuPrimos += 1;
        System.out.println(i);
      }

    }
    
    System.out.println();
    System.out.printf("En total %d son números primos.", nuPrimos);

   }

}