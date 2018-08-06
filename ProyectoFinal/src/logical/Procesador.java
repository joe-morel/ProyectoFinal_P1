package logical;

import java.io.Serializable;

public class Procesador extends Productos implements Serializable {

	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -6586247900881548151L;
	private String Socket;
	private float velocidadBase;
	private float velocidadTurbo;
	private boolean Unlock;
	
	public Procesador(float precio, float PrecioVenta, int cant, String Codigo, String marca, String modelo,
			String TipoProducto, String socket, float velocidadBase, float velocidadTurbo, boolean unlock) {
		super( precio,PrecioVenta, cant, Codigo, marca, modelo, TipoProducto);
		Socket = socket;
		this.velocidadBase = velocidadBase;
		this.velocidadTurbo = velocidadTurbo;
		Unlock = unlock;
	}
	
	//Inicio de Constructor
	/*public Procesador(float precio, float PrecioVenta, int cant, String num_serie, String marca, String modelo, String socket,
			float velocidadBase, float velocidadTurbo, boolean unlock) {
		super(precio, PrecioVenta, cant, num_serie, marca, modelo);
		this.Socket = socket;
		this.velocidadBase = velocidadBase;
		this.velocidadTurbo = velocidadTurbo;
		this.Unlock = unlock;
	}*/
	//Fin de Constructor
	//******************************
	//Inicio de Getters and Setters 
	public String getSocket() {
		return Socket;
	}

	public void setSocket(String socket) {
		Socket = socket;
	}

	public float getVelocidadBase() {
		return velocidadBase;
	}

	public void setVelocidadBase(float velocidadBase) {
		this.velocidadBase = velocidadBase;
	}

	public float getVelocidadTurbo() {
		return velocidadTurbo;
	}

	public void setVelocidadTurbo(float velocidadTurbo) {
		this.velocidadTurbo = velocidadTurbo;
	}

	public boolean isUnlock() {
		return Unlock;
	}

	public void setUnlock(boolean unlock) {
		Unlock = unlock;
	}
	//Fin de Getters and Setters 
}
