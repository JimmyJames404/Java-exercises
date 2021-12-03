package Matematicas;
/*Definir una clase que contenga
tres métodos: sumar, potencia y división, cada uno
  recibirá dos parámetros.*/
	
public class Matematicas2 {
	   public static int opcion,operador1,operador2,resultado;
	   public static float resultado2;

		public static void main(String[] args)
	    {
			operador1=10;
			operador2=2;
			divide(operador1,operador2);
	    }
		
		
		private static void suma(int operador1, int operador2) 
		{
	        resultado=operador1+operador2;
	        System.out.println("La suma de "+operador1+" + "+operador2+" es "+resultado); 
	    }
		
		private static void potencia(int operador1, int operador2) {
	        resultado2=(int)Math.pow(operador1, operador2);
	        System.out.println("La potencia de "+operador1+" elevado ala "+operador2+" es "+resultado2);

	    }
		
	    private static void divide(int operador1, int operador2) {
	        resultado2=(operador1/operador2);
	        System.out.println("La division de "+operador1+" / "+operador2+" es "+resultado2);

	    }
		
}
