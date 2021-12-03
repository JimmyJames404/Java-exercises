package holamundo;

import java.util.Scanner;

public class programa3 {
	

	public static void main(String[] args) 
	{
		int arr[]=new int[11];
		int valores_mayores=0;//Mayores a cero
		int valores_menores=0;//menores a cero
		
		
		Scanner sn= new Scanner (System.in);
		
		
		for(int i=0;i<=9;i++) {
			System.out.println("Ingrese un numero "+i);
	        int num =sn.nextInt();
	        arr[i]=num;
	        if(num>0) {
	        	valores_mayores++;
	        }
	        else {
	        	valores_menores++;
	        }
	        arr[i]=num;
		}
		System.out.println("Cantidad de numeros mayores a cero "+valores_mayores);
		System.out.println("Cantidad de numeros menores a cero "+valores_menores);
		
		}
	}


