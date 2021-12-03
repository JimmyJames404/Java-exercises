package Matematicas;


public class testSolBici {
	public static void main(String[] args) throws InterruptedException
	{
		bicicletaSol bici = new bicicletaSol();
		bici.setVelocidadActual(25);
		bici.setPlatoActual(2);
		bici.setPinonActual(5);
		
		System.out.println("Velocidad actual " + bici.getVelocidadActual());
		System.out.println("Plato actual " + bici.getPlatoActual());
		System.out.println("Piñon actual " + bici.getPinonActual());
		Thread.sleep(2500);
		
		System.out.println("Acelerando..... ");
		Thread.sleep(2500);
		System.out.println("Velocidad actual " + bici.acelerar(bici.getVelocidadActual()));
		System.out.println("Frenando..... ");
		Thread.sleep(2500);
		System.out.println("Velocidad actual " + bici.frenar(bici.getVelocidadActual()));
	} 

}
