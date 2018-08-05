package logical;

import java.io.Serializable;

public class Clientes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String cedula;
	private String telefono;
	private String direccion;
	private String Codigo;
	private static int cantClientes=0;
	private float LimiteCredito;
	
	//Inicio de Construtor 
	
	public Clientes(String nombre, String cedula, String telefono, String direccion, String Codigo, float limiteCredito) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.Codigo = Codigo;
		this.cantClientes++;
		this.LimiteCredito = limiteCredito;
	}
	
	// Fin de Constructor 
	//*******************************
	//Inicio de Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public String getCodigo() {
		return Codigo;
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
	public static int getCantClientes() {
		return cantClientes;
	}

	public static void setCantSuplidores(int cantClientes) {
		Clientes.cantClientes = cantClientes;
	}

	public float getLimiteCredito() {
		return LimiteCredito;
	}

	public void setLimiteCredito(float limiteCredito) {
		this.LimiteCredito = limiteCredito;
	}
	
	//Fin de Getters and Setters
	//*******************************
}
