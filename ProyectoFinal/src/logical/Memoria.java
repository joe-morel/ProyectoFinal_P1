package logical;

public class Memoria extends Productos {

	private float CantGB;
	//Inicio del Constructor 
	
	public Memoria(float precio, float PrecioVenta, int cant, String num_serie, String marca, String modelo, float cantGB) {
		super(precio,PrecioVenta, cant, num_serie, marca, modelo);
		this.CantGB = cantGB;
	}
	//Fin del Constructor
	//*********************
	//Inicio de Getters and Setters
	public float getCantGB() {
		return CantGB;
	}

	public void setCantGB(float cantGB) {
		CantGB = cantGB;
	}
	//Fin de Getters and Setters
}
