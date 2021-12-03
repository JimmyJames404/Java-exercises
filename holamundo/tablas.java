package holamundo;
import java.util.Scanner;

public class tablas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	       
        System.out.print("Ingrese rango inicial: ");
        int n = teclado.nextInt();
       
        System.out.print("Ingrese rango final: ");
        int m = teclado.nextInt();
       
        for(int i = n; i <= m; i++) {
            System.out.println("----TABLA DEL " + i + "-----");
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
	}   
}
