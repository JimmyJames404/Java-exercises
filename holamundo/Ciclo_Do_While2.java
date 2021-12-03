package holamundo;

import java.util.Scanner;

public class Ciclo_Do_While2 {
	public static void main(String[] args) 
	{
		 Scanner sn = new Scanner(System.in);
		 System.out.println("Ingres numero entero");
	     int num= sn.nextInt();
	     int i = 0;
	     
	     do
	     {
	    	 System.out.print(i + " ");
	    	 i++;
	     }
	     while(i<=num);
	     
	    	 
	}
	
	
}
