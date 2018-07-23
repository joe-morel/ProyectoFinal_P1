package logical;

import java.util.ArrayList;



public class Empresa {
	
	private static Empresa empresa=null;
	
	private ArrayList<Clientes> misClientes;
	private ArrayList<Productos> misProductos;
	private ArrayList<Factura> misFacturas;
	private ArrayList<Empleados> misEmpleados;
	
	public Empresa() {
		super();
		this.misClientes = new ArrayList<Clientes>();
		this.misProductos = new ArrayList<Productos>();
		this.misFacturas = new ArrayList<Factura>();
		this.misEmpleados = new ArrayList<Empleados>();
	}
	
	public static Empresa getinstance() {
		if (empresa == null) {
			empresa = new Empresa();
		}
		return empresa;
	}
	
	//Inicio de Metodos
	public void AddCliente(Clientes cli) {
		this.misClientes.add(cli);
	}
	public void AddProducto(Productos pro) {
		this.misProductos.add(pro);
	}
	public void AddFactura(Factura fact) {
		this.misFacturas.add(fact);
	}
	public void AddEmpleado(Empleados emple) {
		this.misEmpleados.add(emple);
	}
	
}
