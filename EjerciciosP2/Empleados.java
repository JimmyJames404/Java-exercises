package EjerciciosP2;

public class Empleados {
	/*
	 * Construir una definición de clase que se pueda utilizar para representar un
	 * empleado de una compañía, definido por un número entero ID, un salario y el
	 * número máximo de horas de trabajo por semana. Los servicios que la clase debe
	 * proporcionar deben permitir ingresar datos de un nuevo empleado, visualizar
	 * sus datos existentes y tener capacidad para procesar las operaciones
	 * necesarias para dar de alta o baja en la seguridad social y en los seguros
	 * contratados por la compañía.
	 */
	public static int id,salario,horas_extra,pagoxhrextra;
    public static String nombre;

    public Empleados() {
    }


    public Empleados(int id) {
        this.id = id;
    }

//Metodos
    public int getHorasExtras() {
        return horas_extra;
    }

    public void setHorasExtras(int horas_extra) {
        this.horas_extra = horas_extra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


    public static double getPagoPorHoraExtra() {
        return pagoxhrextra;
    }

    public static void setPagoPorHoraExtra(int pagoxhrextra) {
        Empleados.pagoxhrextra = pagoxhrextra;
    }

    public double calcularImporteHorasExtras(){
        return horas_extra * pagoxhrextra;
    }
   
//Sueldo Final
    public double calcularSueldoBruto(){
        return salario + calcularImporteHorasExtras();
    }

  
	
}
