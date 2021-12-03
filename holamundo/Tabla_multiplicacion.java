package holamundo;
import java.util.Scanner;


public class Tabla_multiplicacion 
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantas columnas desea agregar: ");                                                         
		int columns = sc.nextInt();
		System.out.println("Limite: ");  
		int limite = sc.nextInt();;
		
		int filas = limite / columns + (limite % columns > 0 ? 1 : 0);
		
		
		for (int iter = 0; iter < filas; iter++) {
			
		    for (int i = 0; i <= 10; i++) {
		    	
		        for (int j = iter * columns + 1; j <= Math.min(limite, (iter + 1) * columns); j++) {
		            System.out.print(j + " x " + i + " = "  +(i * j) + "\t\t");
		        }
		        System.out.println();
		    }
		    System.out.println();
		}

	}
    }


