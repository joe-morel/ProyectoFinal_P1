package logical;

public class Productos {
	
	private float precio;
	private float PrecioVenta;
	private int cant;
	private String num_serie;
	private String marca;
	private String modelo;
	
	//Inicio de Constructor
	public Productos(float precio,float PrecioVenta, int cant, String num_serie, String marca, String modelo) {
		super();
		this.precio = precio;
		this.cant = cant;
		this.num_serie = num_serie;
		this.marca = marca;
		this.modelo = modelo;
		this.PrecioVenta = PrecioVenta;
	}
	// Fin de Constructor
	//*******************************
	// Inicio de Getters and Setter 
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	public String getNum_serie() {
		return num_serie;
	}
	public void setNum_serie(String num_serie) {
		this.num_serie = num_serie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//Fin de Getters and Setters
	//*******************************
	public float getPrecioVenta() {
		return PrecioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		PrecioVenta = precioVenta;
	}
	
}
