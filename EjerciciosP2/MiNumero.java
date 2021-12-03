package EjerciciosP2;

public class MiNumero {
	public static int num_original,num_nuevo;
	
	public MiNumero() {};
	
	public MiNumero(int num_original, int num_nuevo) 
	{
		this.num_original=num_original;
		this.num_original=num_nuevo;
	}
	
	public int cambiaNumero(int num_nuevo) 
	{
        this.num_original= num_nuevo;
		return this.num_original;
    }

	public int suma(int num_nuevo) 
	{
        this.num_original= num_nuevo + num_original;
		return this.num_original;
    }
	
	public int resta(int num_nuevo) 
	{
        this.num_original= num_original-num_nuevo;
		return this.num_original;
    }
	public int getValor() 
	{
        this.num_original= num_original;
		return this.num_original;
    }
	
	public int getDoble() 
	{
        this.num_original= num_original*2;
		return this.num_original;
    }
	
	public int getTriple() 
	{
        this.num_original= num_original*3;
		return this.num_original;
    }
	public int getCuadruple() 
	{
        this.num_original= num_original*4;
		return this.num_original;
    }

	
}
