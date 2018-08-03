package logical;

public class Productos {
	
	private float precio;
	private float PrecioVenta;
	private int cant;
	private String Codigo;
	private String marca;
	private String modelo;
	private String TipoProducto;
	
	//Inicio de Constructor
	public Productos(float precio,float PrecioVenta, int cant, String Codigo, String marca, String modelo, String TipoProducto) {
		super();
		this.precio = precio;
		this.cant = cant;
		this.Codigo = Codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.PrecioVenta = PrecioVenta;
		this.TipoProducto = TipoProducto;
	}
	// Fin de Constructor
	//*******************************
	// Inicio de Getters and Setter 
	public String getTipoProducto() {
		return TipoProducto;
	}
	public void setTipoProducto(String TipoProducto) {
		this.TipoProducto = TipoProducto;
	}
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
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String Codigo) {
		this.Codigo = Codigo;
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
