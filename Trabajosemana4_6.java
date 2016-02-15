import java.util.Scanner;

public class Trabajosemana4_6
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);


		int altura; 
		System.out.println("ingrese la altura del Triangulo: "); 
		altura = teclado.nextInt (); 
		
	
		for(int i = 0; i <= altura; i++){
			for(int k = altura-i; k > 0; k--){
			System.out.print(" ");
		}
		for(int k = 0; k < i; k++)
			System.out.print(" *");
			
			System.out.println("");
		}
		System.out.println("");
	
		}
		
}