import java.util.Scanner;

public class Trabajosemana4_1
{

	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);

				
				System.out.print("Ingrese un Numero: ");
				int num = teclado.nextInt ();
				
				int sum = 1;
			 	for (int n = num; n>1; n--){
					 		sum = sum + n;
					 
					 	}
					 	System.out.println ("La suma desde 1 hasta " + num + " es: " + sum);
					 }
					
				}	