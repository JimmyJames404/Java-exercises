package holamundo;

import java.util.Scanner;

public class Semana {
	public static void main(String[] args)
    {
		Scanner sn = new Scanner(System.in);
        String Dia;
        System.out.println("Escribe una de las opciones");
        int day= sn.nextInt();

        switch (day) 
        {
            case 1:  Dia = "Doming";
                     break;
            case 2:  Dia = "Lunes";
                     break;
            case 3:  Dia = "Martes";
                     break;
            case 4:  Dia = "Miercoles";
                     break;
            case 5:  Dia = "Jueves";
                     break;
            case 6:  Dia = "Viernes";
                     break;
            case 7:  Dia = "Sabado";
                     break;
            default: Dia = "Dia inválido\nValores aceptados (1-7)";
                     break;
        }
        System.out.println(Dia);
    }

	
}
