package logical;

public class Empleados {

	private String nombre;
	private String cedula;
	private String telefono;
	private String direccion;
	private static int cantEmpleados;
	
	// Inicio de Constructor
	
	public Empleados(String nombre, String cedula, String telefono, String direccion, String code) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.cantEmpleados++;
	}
	//Fin de Constructor
	//*******************************
	// Inicio de Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public static int getCantEmpleados() {
		return cantEmpleados;
	}

	public static void setCantEmpleados(int cantEmpleados) {
		Empleados.cantEmpleados = cantEmpleados;
	}
	
	//Fin de Getters and Setter 
	//*******************************
	
}
