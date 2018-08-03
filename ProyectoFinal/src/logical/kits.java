package logical;

import java.util.ArrayList;

public class kits extends Productos{

	private ArrayList<Productos> listaProductosAgregados;
	private String code;
	private float PrecioTK;
	public kits(float precio, float PrecioVenta, int cant, String Codigo, String marca, String modelo, String TipoProducto, ArrayList<Productos> listaProductosAgregados, String code, float PrecioTK) {
		super(precio,PrecioVenta, cant, Codigo, marca, modelo, TipoProducto);
		this.listaProductosAgregados = listaProductosAgregados;
		this.code = code;
		this.PrecioTK = PrecioTK;
	}
	public ArrayList<Productos> getListaProductosAgregados() {
		return listaProductosAgregados;
	}
	public void setListaProductosAgregados(ArrayList<Productos> listaProductosAgregados) {
		this.listaProductosAgregados = listaProductosAgregados;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getPrecioTotal() {
		return PrecioTK;
	}
	public void setPrecioTotal(float precioTK) {
		PrecioTK = precioTK;
	}
	

}
