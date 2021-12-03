package holamundo;
import java.util.Scanner;

public class convertirBinarioIp {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese IP");
		String ip = in.nextLine();
		String[] octetArray = ip.split("\\.");
		for (String string : octetArray){
		    int octet = Integer.parseInt(string);
		    String binaryOctet = Integer.toBinaryString(octet);
		    System.out.println(binaryOctet);
		}
	}
}
