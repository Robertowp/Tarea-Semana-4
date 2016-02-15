import java.util.Scanner;

public class Trabajosemana4_5
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int anchura; 
		System.out.println("ingrese la anchura del rectangulo: "); 
		anchura = teclado.nextInt (); 

		int altura; 
		System.out.println("ingrese la altura del rectangulo: "); 
		altura = teclado.nextInt (); 


		//arriba
		for(int col = 0; col < altura; col++){
			System.out.print(" *");
		}
		System.out.println("");
		
		//enmedio
		for(int fila = 0; fila < anchura-2; fila++){
			System.out.print(" *");
			for(int col = 0; col < altura-2; col++){
			System.out.print("  ");
		}

		
			System.out.println(" *");
		}
	

		//abajo
		for(int col = 0; col < altura; col++)
			System.out.print(" *");

			System.out.println("");
		}
		
		
		}
