package Matematicas;

public class Bicicleta {
	//Atributos
	int velocidadAct;
    int platoAct;
    int pi�onAct;
    
    //constructor
    public Bicicleta(int velocidadAct,int platoAct,int pi�onAct)
    {
    this.velocidadAct=velocidadAct;
    this.platoAct=platoAct;
    this.pi�onAct=pi�onAct;
    }
    
    //Metodos
    public void EstablecervelocidadAct()
    {
        this.velocidadAct=velocidadAct;
    }
    
    public int ObtenervelocidadAct()
    {
    	return velocidadAct;
    }
    
    public void EstablecerplatoAct()
    {
        this.platoAct=platoAct;
    }
    
    public int ObtenerplatoAct()
    {
    	return platoAct;
    }
    public void Establecerpi�onAct()
    {
    	this.pi�onAct=pi�onAct;
    
    }
    
    public int Obtenerpi�onAct()
    {
    	return pi�onAct;
    }
    
    public double Acelerar()
    {
       double velocidad;
       velocidad=velocidadAct*velocidadAct;
       return velocidad;
    }
    
     public double Frenar()
     {
	     double fren, frenar;
	     fren=velocidadAct/2;
	     frenar=velocidadAct-fren;
	     return frenar;
    }
      public int cambiarPlato(int plato)
      {
    	  
    	  plato=39;
    	  if(plato!=platoAct)
    	  {
    		  platoAct=plato;
    	  }
    	  return platoAct;
    }
       public int cambiarPi�on(int pi�on)
       {
    	   pi�on=32;
    	   if(pi�on!=pi�onAct)
    	   {
    		   pi�onAct=pi�on;
    	   }
    	   return pi�onAct;
    }
	

}
