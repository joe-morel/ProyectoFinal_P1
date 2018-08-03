package logical;

public class HardDrive extends Memoria {

	private String tipoConexion;
	private float wrSpeed;
	private float rdSpeed;
	//Inicio de Constructor
	public HardDrive(float precio, float PrecioVenta, int cant, String Codigo, String marca, String modelo, String TipoProducto, float cantGB,
			String tipoConexion, float wrSpeed, float rdSpeed) {
		super(precio, PrecioVenta, cant, Codigo, marca, modelo, TipoProducto, cantGB);
		this.tipoConexion = tipoConexion;
		this.wrSpeed = wrSpeed;
		this.rdSpeed = rdSpeed;
	}
	//Fin de Constructor
	//*******************************
	// Inicio de Getters and Setters
	public String getTipoConexion() {
		return tipoConexion;
	}
	public void setTipoConexion(String tipoConexion) {
		this.tipoConexion = tipoConexion;
	}
	public float getWrSpeed() {
		return wrSpeed;
	}
	public void setWrSpeed(float wrSpeed) {
		this.wrSpeed = wrSpeed;
	}
	public float getRdSpeed() {
		return rdSpeed;
	}
	public void setRdSpeed(float rdSpeed) {
		this.rdSpeed = rdSpeed;
	}
	// Fin de Getters and Setters

}
