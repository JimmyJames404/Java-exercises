package Matematicas;

public class Bicicleta {
	//Atributos
	int velocidadAct;
    int platoAct;
    int piñonAct;
    
    //constructor
    public Bicicleta(int velocidadAct,int platoAct,int piñonAct)
    {
    this.velocidadAct=velocidadAct;
    this.platoAct=platoAct;
    this.piñonAct=piñonAct;
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
    public void EstablecerpiñonAct()
    {
    	this.piñonAct=piñonAct;
    
    }
    
    public int ObtenerpiñonAct()
    {
    	return piñonAct;
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
       public int cambiarPiñon(int piñon)
       {
    	   piñon=32;
    	   if(piñon!=piñonAct)
    	   {
    		   piñonAct=piñon;
    	   }
    	   return piñonAct;
    }
	

}
