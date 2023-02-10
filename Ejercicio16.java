import java.util.Scanner;

/**
* 
* Ejercicio 16, Muestra los números capicúa que hay entre 1 y 99999.
* 
* Nombre del archivo: Ejercicio16.java
* 
* @author Jorge Reina Romero
* 
*/

public class Ejercicio16 {
  
  //Funciones.

  /**
	 * Ejercicio 6.
	 * Funcion voltea.
	 * 
	 * Voltea un número
	 * 
	 * @param	x un número entero positivo
	 * @return <code>invertido</code>
	 * 
	 */
	
	public static int voltea(int x) {
		
		int resto;
		int invertido = 0;
		
		while (x > 0) {
			resto = x %10;
			invertido = invertido * 10 + resto;
			x /= 10;
		}
		
		return invertido;
		
	}

  /*
   * Funcion Capicúa.
   * 
   * Comprueba si un número se lee igual por delante y al raves..
	 * 
	 * @param x un número entero positivo
	 * @return <code>true</code> si es capicuo
	 * @return <code>false</code> en caso contrario
   * 
   */

   public static boolean capicua(int x) {
		if (x != voltea(x)) {
			return false;
		} else {
			return true;
		}
		
	}

  public static void main(String[] args) {
    
    System.out.println("Los siguientes números son Capicúa: ");

    for (int i = 0; i < 99999; i++) {
      if (capicua(i) == true) {
        System.out.println(i);
      }
    }

  }

}
