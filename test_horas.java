package dosParcial;
import java.util.InputMismatchException;
import java.util.Scanner;


public class test_horas {
	
	public static void main(String[] args)
	{
		horas hr =new horas();
        Scanner input = new Scanner(System.in);
        int hours,opc;
        float num;
        boolean ex = false;

        do
        {
        	System.out.println("\nConvertidor de medidas de tiempo");
            System.out.println("1. Insertar Hora");
            System.out.println("2. Insertar Minutos");
            System.out.println("3. Insertar Segundos");
        	System.out.println("\nIngrese valor numerico");
            
            opc = input.nextInt();
        	switch (opc) 
            {
                case 1:
                	System.out.println("...Convirtidor de Horas...");
                	System.out.println("Inserte numero en hora");
                    num = input.nextInt();
                	System.out.println(hr.convertHoras(num));
                	break;
                	
                case 2:
                	System.out.println("...Convirtidor de Minutos...");
                	System.out.println("Inserte numero en minutos");
                    num = input.nextInt();
                	System.out.println(hr.convertMinutos(num));
                	
                	break;
                case 3:
                	System.out.println("...Convirtidor de Segundos...");
                	System.out.println("Inserte numero en segundos");
                    num = input.nextInt();
                	System.out.println(hr.convertSegundos(num));
                	
                	break;
                default:
                	System.out.println("Ingrese los datos bien...");
                	
            } 
        	
        }while (!ex) ;
	}	

}

	


