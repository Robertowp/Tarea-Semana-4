import java.util.Scanner;

public class Trabajosemana4_8
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		
	   int cont =0;
		System.out.print ("Introduzca un Numero: ");
        int num = teclado.nextInt ();
 
        for(int i = 1; i < num+1; i++){
            if(num%i ==0){
                cont++;
            }
        }
       
            if (cont != 2)
            {
                System.out.print("El " + num + " no es primo.");
        
            }
            else{
                System.out.print("El " + num + " es primo.");        
            }
            
        
	
		}
		
}