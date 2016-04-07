
	
	package monolitico;

	import java.util.Scanner;
		
		/**
		 * 
		 * @author Isaac García Herrero.
		 * @version 3.0	
		 * @since 04/04/2016
		 *
		 */

	public class Aciertos {
		
		/**
		 *  Programa que compara un número introducido por teclado con otro numero generado 
		 *  por la máquina aleatoriamente. Si en numero introducido coincide nos muestra un mensaje 
		 *  y acaba el juego, sino, nos muestra un mensaje si nos hemos pasado y otro si no llegamos.
		 * @param args
		 */

	    public static void main(String[] args) {
	        int n = 0,cont = 0;
	        int x = (int) (500 *Math.random());
	        //System.out.print(x);
	        Scanner sc = new Scanner(System.in);
	        do {
	            n = pideNumero(sc);
	            comparar(n, x);
	            cont++;
	        } while (n != x);
	        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );

	    }
	    
	    /**
	     * 
	     * @param n numero introducido por teclado.	
	     * @param x nuemero generado aleatoriamente por la máquina
	     * @return devuelve un booleano con verdadero o falso.
	     */

		private static void comparar(int n, int x) {
			if (n > x) {
			    System.out.print("Te pasaste Amigo");
			} else if (n < x){
			    System.out.print("Casi cerca ...");
			}
		}

		/**
		 * 
		 * @param sc metodo pideNumero
		 * @return devuelve el numero introducido por teclado.
		 */
		private static int pideNumero(Scanner sc) {
			int n;
			System.out.print("\nIntroduce el valor de X: ");
			n = sc.nextInt();
			return n;
		}
	}






