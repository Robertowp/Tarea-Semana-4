import java.util.Scanner;

public class Trabajosemana4_7
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		
	
		System.out.print("Introduzca un Numero: ");
        int num = teclado.nextInt ();
 
        System.out.println();
 
        int contador=0;
        for (int i = 1 ; i <= num ; i++)
        {
            if (num % i == 0)
            {
                System.out.print(i + "  ");
                contador++;
            }
        }
        System.out.println("");
        System.out.println("El numero " + num + " tiene " + contador + " numeros divisisores");
	
		}
		
}