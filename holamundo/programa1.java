package holamundo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class programa1 {
	
	public static void main(String[] args) 
	{
	
		float arreglo[] = { 9, 8, 6, 10, 10 };
		float suma = 0.0f;
		for (int x = 0; x < arreglo.length; x++)
		{
			suma = suma + arreglo[x];
		}
		
		float promedio = suma / arreglo.length;
		System.out.printf("Suma: %f. Promedio: %f", suma, promedio);
	}
}
