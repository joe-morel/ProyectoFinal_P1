package logical;

public class Clientes {
	
	private String nombre;
	private String cedula;
	private String telefono;
	private String direccion;
	private String code;
	
	//Inicio de Construtor 
	
	public Clientes(String nombre, String cedula, String telefono, String direccion, String code) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.code = code;
	}
	
	// Fin de Constructor 
	//*******************************
	//Inicio de Getters and Setters
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	//Fin de Getters and Setters
	//*******************************
}
