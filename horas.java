package dosParcial;

public class horas {
	public static float horas;
	public static float minutos,segundos;
	public static String resultados;
	
   
    public horas() {};
    
    public horas(float horas, float minutos, float segundos,String resultados)
    {
    	this.horas=horas;
		this.minutos=minutos;
		this.segundos=segundos;
		this.resultados=resultados;
    }

    public static String convertHoras(float horas) 
  	{
      	horas=horas;
  		minutos=horas*60;
  		segundos=horas*3600;
        resultados="Horas:\n"+horas +"\nMinutos:\n"+minutos+"\nSegundos:\n"+segundos;
  		return resultados;
     }
    public static String convertMinutos(float minutos) 
  	{
      	horas=minutos/60;
  		minutos=minutos;
  		segundos=minutos*60;
        resultados="Horas:\n"+horas +"\nMinutos:\n"+minutos+"\nSegundos:\n"+segundos;
  		return resultados;
     }
    public static String convertSegundos(float segundos) 
  	{
      	horas=segundos/3600;
  		minutos=segundos/60;
  		segundos=segundos;
        resultados="Horas:\n"+horas +"\nMinutos:\n"+minutos+"\nSegundos:\n"+segundos;
  		return resultados;
     }

    
}

