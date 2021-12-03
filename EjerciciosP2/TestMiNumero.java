package EjerciciosP2;

import java.util.InputMismatchException;
import java.util.Scanner;

import Matematicas.bicicletaSol;

public class TestMiNumero {
	public static void main(String[] args) throws InterruptedException
	{
		MiNumero mi = new MiNumero();
		
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion,num;
        
        System.out.println("Ingrese numero inicial");
        num = sn.nextInt();
        mi.cambiaNumero(num);
        
        
        while (!salir) 
        {
        	System.out.println("Valor actual -> "+mi.getValor());
            System.out.println("1. Cambiar numero");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Valor Actual");
            System.out.println("5. Doble");
            System.out.println("6. Triple");
            System.out.println("7. Cuadruple");
            System.out.println("8. Exist");
            try 
            {
           	 	
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                
 
                switch (opcion) 
                {
                    case 1:
                    	System.out.println("Ingrese nuevo numero");
                    	num = sn.nextInt();
                    	mi.cambiaNumero(num);
                    	break;
                    case 2:
                    	System.out.println("Ingrese numero a sumar");
                    	num = sn.nextInt();
                    	mi.suma(num);
                    	break;
                    case 3:
                    	System.out.println("Ingrese numero a restar");
                    	num = sn.nextInt();
                    	mi.resta(num);
                    	break;
                    case 4:
                    	System.out.println("ValorActual");
                		mi.getValor();
                		break;
                    case 5:
                    	System.out.println("Duplicando...");
                    	mi.getDoble();
                    	break;
                    case 6:
                    	System.out.println("Triplicando...");
                    	mi.getTriple();
                    	break;
                    case 7:
                    	System.out.println("Cuadruplicando...");
                    	mi.getCuadruple();
                    	break;
                    case 8:
                    	salir = true;
                    	break;
                    	
                    	
                    default:
                        System.out.println("---Solo números entre 1 y 8---");
                }
                    
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
        }
        
        
/*		mi.cambiaNumero(12);
		mi.suma(12);
		mi.resta(10);
		mi.getValor();
		mi.getDoble();
		mi.getTriple();
		mi.getCuadruple();*/
	}

	
	}}
