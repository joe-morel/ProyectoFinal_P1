package logical;

import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Clientes> misClientes;
	private ArrayList<Productos> misProductos;
	private ArrayList<Factura> misFacturas;
	private ArrayList<Empleados> misEmpleados;
	
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
