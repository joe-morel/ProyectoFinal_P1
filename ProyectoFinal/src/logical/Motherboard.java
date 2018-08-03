package logical;

public class Motherboard extends Productos{
	
	private String marcaProcesadores;
	private String socketProcesador;
	private String tipoRam;
	private int cantIDE;
	private int cantM2;
	private int cantSata;
	private int cantSlotsRam;
	private boolean multiCHSUP;

	//Inicio de Constructor 
	
	public Motherboard(float precio, float PrecioVenta, int cant, String Codigo, String marca, String modelo, String TipoProducto, String marcaProcesadores,
			String socketProcesador, String tipoRam, int cantIDE, int cantM2, int cantSata,
			int cantSlotsRam, boolean multiCHSUP) {
		
		super(precio,PrecioVenta, cant, Codigo, marca, modelo, TipoProducto);
		this.marcaProcesadores = marcaProcesadores;
		this.socketProcesador = socketProcesador;
		this.tipoRam = tipoRam;
		this.cantIDE = cantIDE;
		this.cantM2 = cantM2;
		this.cantSata = cantSata;
		this.cantSlotsRam = cantSlotsRam;
		this.multiCHSUP = multiCHSUP;
	}
	//Fin de Constructor
	//******************************
	//Inicio de Getters and Setter
	public String getMarcaProcesadores() {
		return marcaProcesadores;
	}

	public void setMarcaProcesadores(String marcaProcesadores) {
		this.marcaProcesadores = marcaProcesadores;
	}

	public String getSocketProcesador() {
		return socketProcesador;
	}

	public void setSocketProcesador(String socketProcesador) {
		this.socketProcesador = socketProcesador;
	}

	public String getTipoRam() {
		return tipoRam;
	}

	public void setTipoRam(String tipoRam) {
		this.tipoRam = tipoRam;
	}

	public int getCantIDE() {
		return cantIDE;
	}

	public void setCantIDEPATA(int cantIDE) {
		this.cantIDE = cantIDE;
	}

	public int getCantM2() {
		return cantM2;
	}

	public void setCantM2(int cantM2) {
		this.cantM2 = cantM2;
	}

	public int getCantSata() {
		return cantSata;
	}

	public void setCantSata(int cantSata) {
		this.cantSata = cantSata;
	}

	public int getCantSlotsRam() {
		return cantSlotsRam;
	}

	public void setCantSlotsRam(int cantSlotsRam) {
		this.cantSlotsRam = cantSlotsRam;
	}

	public boolean isMultiCHSUP() {
		return multiCHSUP;
	}

	public void setMultiCHSUP(boolean multiCHSUP) {
		this.multiCHSUP = multiCHSUP;
	}
	// Fin de Getters and Setter

}
