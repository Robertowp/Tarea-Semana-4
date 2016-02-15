import java.util.Scanner;

public class Trabajosemana4_2
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int altura; 
		System.out.println("ingrese la altura del rectangulo: "); 
		altura = teclado.nextInt (); 

		int anchura; 
		System.out.println("ingrese la anchura del rectangulo: "); 
		anchura = teclado.nextInt (); 

		for(int fila = 0; fila < anchura; fila++){
			for(int col = 0; col < altura; col++){
			System.out.print(" *");
		}

		
			System.out.println("");
		}
			
		
		
	}
}