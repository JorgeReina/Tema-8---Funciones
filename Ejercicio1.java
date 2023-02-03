import java.util.Scanner;

/**
* 
* Ejercicios del 1 al 6, Contiene las funciones esCapicua, esPrimo,suiguientePrimo, 
* potencia, digitos y voltea.
* 
* Nombre del archivo: Ejercicio1.java
* 
* @author Jorge Reina Romero
* 
*/


public class Ejercicio1 {
	
	//Funciones//////////
	
	/**
	 * Ejercicio 1.
	 * Funcion esCapicua.
	 * 
	 * Comprueba si un número se lee igual por delante y al raves..
	 * 
	 * @param x un número entero positivo
	 * @return <code>true</code> si es capicuo
	 * @return <code>false</code> en caso contrario
	 * 
	 */
	
	public static boolean esCapicua(int x) {
		if (x != voltea(x)) {
			return false;
		} else {
			return true;
		}
		
	}
	
	/**
	 * Ejercicio 2.
	 * Funcion esPrimo.
	 * 
	 * Comprueba si un número entero positivo es primo o no.
	 * 
	 * @param x un número entero positivo
	 * @return <code>true</code> si el número es primo
	 * @return <code>false</code> en caso contrario
	 * 
	 */
	 
	public static boolean esPrimo(int x) {
		
		for (int i = 2; i < x; i++) {
			
			if ((x % i) == 0) {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	/**
	 * Ejercicio 3.
	 * Funcion siguientePrimo.
	 * 
	 * Comprueba si un número entero positivo es primo o no.
	 * 
	 * @param x un número entero positivo
	 * @return <code>x</code> 
	 * 
	 */
	 
	 public static int siguientePrimo(int x){
		 x++;
		 
		 while(!esPrimo(x)){
			 x++;
		 }
		 return x;
	 }
	 
	 /**
	 * Ejercicio 4.
	 * Funcion potencia.
	 * 
	 * Devuelve el resultado de la base y un exponente deseado.
	 * 
	 * @param base un número entero positivo
	 * @param exponente número al que elevamos la base
	 * @return <code>base</code> 
	 * 
	 */
	 
	 public static int potencia(int base, int exponente){
		 
		 int aux = base;
		 
		 for (int i = 0; i < exponente; i++) {
		
		  base = base * aux;
			
		}
		return base;
	 }
	 
	 /**
	 * Ejercicio 5.
	 * Funcion digitos.
	 * 
	 * Cuenta el número de digitos de un número entero.
	 * 
	 * @param x un número entero positivo
	 * @return <code>contador</code> 
	 * 
	 */
	 
	 public static int digito(int x){
		 
		 int contador = 0;
		 
		 while (x >0) {
			 x = x / 10;
			 contador++;
		 }
		 return contador;
	 }

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
	
	/**
	 * Ejercicio 7.
	 * Funcion digitoN.
	 * 
	 * Devuelve el dígito que está en la posición n de un número entero,
	 * se empieza contando por el 0 y de izquierda a derecha.
	 * 
	 * @param x un número entero positivo
	 * @param n la posicion
	 * @return <code>(x % 10)</code> 
	 * 
	 */
	
	public static int digitoN(int x, int n){
		
		x = voltea(x);
		
		while (n-- > 0) {
			x = x / 10;
		}
		return (x % 10);
	}
	
	/**
	 * Ejercicio 8.
	 * Funcion posicionDeDigito.
	 * 
	 * Da la posición de la primera ocurrencia de un dígito 
	 * dentro de un número entero. Si no se encuentra, devuelve -1.
	 * 
	 * @param x un número entero positivo
	 * @param d digito a buscar dentro del número
	 * @return posición de la primera ocurrencia del dígito
	 *  dentro del número o -1 si no se encuentra
	 * 
	 */
	 
	 public static int posicionDeDigito(int x, int d){
		 
		 int i;

			for (i = 0; (i < digito(x)) && (digitoN(x, i) != d); i++) {};

			if (i == digito(x)) {
				return -1;
			} else {
				return i;
			}
		 
		 
	 }
	 
	 /**
	 * Ejercicio 9.
	 * Funcion quitaPorDetras.
	 * 
	 * Le quita a un número n dígitos por detrás (por la derecha).
	 * 
	 * @param x un número entero positivo
	 * @param d los digitos que quita por la derecha
	 * @return <code>x<code/>
	 * 
	 */
	 
	 public static int quitaPorDetras(int x, int d){
		 
		voltea(x);
		
		for (int i = 0; i < d; i++) {
			x /= 10;
		}
		
		return x;
		 
	 }
	 
	 /**
	 * Ejercicio 10.
	 * Funcion quitaPorDelante.
	 * 
	 * Le quita a un número n dígitos por delante (por la izquierda).
	 * 
	 * @param x un número entero positivo
	 * @param d los digitos que quita por la izquierda
	 * @return <code>x<code/>
	 * 
	 */
	 
	 public static int quitaPorDelante(int x, int d){
		 
		 x = voltea(x);
		 
		 for (int i = 0; i < d; i++) {
			x /= 10;
		 }
		 x = voltea(x);
		 
		 return x;
		 
	 }
	 
	 /**
	 * Ejercicio 11.
	 * Funcion pegaPorDetras.
	 * 
	 * Añade un dígito a un número por detrás.
	 * 
	 * @param x un número entero positivo
	 * @param d el digito que quieres añadir
	 * @return <code>x<code/> el codigo con el número añadido
	 * 
	 */
	 
	 public static int pegaPorDetras(int x, int d) {
		 
		 x *= 10;
		 
		 x += d;
		 
		 return x;
		 
	 }
	 
	 /**
	 * Ejercicio 12.
	 * Funcion pegaPorDelante.
	 * 
	 * Añade un dígito a un número por deltante.
	 * 
	 * @param x un número entero positivo
	 * @param d el digito que quieres añadir
	 * @return <code>x<code/> el codigo con el número añadido
	 * 
	 */
	 
	 public static int pegaPorDelante(int x, int d) {
		 
		 x = (voltea(x) * 10) + d;
		 x = voltea(x);
		 
		 return x;
		 
	 }
	 
	 /**
	 * Ejercicio 13.
	 * Funcion trozoDeNumero.
	 * 
	 * Toma como parámetros las posiciones inicial y final 
	 * dentro de un número y devuelve el trozo correspondiente.
	 * 
	 * @param x      número entero
   * @param inicio posición inicial
   * @param fin    posición final
   * @return       trozo de número compuesto por todos los dígitos que van desde
   *               la posición inicial a la posición final incluyendo ambos
	 * 
	 */
	 
	  public static int trozoDeNumero(int x, int inicio, int fin) {
			int longitud = digito(x);
			x = quitaPorDelante(x, inicio);
			x = quitaPorDetras(x, longitud - fin - 1);
			return x;
		}
	 
	 /**
	 * Ejercicio 14.
	 * Funcion juntaNumeros.
	 * 
	 * Pega dos números para formar uno.
	 * 
	 *  @param x trozo que se pegará por la izquierda
   * 	@param y trozo que se pegará por la derecha
   * 	@return  número compuesto de los trozos <code>x</code> e <code>y</code>
	 * 
	 */
	 
		public static int juntaNumeros(int x, int y) {
			
			return x * (int)potencia(10, digito(y)) + y;
		
		}

	
	
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int x = datos.nextInt();
		
		System.out.print("Introduce un exponente para el número introducido: ");
		int exponente = datos.nextInt();
		
		System.out.printf("Introduce que posicion quieres visualizar del número (0-%d): ", digito(x)-1);
		int posicion = datos.nextInt();
		
		System.out.print("Introduce el digito a buscar dentro del número: ");
		int d = datos.nextInt();
		
		System.out.print("Introduce los números que quieres quitar por la derecha: ");
		int nDerecha = datos.nextInt();
		
		System.out.print("Introduce los números que quieres quitar por la izquierda: ");
		int nIzquierda = datos.nextInt();
		
		System.out.print("Introduce el digito que quieres añadir por detras: ");
		int añadir = datos.nextInt();
		
		System.out.print("Introduce el digito que quieres añadir por delante: ");
		int añadir1 = datos.nextInt();
		
		System.out.print("Introduce la posición de inicio: ");
		int inicio = datos.nextInt();
		
		System.out.print("Introduce la posición de fin: ");
		int fin = datos.nextInt();
		
		System.out.print("Introduce el número que quieres juntar: ");
		int x2 = datos.nextInt();
		
		System.out.println();
		
		System.out.println("Nº Invertido: " + voltea(x));
		System.out.println("Es capicua: " + esCapicua(x));
		System.out.println("El número es Primo: " + esPrimo(x));
		System.out.println("Siguiete nº primo: " + siguientePrimo(x));
		System.out.printf("Potencia de %d elevado a %d: %s\n", x, exponente, potencia(x, exponente));
		System.out.printf("El nº introducido tiene %d digitos.\n", digito(x));
		System.out.printf("El número de la posición %d es: %d\n", posicion, digitoN(x, posicion)); 
		System.out.printf("El dígito %d se encuentra en la poscición: %d\n", d, posicionDeDigito(x, d));
		System.out.printf("Nº con digitos quitado por la derecha: %d\n", quitaPorDetras(x, nDerecha));
		System.out.printf("Nº con digitos quitado por la izquierda: %d\n", quitaPorDelante(x, nIzquierda));
		System.out.printf("El número con el digito añadido por detras: %d\n", pegaPorDetras(x, añadir));
		System.out.printf("El número con el digito añadido por delante: %d\n", pegaPorDelante(x, añadir1));
		System.out.printf("Función trozo de número: %d\n", trozoDeNumero(x, inicio, fin));
		System.out.printf("Pegado de números: %d\n", juntaNumeros(x, x2));
		
	}
}
