package visual;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logical.ControlUser;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.Panel;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JSeparator;
import java.awt.Dimension;

public class PanelPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
 public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelPrincipal frame = new PanelPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 

	/**
	 * Create the frame.
	 */
	public PanelPrincipal() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				FileOutputStream empresa2;
				ObjectOutputStream empresaWrite;
				try {
					empresa2 = new  FileOutputStream("empresa.dat");
					empresaWrite = new ObjectOutputStream(empresa2);
					empresaWrite.writeObject(ControlUser.getInstance());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 620);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFacturar = new JMenu("  Facturar ");
		mnFacturar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				NuevaFactura newfactura = new NuevaFactura();
				newfactura.setVisible(true);
			}
		});
		mnFacturar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFacturar.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnFacturar.setHorizontalTextPosition(SwingConstants.CENTER);
		
		//Codigo para agregar iconos
		Image img0 = new ImageIcon(this.getClass().getResource("/facturar-48.png")).getImage();
		mnFacturar.setIcon(new ImageIcon(img0));
		//Fin de codigo para agregar iconos
		menuBar.add(mnFacturar);
		
		JMenu mnAlmacen = new JMenu("Almacen ");
		mnAlmacen.setHorizontalTextPosition(SwingConstants.CENTER);
		mnAlmacen.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnAlmacen.setBackground(new Color(255, 255, 255));
		//Codigo para agregar iconos
		Image img1 = new ImageIcon(this.getClass().getResource("/caja-48.png")).getImage();
		mnAlmacen.setIcon(new ImageIcon(img1));
		menuBar.add(mnAlmacen);
		
		JMenuItem mntmNuevoProducto = new JMenuItem("Añadir Producto");
		mntmNuevoProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AnadirProducto  newProducto = new AnadirProducto();
				newProducto.setVisible(true);
			}
		});
		mnAlmacen.add(mntmNuevoProducto);
		
		JMenuItem mntmListaDeProductos = new JMenuItem("Lista de Productos");
		mntmListaDeProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaDeProductos  newListaProducto = new ListaDeProductos();
				newListaProducto.setVisible(true);
			}
		});
		mnAlmacen.add(mntmListaDeProductos);
		
		JMenuItem mntmCrearKitPc = new JMenuItem("Crear Kit de PC");
		mntmCrearKitPc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearKit  newkit = new CrearKit();
				newkit.setVisible(true);	
			}
		});
		mntmCrearKitPc.setBackground(new Color(255, 255, 255));
		mntmCrearKitPc.setForeground(new Color(0, 0, 0));
		mnAlmacen.add(mntmCrearKitPc);
		
		JMenu mnClientes = new JMenu("Clientes ");
		mnClientes.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnClientes.setHorizontalTextPosition(SwingConstants.CENTER);
		
		//Codigo para agregar iconos
		Image img2 = new ImageIcon(this.getClass().getResource("/clientes-48.png")).getImage();
		mnClientes.setIcon(new ImageIcon(img2));
		menuBar.add(mnClientes);
		
		JMenuItem mntmNuevoCliente = new JMenuItem("Nuevo Cliente");
		mntmNuevoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NuevoCliente newclient = new NuevoCliente();
				newclient.setVisible(true);
			}
		});
		mnClientes.add(mntmNuevoCliente);
		
		JMenuItem mntmListaDeClientes = new JMenuItem("Lista de Clientes");
		mntmListaDeClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaDeClientes newclient = new ListaDeClientes();
				newclient.setVisible(true);
			}
		});
		mnClientes.add(mntmListaDeClientes);
		
		JMenu mnEmpleados = new JMenu("Empleados ");
		mnEmpleados.setHorizontalTextPosition(SwingConstants.CENTER);
		mnEmpleados.setVerticalTextPosition(SwingConstants.BOTTOM);
		//Codigo para agregar iconos
		Image img3 = new ImageIcon(this.getClass().getResource("/empleado-48.png")).getImage();
		mnEmpleados.setIcon(new ImageIcon(img3));
		menuBar.add(mnEmpleados);
		
		JMenuItem mntmNuevoEmpleado = new JMenuItem("Nuevo Empleado");
		mntmNuevoEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NuevoEmpleado newemple = new NuevoEmpleado();
				newemple.setVisible(true);
			}
		});
		mnEmpleados.add(mntmNuevoEmpleado);
		
		JMenuItem mntmListaDeEmpleados = new JMenuItem("Lista de Empleados");
		mntmListaDeEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaDeEmpleados newempleado = new ListaDeEmpleados();
				newempleado.setVisible(true);
			}
		});
		mnEmpleados.add(mntmListaDeEmpleados);
		
		JMenu mnNewMenu = new JMenu("Cuentas por C. ");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CuentasPorCobrar newCuenta= new CuentasPorCobrar();
				newCuenta.setVisible(true);
			}
		});
		
		mnNewMenu.setHorizontalTextPosition(SwingConstants.CENTER);
		mnNewMenu.setVerticalTextPosition(SwingConstants.BOTTOM);
		Image img4 = new ImageIcon(this.getClass().getResource("/presupuesto-48.png")).getImage();
		mnNewMenu.setIcon(new ImageIcon(img4));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Informes ");
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Informes newInformes= new Informes();
				newInformes.setVisible(true);
			}
		});
		mnNewMenu_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnNewMenu_1.setHorizontalTextPosition(SwingConstants.CENTER);
		//Codigo para agregar iconos
		Image img5 = new ImageIcon(this.getClass().getResource("/informe-48.png")).getImage();
		mnNewMenu_1.setIcon(new ImageIcon(img5));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnInventario = new JMenu("Inventario ");
		mnInventario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Inventario newInventario= new Inventario();
				newInventario.setVisible(true);
			}
		});
		mnInventario.setHorizontalTextPosition(SwingConstants.CENTER);
		mnInventario.setVerticalTextPosition(SwingConstants.BOTTOM);
		Image img6 = new ImageIcon(this.getClass().getResource("/inventario-48.png")).getImage();
		mnInventario.setIcon(new ImageIcon(img6));
		menuBar.add(mnInventario);
		
		JMenu mnNewMenu_2 = new JMenu("Configuración");
		
	//	if(!ControlUser.getLoginUser().getTipo().equalsIgnoreCase("Configuraci\u00F3n")){
		//	mnNewMenu_2.setEnabled(false);
	//	}
		//if(!Control.getLoginUser().getTipo().equalsIgnoreCase("Administrador")){
			//mnAdministracin.setEnabled(false);
		
		mnNewMenu_2.setHorizontalTextPosition(SwingConstants.CENTER);
		mnNewMenu_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		Image img7 = new ImageIcon(this.getClass().getResource("/ajustes-48.png")).getImage();
		mnNewMenu_2.setIcon(new ImageIcon(img7));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNuevoUsuario = new JMenuItem("Nuevo Usuario");
		mntmNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoUsuario newUsuario= new NuevoUsuario();
				newUsuario.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNuevoUsuario);
		
		JMenuItem mntmAdministrarUsuarios = new JMenuItem("Administrar Usuarios");
		mntmAdministrarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdministrarUsuarios newAdmiUsu= new AdministrarUsuarios();
				newAdmiUsu.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmAdministrarUsuarios);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPanelPrincipal = new JLabel("Panel Principal");
		lblPanelPrincipal.setForeground(new Color(255, 255, 255));
		lblPanelPrincipal.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblPanelPrincipal.setBounds(367, 0, 165, 33);
		contentPane.add(lblPanelPrincipal);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(0, 0, 907, 33);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		Image img8 = new ImageIcon(this.getClass().getResource("/logoP1111_opaco.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img8));
		lblNewLabel.setBounds(260, 66, 379, 395);
		contentPane.add(lblNewLabel);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(0, 493, 900, 34);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(176, 196, 222));
		panel_2.setBounds(0, 0, 219, 34);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblUsuarioAdmin = new JLabel("Usuario: admin");
		lblUsuarioAdmin.setBounds(62, 9, 95, 16);
		panel_2.add(lblUsuarioAdmin);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(176, 196, 222));
		panel_3.setBounds(219, 0, 326, 34);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblComputerstorerd = new JLabel("ComputerStoreRD@info.com");
		lblComputerstorerd.setBackground(new Color(176, 196, 222));
		lblComputerstorerd.setBounds(73, 9, 179, 16);
		panel_3.add(lblComputerstorerd);
	}
}


