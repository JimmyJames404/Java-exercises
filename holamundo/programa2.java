package holamundo;

import java.util.Scanner;

public class programa2 {
	
	public static void main(String[] args) 
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Ingrese un numero");
        double num =sn.nextInt();
        //double num = Math.pow(num, 2);
        System.out.println("El numero ingresado es: "+num);
        
        if(num<=0)
		{
        	System.out.println("Error");
		}
        else {
        	System.out.println("Correcto");
        }
        
	}

}
