package logical;

import java.io.Serializable;
import java.util.ArrayList;



public class Empresa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6248502753801597548L;

	public static Empresa empresa=null;
	public static int cantEmpleados;
	public static int cantClientes;
	private ArrayList<Clientes> misClientes;
	private ArrayList<Productos> misProductos;
	private ArrayList<Factura> misFacturas;
	private ArrayList<Empleados> misEmpleados;
	private ArrayList<Factura> cuentasPorCobrar = new ArrayList<Factura>();
	
	public Empresa() {
		super();
		this.misClientes = new ArrayList<Clientes>();
		this.misProductos = new ArrayList<Productos>();
		this.misFacturas = new ArrayList<Factura>();
		this.misEmpleados = new ArrayList<Empleados>();
		this.cuentasPorCobrar=new ArrayList<Factura>();
	}
	
	public static Empresa getinstance() {
		if (empresa == null) {
			empresa = new Empresa();
			cantEmpleados = 0;
			cantClientes = 0;
		}
		return empresa;
	}
	
	//Inicio de Metodos
	public void AddCliente(Clientes cli) {
		cantClientes++;
		this.misClientes.add(cli);
	}
	public void AddProducto(Productos pro) {
		cantEmpleados++;
		this.misProductos.add(pro);
	}
	public void AddFactura(Factura fact) {
		this.misFacturas.add(fact);
	}
	public void AddEmpleado(Empleados emple) {
		
		this.misEmpleados.add(emple);
	}
	public Clientes BuscarCliente(int Buscar){
		return this.misClientes.get(Buscar);
	}
	public Productos BuscarProducto(int Buscar){
		return this.misProductos.get(Buscar);
	}
	public Productos BuscarProductoModelo(String modelo){
		for (Productos p : misProductos) {
			if(modelo == p.getModelo()) {
				return p;
			}
		}
		return null;
	}
	public void EditProductos(String modelo, int cant){
		int i = 0;
		for (Productos p : misProductos) {
			if(modelo == p.getModelo()) {
				misProductos.get(i).setCant(cant);
			}
			i++;
		}
	}
	public String BuscarClienteCodigo(int Buscar){
		return this.misClientes.get(Buscar).getCode();
	}
	public Empleados BuscarEmpleado(int Buscar){
		return this.misEmpleados.get(Buscar);
	}
	public String BuscarEmpleadoCodigo(int Buscar){
		return this.misEmpleados.get(Buscar).getCode();
	}
	public ArrayList<Clientes> Getclientes(){
		return this.misClientes;
	}
	public ArrayList<Factura> GetFactura (){
		return this.misFacturas;
	}
	public ArrayList<Empleados> GetEmpleado (){
		return this.misEmpleados;
	}
	public ArrayList<Productos> GetProducto (){
		return this.misProductos;
	}
	public void ModificarCliente(Clientes cli, int idex){
		Clientes c = this.misClientes.set(idex, cli);
	}
	public void ModificarEmpleado(Empleados emp, int idex){
		Empleados e = this.misEmpleados.set(idex, emp);
	}
	
  public void EliminarCliente(int idex){
	  Clientes c = this.misClientes.remove(idex);
  }
  public void EliminarEmpleados(int idex){
	  Empleados e = this.misEmpleados.remove(idex);
  }
  public void EliminarProducto(int idex){
	  Productos p = this.misProductos.remove(idex);
  }
  public void Cobrar(float monto, float deuda, float resto){
	  
	  float aux;
	  aux = deuda-monto;
	  
	  if(aux==0){
		  resto = 0;
	  }
	  else {
		  deuda = aux;
	  }
	  
  }
  public void BuscarCliente(){
	  
	  
  }
  
  public void BuscarEmpleado(){
	  
	  
  }

public static int getCantEmpleados() {
	return cantEmpleados;
}

public static void setCantEmpleados(int cantEmpleados) {
	Empresa.cantEmpleados = cantEmpleados;
}

public static int getCantClientes() {
	return cantClientes;
}

public static void setCantClientes(int cantClientes) {
	Empresa.cantClientes = cantClientes;
}

public ArrayList<Factura> getCuentasPorCobrar() {
	return cuentasPorCobrar;
}

public void setCuentasPorCobrar(Factura cuentasPorCobrar) {
	this.cuentasPorCobrar.add(cuentasPorCobrar);
}


 
	
}
