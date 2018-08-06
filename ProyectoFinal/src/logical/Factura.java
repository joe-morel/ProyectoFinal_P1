package logical;

import java.io.Serializable;
import java.util.ArrayList;

public class Factura implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3135059283004931062L;
	private ArrayList<Productos> listaProductosVendidos;
	private Clientes cliente;
	private float PrecioTotal;
	private String code;
	private Productos tuProducto;
	
	//Inicio del Constructor 
	
	public Factura(ArrayList<Productos> listaProductosVendidos, Clientes cliente, float precioTotal, String code) {
		super();
		this.listaProductosVendidos = listaProductosVendidos;
		this.cliente = cliente;
	PrecioTotal = precioTotal;
		this.code = code;
		this.tuProducto = tuProducto;
	}
	
	//Fin del Constructor
	//********************************
	// Inicio de Getters and Setters
	
	public ArrayList<Productos> getListaProductosVendidos() {
		return listaProductosVendidos;
	}

	public void setListaProductosVendidos(ArrayList<Productos> listaProductosVendidos) {
		this.listaProductosVendidos = listaProductosVendidos;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public float getPrecioTotal() {
		return PrecioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		PrecioTotal = precioTotal;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	//Fin de Getters and Setters 
	
	//Inicio de Metodos
	
	public void AddProducto(Productos pro) {
		this.listaProductosVendidos.add(pro);
	}

	public Productos getTuProducto() {
		return tuProducto;
	}

	public void setTuProducto(Productos tuProducto) {
		this.tuProducto = tuProducto;
	}
}
