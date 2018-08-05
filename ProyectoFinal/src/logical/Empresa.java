package logical;

import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6248502753801597548L;

	public static Empresa empresa=null;
	
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
	public Clientes BuscarCliente(int Buscar){
		return this.misClientes.get(Buscar);
	}
	///// 
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
	  Empleados c = this.misEmpleados.remove(idex);
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
 
	
}
