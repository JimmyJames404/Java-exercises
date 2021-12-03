package holamundo;
import java.util.Scanner;

public class loop_for {

	public static void main(String[] args) {
		Scanner sn= new Scanner (System.in);
		System.out.print("Ingrese numero entero:");
		int num =sn.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.print(i + " ");
		}
		
		sn.close();
	}
}
