package Matematicas;
import java.util.Scanner;

public class MiBicicleta {
	public static void main ( String args[])
	{
		
        Scanner entrada = new Scanner(System.in);
       
      
        System.out.print( "Mi bicliceta");
        System.out.print( "\nIntroduzca la velocidad actual:");
        int velocidadAct = entrada.nextInt();
        System.out.print( "Introduzca el plato actual:");
        int platoAct = entrada.nextInt();
        System.out.print( "Introduzca el pi�on actual:");
        int pi�onAct = entrada.nextInt();
        
        Bicicleta bici = new Bicicleta( velocidadAct, platoAct,pi�onAct);

        System.out.print("\n Bicicleta ajustada!"); 
        System.out.print("\nVelocidad actual aumentada :"+bici.Acelerar());
        System.out.print("\nVelocidad actual reducida :"+bici.Frenar());
        System.out.print("\nPlato ajustado :"+bici.cambiarPlato(platoAct));
        System.out.print("\nPi�on ajustado :"+bici.cambiarPi�on(pi�onAct));  
    }

}
