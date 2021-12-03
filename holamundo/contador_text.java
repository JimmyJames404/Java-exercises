package holamundo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class contador_text {

	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		String[ ][ ]  nombre = new String[5][25];
		
		
		System.out.print("Cuantos nombres deseas agregar:");
		int num = sc.nextInt();
		num=num-1;
		 sc.nextLine();
		 
		 
		
		for(int i=0;i<=num;i++) {
			System.out.print("Introduce un nombre: ");
			String frase = sc.nextLine();
			nombre[1][i] = frase;
		}
		
		
		for(int j=0;j<=num;j++) {
			System.out.println("\n\t\tNombre "+ (j+1)+"\n "+nombre[1][j]);
			String frase = nombre[1][j];
			 StringTokenizer st = new StringTokenizer(frase);
			    int total = st.countTokens();
			    System.out.println("Número de palabras: " + total);   
			    
			    for(int i=1;i<=total;i++) {
			    	
			    	String palabra =st.nextToken(); 
			    	int Total = palabra.length();
			    	System.out.println(palabra + " = "+ Total + " Caracteres");
			    }
		}
    }	
}		
		
		
		
    


