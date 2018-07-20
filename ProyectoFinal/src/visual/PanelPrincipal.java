package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
		
		mnFacturar.setIcon(new ImageIcon("/Users/joemorel/git/ProyectoFinal_P1/ProyectoFinal/img/icons8-caja-registradora-48.png"));
		menuBar.add(mnFacturar);
		
		JMenu mnAlmacen = new JMenu("Almacen ");
		mnAlmacen.setHorizontalTextPosition(SwingConstants.CENTER);
		mnAlmacen.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnAlmacen.setBackground(new Color(255, 255, 255));
		mnAlmacen.setIcon(new ImageIcon("/Users/joemorel/git/ProyectoFinal_P1/ProyectoFinal/img/icons8-caja-llena-48.png"));
		menuBar.add(mnAlmacen);
		
		JMenuItem mntmNuevoProducto = new JMenuItem("Añadir Producto");
		mnAlmacen.add(mntmNuevoProducto);
		
		JMenuItem mntmListaDeProductos = new JMenuItem("Lista de Productos");
		mnAlmacen.add(mntmListaDeProductos);
		
		JMenuItem mntmCrearKitPc = new JMenuItem("Crear Kit de PC");
		mntmCrearKitPc.setBackground(new Color(255, 255, 255));
		mntmCrearKitPc.setForeground(new Color(0, 0, 0));
		mnAlmacen.add(mntmCrearKitPc);
		
		JMenu mnClientes = new JMenu("Clientes ");
		mnClientes.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnClientes.setHorizontalTextPosition(SwingConstants.CENTER);
		mnClientes.setIcon(new ImageIcon("/Users/joemorel/git/ProyectoFinal_P1/ProyectoFinal/img/icons8-contactos-48.png"));
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
		mnClientes.add(mntmListaDeClientes);
		
		JMenu mnEmpleados = new JMenu("Empleados ");
		mnEmpleados.setHorizontalTextPosition(SwingConstants.CENTER);
		mnEmpleados.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnEmpleados.setIcon(new ImageIcon("/Users/joemorel/git/ProyectoFinal_P1/ProyectoFinal/img/icons8-tarjeta-de-empleado-48.png"));
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
		mnEmpleados.add(mntmListaDeEmpleados);
		
		JMenu mnNewMenu = new JMenu("Cuentas por C. ");
		mnNewMenu.setHorizontalTextPosition(SwingConstants.CENTER);
		mnNewMenu.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnNewMenu.setIcon(new ImageIcon("/Users/joemorel/git/ProyectoFinal_P1/ProyectoFinal/img/icons8-presupuesto-48.png"));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Informes ");
		mnNewMenu_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnNewMenu_1.setHorizontalTextPosition(SwingConstants.CENTER);
		mnNewMenu_1.setIcon(new ImageIcon("/Users/joemorel/git/ProyectoFinal_P1/ProyectoFinal/img/icons8-futuros-48.png"));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnInventario = new JMenu("Inventario ");
		mnInventario.setHorizontalTextPosition(SwingConstants.CENTER);
		mnInventario.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnInventario.setIcon(new ImageIcon("/Users/joemorel/git/ProyectoFinal_P1/ProyectoFinal/img/icons8-mostrar-propiedad-48.png"));
		menuBar.add(mnInventario);
		
		JMenu mnNewMenu_2 = new JMenu("Configuración");
		mnNewMenu_2.setHorizontalTextPosition(SwingConstants.CENTER);
		mnNewMenu_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		mnNewMenu_2.setIcon(new ImageIcon("/Users/joemorel/git/ProyectoFinal_P1/ProyectoFinal/img/icons8-ajustes-48.png"));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNuevoUsuario = new JMenuItem("Nuevo Usuario");
		mnNewMenu_2.add(mntmNuevoUsuario);
		
		JMenuItem mntmAdministrarUsuarios = new JMenuItem("Administrar Usuarios");
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
		panel.setBounds(-6, 0, 913, 33);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/joemorel/Downloads/logoP1111_opaco.png"));
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