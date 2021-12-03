package holamundo;
import java.util.Scanner;
public class Promedio {
	public static void main(String[] args) 
	{
		int arr[]=new int[10];
		Scanner sn = new Scanner(System.in);
		System.out.print("Ingrese un valor (0=>fin: ");
		int v = sn.nextInt();
		int i=0;
		
		while (v!=0 && i<10) {
			arr[i++]=v;
			System.out.print("Ingrese un valor (0=>fin: ");
			v = sn.nextInt();
		}
		
		for(int j=0;j<i;j++) {
			System.out.println(arr[j]);
		}
		sn.close();
		/*
		int arreglo[] = { 1, 3, 4, 90, 92 };
		// Para obtener la suma recorremos el arreglo y sumamos cada valor
		int suma = 0;
		for (int x = 0; x < arreglo.length; x++) {
			suma = suma + arreglo[x];
		}
		// El promedio es la suma dividida entre la cantidad de elementos
		float promedio = suma / arreglo.length;
		System.out.printf("Suma: %d. Promedio: %f", suma, promedio);*/
	}

}
