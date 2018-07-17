package logical;

public class Procesador extends Productos {

	private String Socket;
	private float velocidadBase;
	private float velocidadTurbo;
	private boolean Unlock;
	
	//Inicio de Constructor
	public Procesador(float precio, int cant, String num_serie, String marca, String modelo, String socket,
			float velocidadBase, float velocidadTurbo, boolean unlock) {
		super(precio, cant, num_serie, marca, modelo);
		Socket = socket;
		this.velocidadBase = velocidadBase;
		this.velocidadTurbo = velocidadTurbo;
		Unlock = unlock;
	}
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
