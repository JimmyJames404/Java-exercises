package holamundo;
import java.util.InputMismatchException;
import java.util.Scanner; 

public class Principal
{
	
	public static void main(String[] args) 
	{
		 Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion; //Guardaremos la opcion del usuario
	 
	        while (!salir) {
	 
	            System.out.println("1. Guardando datos");
	            System.out.println("2. Pares e impares");
	            System.out.println("3. Ciclo While");
	            System.out.println("4. Ciclo Do while");
	            System.out.println("5. Ciclo For");
	            System.out.println("6. Salir");
	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	 
	                switch (opcion) {
	                    case 1:
	                    	System.out.println("----------Ingrese datos----------");
	                    	System.out.println("Ingrese nombre");
	    	                String nombre=sn.nextLine();
	    	                System.out.println("Ingrese edad");
	    	                int edad=sn.nextInt();
	    	                System.out.println("Ingrese el peso");
	    	                double peso=sn.nextDouble();
	    	                System.out.println("----------Los Datos Ingresados----------");
	    	                System.out.println(nombre);
	    	                System.out.println(edad);
	    	                System.out.println(peso);
	                        break;
	                        
	                        
	                        
	                    case 2:
	                    	System.out.println("Ingrese un numero");
	    	                int numero=sn.nextInt();
	    	            	if (numero%2==0)
	    	            	    System.out.println("El número es par");
	    	            	else
	    	            	    System.out.println("El número es impar");
	                        break;
	                        
	                        
	                        
	                    case 3:
	                        System.out.println("Has seleccionado la opcion 3");
	                        break;
	                        
	                        
	                        
	                        
	                    case 4:
	                        salir = true;
	                        break;
	                        
	                        
	                        
	                    default:
	                        System.out.println("Solo números entre 1 y 4");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	            }
		
		
	    }
	}
}


		



