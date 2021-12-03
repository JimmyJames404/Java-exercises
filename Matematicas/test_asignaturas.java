package Matematicas;

import java.util.Scanner;

public class test_asignaturas {
	public static void main ( String args[])
	{
		
        Scanner sc = new Scanner(System.in);
       
        
      
        System.out.print( "Representacion de asignaturas");
        System.out.print( "\nIntroduzca la asignatura:");
        String materia = sc.nextLine();
        System.out.print( "Introduzca el curso_impartido:");
        String curso_impartido = sc.nextLine();
        System.out.print( "Introduzca el codigo:");
        int codigo = sc.nextInt();
        
        Asignatura asg = new Asignatura(materia,curso_impartido,codigo);

        System.out.print("\n Materia Registrada"); 
        System.out.print("\nMateria: "+asg.getMateria());
        System.out.print("\nCurso impartido :"+asg.getCurso_impartido());
        System.out.print("\nPlato ajustado :"+asg.getCodigo());

    }
}
