package dosParcial;

public class Convertidor_medida_de_info {
	
	//atributos
	public static float bytes,bits,Gb,GB,MB,MiB,num;
	public static String type,resultados;
	
	//constructores
	public Convertidor_medida_de_info() {};
	
	public Convertidor_medida_de_info(float bytes,float bits,float Gb,float GB,float MB,float MiB) 
	{
		this.bytes=bytes;
		this.bytes=bytes;
		this.bits=bits;
		this.Gb=Gb;
		this.GB=GB;
		this.MB=MB;
		this.MiB=MiB;
	}
	
	//Metodos
	public String getBytes(float num, String type) 
	{
		if (type=="bytes") 
		{
			num=num;
			resultados=num+" Bytes";
		}
		if (type=="bits") 
		{
			num=num/8;
			resultados=num+" Bytes";
		}
		if (type=="Gb") 
		{
			num=num*134217728;
			resultados=num+" Bytes";
		}
		if (type=="GB") 
		{
			num=num*1073741824;
			resultados=num+" Bytes";
		}
		if (type=="MB") 
		{
			num=num*1048576;
			resultados=num+" Bytes";
		}
		if (type=="MiB") 
		{
			num=num*131072;
			resultados=num+" Bytes";
		}
		return resultados;
    }
	public String getBits(float num, String type) 
	{
		if (type=="bytes") 
		{
			num=num*8;
			resultados=num+" Bits";
		}
		if (type=="bits") 
		{
			num=num;
			resultados=num+" Bits";
		}
		if (type=="Gb") 
		{
			num=num*1073741824;
			resultados=num+" Bits";
		}
		if (type=="GB") 
		{
			
			num=num*85899345;
			resultados=num+" Bits";
		}
		if (type=="MB") 
		{
			num=num*8388608;
			resultados=num+" Bits";
		}
		if (type=="MiB") 
		{
			num=num*1048576;
			resultados=num+" Bits";
		}
		return this.resultados;
    }
	public String getGb(float num, String type) 
	{
		if (type=="bytes") 
		{
			num=num*1048576;
			resultados=num+" Gb";
		}

		return resultados;
    }
	public String getGB(float num, String type) 
	{
		if (type=="bytes") 
		{
			num=num*1073741824;
			resultados=num+" GB";
		}
		if (type=="bits") 
		{
			
		}
		if (type=="Gb") 
		{
			num=num*8;
			resultados=num+" GB";
		}
		if (type=="GB") 
		{
			num=num;
			resultados=num+" GB";
		}
		if (type=="MB") 
		{
			num=num*1000;
			resultados=num+" GB";
		}
		if (type=="MiB") 
		{
			num=num*954;
			resultados=num+" GB";
		}
		return resultados;
    }
	
	public String getMiB(double num, String type) 
	{
		if (type=="bytes") 
		{
			num=num*125000;
			resultados=num+" MiB";
		}
		if (type=="bits") 
		{
			num=num*8388608;
			resultados=num+" MiB";
		}
		if (type=="Gb") 
		{
			num=num*119.209;
			resultados=num+" MiB";
		}
		if (type=="GB") 
		{
			num=num*954;
			resultados=num+" MiB";
		}
		if (type=="MB") 
		{
			num=num/1.049;
			resultados=num+" MiB";
		}
		if (type=="MiB") 
		{
			num=num;
			resultados=num+" MiB";
		}
		return resultados;
    }
	
}
