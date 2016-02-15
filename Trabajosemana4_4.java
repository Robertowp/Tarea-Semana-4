import java.util.Scanner;

public class Trabajosemana4_4
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int anchura; 
		System.out.print("ingrese la anchura del triangulo: "); 
		anchura = teclado.nextInt (); 

		

		for(int i = 1; i <= anchura; i++){
			for(int k = 1; k <=i; k++){
				System.out.print(" *");
			}
			System.out.println("  ");
		}



		for(int i = anchura-1; i >= 0; i--){
			for(int k = i-1; k >= 0; k--){
				System.out.print(" *");
			}
			System.out.println("  ");
		}



	
	}
		
		
}
