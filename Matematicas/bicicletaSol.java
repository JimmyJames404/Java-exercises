package Matematicas;

public class bicicletaSol {
	//atributos
	public static int velocidadActual,platoActual,pinonActual;
	
	//constructores
	public bicicletaSol() {};
	
	public bicicletaSol(int velocidadActual, int platoActual, int pinonActual) 
	{
		this.velocidadActual=velocidadActual;
		this.platoActual=platoActual;
		this.pinonActual=pinonActual;
	}
	
	//Metodos
	public int acelerar(int velocidadActual) 
	{
        this.velocidadActual= velocidadActual*2;
		return this.velocidadActual;
    }
	
	public int frenar(int velocidadActual) 
	{
		this.velocidadActual=velocidadActual/2;
		return this.velocidadActual;
     
    }
	
	private int cambiarPlato(int plato) 
	{
		return plato;
    }
	
	private static int cambioPinon(int pinon) 
	{
		return pinon;
    }
	//getters y setters
	public int getVelocidadActual()
	{
		return velocidadActual;
	}
	
	public void setVelocidadActual(int velocidadActual)
	{
		this.velocidadActual = velocidadActual;
	}
	
	public int getPlatoActual()
	{
		return platoActual;
	}
	
	public void setPlatoActual(int platoActual) 
	{
		this.platoActual = platoActual;
	}
	
	public int getPinonActual() 
	{
		return pinonActual;
	}
	
	public void setPinonActual(int pinonActual) 
	{
		this.pinonActual = pinonActual;
	}
}
