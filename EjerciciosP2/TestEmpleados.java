package EjerciciosP2;
import java.util.Scanner;


public class TestEmpleados 
{
		static Empleados e;
		final static int MAXIMO_EMPLEADOS = 10;
	    static Empleados[] empleados = new Empleados[MAXIMO_EMPLEADOS];
	    static int no,i, indice = 0;
	    final static Scanner sn = new Scanner(System.in);
	    
	    
	    
	    public static void main(String[] args) throws InterruptedException
		{
	    	insertar();

	    	
		}
	    
	    public static void insertar() throws InterruptedException
		{
	    	
	    	 do 
	    	 {
	             System.out.print("Número de empleados? ");
	             no = sn.nextInt();
	         } 
	    	 while (no < 0 || no > MAXIMO_EMPLEADOS);
	        
	         for (i = 1; i <= no; i++) 
	         {
	        	System.out.println("Empleado " + i);
	 			int num;
	 			String nam;
	 
	 			System.out.println("Ingrese el ID:");
	 	    	num = sn.nextInt();
	 	    	
	 	    	Empleados emp = new Empleados(num);
	 	    	emp.setId(num);
	 	    	sn.nextLine();
	 			System.out.println("Ingrese el nombre:");
	 	    	nam = sn.nextLine();
	 	    	emp.setNombre(nam);
	 	    	
	 			System.out.println("Ingrese el Sueldo base");
	 	    	num = sn.nextInt();
	 	    	emp.setSalario(num);
	 	    	
	 			System.out.println("Ingrese las Horas Extra tranbajados");
	 	    	num = sn.nextInt();
	 	    	emp.setHorasExtras(num);
	 	    	
	 			System.out.println("Ingrese el pago por hora extra");
	 	    	num = sn.nextInt();
	 	    	emp.setPagoPorHoraExtra(num);
	 	    	
	 	    	
	 	    	empleados[indice] = e; 
 	            indice++;
	         }
		}
	    
	    public static int totalE()
        {
            return indice;
        }
}
	    
	    
	    


    	
		
    	
    	
	
		
		        

