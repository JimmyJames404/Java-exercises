package holamundo;
import java.util.Scanner;

public class Manipulacion_de_cadenas {
	
	public static void main(String[] args) 
	{
		String dias[] = {"Sabado","Domingo","Lunes","Martes",
				"Miercoles","Jueves","Viernes"};
		
		Scanner sn= new Scanner (System.in);
		System.out.print("Ingrese numero de la semana:");
		int num =sn.nextInt();
		
		if(num<=dias.length && num>=0)
		{
			System.out.println(dias[num]);
			System.out.println("Dias correcto");
		}
		else
			System.out.println("Dias incorrecto");


	}

}
