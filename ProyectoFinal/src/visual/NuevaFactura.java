package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import logical.Clientes;
import logical.Empresa;
import logical.Factura;
import logical.HardDrive;
import logical.Motherboard;
import logical.Procesador;
import logical.Productos;
import logical.Ram;
import logical.kits;

import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.Component;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class NuevaFactura extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JRadioButton rbtnContado;
	private JRadioButton rbtnCredito;
	private JTextField textField_8;
	
	private static DefaultTableModel tablemodel = new DefaultTableModel();;
	private static DefaultTableModel tablemodel1 = new DefaultTableModel();;
	private ArrayList<String> columnNames = new ArrayList<String>();
	private String[] columnNames1 = {"Marca", "Modelo", "Precio venta", "Cantidad"};
	private ArrayList<Productos> productos = new ArrayList<Productos>();
	private static Object[] fila;
	private JTable tbt_productos ;
	JComboBox cbxTipo = new JComboBox();
	private JTable tableFactura;
	private static String pp = null;
	private static String codigo;
	private static Factura tt = null;
	private float total = 0;
	private JComboBox cbxClientes;


	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public NuevaFactura() {
		setBounds(100, 100, 900, 620);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 900, 54);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblFacturacin = new JLabel("Facturación");
		lblFacturacin.setForeground(new Color(0, 102, 153));
		lblFacturacin.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblFacturacin.setBounds(372, 9, 155, 36);
		panel.add(lblFacturacin);
		{
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(0, 102, 153));
			panel_1.setBounds(0, 54, 900, 151);
			contentPanel.add(panel_1);
			panel_1.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Cliente:");
				lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setBounds(17, 31, 61, 16);
				panel_1.add(lblNewLabel);
			}
			
			JLabel lblCdula = new JLabel("Cédula:");
			lblCdula.setForeground(Color.WHITE);
			lblCdula.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblCdula.setBounds(17, 70, 61, 16);
			panel_1.add(lblCdula);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(90, 65, 139, 26);
			panel_1.add(textField_1);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "M\u00E9todo de Pago", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
			panel_2.setBounds(700, 28, 168, 95);
			panel_1.add(panel_2);
			panel_2.setLayout(null);
			
			 rbtnContado = new JRadioButton("Al Contado");
			 rbtnContado.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		rbtnContado.setSelected(true);
			 		rbtnCredito.setSelected(false);
			 	}
			 });
			rbtnContado.setBounds(18, 24, 141, 23);
			panel_2.add(rbtnContado);
			
			rbtnCredito = new JRadioButton("A Crédito");
			rbtnCredito.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					rbtnContado.setSelected(false);
					rbtnCredito.setEnabled(true);
				}
			});
			rbtnCredito.setBounds(18, 59, 141, 23);
			panel_2.add(rbtnCredito);
			
			JLabel lblTl = new JLabel("Télefono:");
			lblTl.setForeground(Color.WHITE);
			lblTl.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblTl.setBounds(17, 107, 88, 16);
			panel_1.add(lblTl);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(100, 103, 129, 26);
			panel_1.add(textField_2);
			
			JLabel lblCajero = new JLabel("Cajero:");
			lblCajero.setForeground(Color.WHITE);
			lblCajero.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblCajero.setBounds(262, 31, 61, 16);
			panel_1.add(lblCajero);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(335, 26, 139, 26);
			panel_1.add(textField_3);
			
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setForeground(Color.WHITE);
			lblUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblUsuario.setBounds(262, 70, 74, 16);
			panel_1.add(lblUsuario);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(335, 65, 139, 26);
			panel_1.add(textField_4);
			
			JLabel lblFecha_1 = new JLabel("Fecha:");
			lblFecha_1.setForeground(Color.WHITE);
			lblFecha_1.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
			lblFecha_1.setBounds(262, 108, 74, 16);
			panel_1.add(lblFecha_1);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(335, 103, 139, 26);
			panel_1.add(textField_5);
			
			JLabel lblNoFact = new JLabel("Fact. #:");
			lblNoFact.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
			lblNoFact.setForeground(UIManager.getColor("Button.highlight"));
			lblNoFact.setBounds(496, 67, 61, 16);
			panel_1.add(lblNoFact);
			
			textField_6 = new JTextField();
			textField_6.setBounds(553, 62, 74, 26);
			panel_1.add(textField_6);
			textField_6.setColumns(10);
			
			
			
			ArrayList<String>seleccione= new ArrayList<String>();
			for (Clientes c : Empresa.getinstance().Getclientes()) {
				seleccione.add(c.getNombre());
			}
			cbxClientes = new JComboBox();
			cbxClientes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Clientes c = Empresa.getinstance().BuscarCliente(cbxClientes.getSelectedIndex());
					textField_1.setText(c.getCedula());
					textField_2.setText(c.getTelefono());
					
					
				}
			});
			cbxClientes.setBounds(90, 28, 147, 27);
			panel_1.add(cbxClientes);
			cbxClientes.setModel(new DefaultComboBoxModel(seleccione.toArray()));
			
			
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 249, 440, 262);
		contentPanel.add(scrollPane);
		
		tbt_productos = new JTable();
		scrollPane.setViewportView(tbt_productos);
		
		////////
		cbxTipo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if ((cbxTipo.getSelectedItem().toString() == "Procesador")) {
					DefaultTableModel model = (DefaultTableModel) tbt_productos.getModel();
					model.setColumnCount(0);
					model.setRowCount(0);
					columnNames.clear();
					columnNames.add("Marca");
					columnNames.add("Modelo");
					columnNames.add("Precio de Venta");
					columnNames.add("Cantidad");
					columnNames.add("Soket");
					columnNames.add("velocidadBase");
					columnNames.add("velocidadTurbo");
					columnNames.add("Unlock");
					CargarTablaProcesador();
					
				} else if ((cbxTipo.getSelectedItem().toString()) == "RAM" ) {
					DefaultTableModel model = (DefaultTableModel) tbt_productos.getModel();
					model.setColumnCount(0);
					model.setRowCount(0);
					columnNames.clear();
					columnNames.add("Marca");
					columnNames.add("Modelo");
					columnNames.add("Precio de Venta");
					columnNames.add("Cantidad");
					columnNames.add("Cantidad de GB");
					columnNames.add("Tipo");
					columnNames.add("speed");
					CargarTablaRam();
				}else if ((cbxTipo.getSelectedItem().toString()) == "HardDrive") {
					DefaultTableModel model = (DefaultTableModel) tbt_productos.getModel();
					model.setColumnCount(0);
					model.setRowCount(0);
					columnNames.clear();
					columnNames.add("Marca");
					columnNames.add("Modelo");
					columnNames.add("Precio de Venta");
					columnNames.add("Cantidad");
					columnNames.add("Cantidad de GB");
					columnNames.add("Tipo de conexcion");
					columnNames.add("write Speed");
					columnNames.add("Read Speed");
					CargarTablaHardDrive();
				}else if ((cbxTipo.getSelectedItem().toString()) == "Motherboard") {
					DefaultTableModel model = (DefaultTableModel) tbt_productos.getModel();
					model.setColumnCount(0);
					model.setRowCount(0);
					columnNames.clear();
					columnNames.add("Marca");
					columnNames.add("Modelo");
					columnNames.add("Precio de Venta");
					columnNames.add("Cantidad");
					columnNames.add("Socket");
					columnNames.add("Tipo RAM");
					columnNames.add("Cantidad Slots RAM");
					columnNames.add("Cantidad IDE");
					columnNames.add("Cantidad Sata");
					CargarTablaMotherboard();
				}else if ((cbxTipo.getSelectedItem().toString()) == "Kits") {
					DefaultTableModel model = (DefaultTableModel) tbt_productos.getModel();
					model.setColumnCount(0);
					model.setRowCount(0);
					columnNames.clear();
					columnNames.add("Codigo");
					columnNames.add("Modelo");
					columnNames.add("Precio de Venta");
					CargarTablaKits();
				}
			}
		});
		cbxTipo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Procesador", "RAM", "HardDrive", "Motherboard", "Kits"}));
		cbxTipo.setBounds(240, 218, 146, 22);		
		contentPanel.add(cbxTipo);
			
		
		///////////
		
		
		
		
		JButton button = new JButton("Añadir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String modelo = (String)tbt_productos.getValueAt(tbt_productos.getSelectedRow(), tbt_productos.getSelectedColumn());
				 Productos p2 = Empresa.getinstance().BuscarProductoModelo(modelo);
				 int cant = p2.getCant();
					System.out.println(cant);
					
					if (p2 != null) {
						if (p2 instanceof Procesador) {
							String respuesta = JOptionPane.showInputDialog("Inserte la cantidad de que desea:");
							Procesador p = new Procesador((((Procesador)p2).getPrecio()), (((Procesador)p2).getPrecioVenta()), (((Procesador)p2).getCant()), (((Procesador)p2).getCodigo()), (((Procesador)p2).getMarca()), (((Procesador)p2).getModelo()), (((Procesador)p2).getTipoProducto()), (((Procesador)p2).getSocket()), (((Procesador)p2).getVelocidadBase()), (((Procesador)p2).getVelocidadTurbo()), (((Procesador)p2).isUnlock()));
							p.setCant(Integer.valueOf(respuesta));
							Empresa.getinstance().EditProductos(modelo, cant-1);
							System.out.println(cant);
							productos.add(p);
							CargarTablaProcesador();
						}else if(p2 instanceof Motherboard) {
							String respuesta = JOptionPane.showInputDialog("Inserte la cantidad de que desea:");
							Motherboard m = new Motherboard((((Motherboard)p2).getPrecio()), (((Motherboard)p2).getPrecioVenta()), (((Motherboard)p2).getCant()), (((Motherboard)p2).getCodigo()), (((Motherboard)p2).getMarca()), (((Motherboard)p2).getModelo()), (((Motherboard)p2).getTipoProducto()), (((Motherboard)p2).getMarcaProcesadores()), (((Motherboard)p2).getSocketProcesador()), (((Motherboard)p2).getTipoRam()), (((Motherboard)p2).getCantIDE()), (((Motherboard)p2).getCantM2()) ,(((Motherboard)p2).getCantSata()), (((Motherboard)p2).getCantSlotsRam()), (((Motherboard)p2).isMultiCHSUP()));
							m.setCant(Integer.valueOf(respuesta));
							Empresa.getinstance().EditProductos(modelo, cant-1);
							productos.add(m);
							CargarTablaMotherboard();
						}else if(p2 instanceof HardDrive) {
							String respuesta = JOptionPane.showInputDialog("Inserte la cantidad de que desea:");
							HardDrive a = new HardDrive((((HardDrive)p2).getPrecio()), (((HardDrive)p2).getPrecioVenta()), (((HardDrive)p2).getCant()), (((HardDrive)p2).getCodigo()), (((HardDrive)p2).getMarca()), (((HardDrive)p2).getModelo()), (((HardDrive)p2).getTipoProducto()), (((HardDrive)p2).getCantGB()), (((HardDrive)p2).getTipoConexion()), (((HardDrive)p2).getWrSpeed()), (((HardDrive)p2).getRdSpeed()));
							a.setCant(Integer.valueOf(respuesta));
							Empresa.getinstance().EditProductos(modelo, cant-1);
							productos.add(a);
							CargarTablaHardDrive();
						}else if(p2 instanceof Ram) {
							String respuesta = JOptionPane.showInputDialog("Inserte la cantidad de que desea:");
							Ram k = new Ram((((Ram)p2).getPrecio()), (((Ram)p2).getPrecioVenta()), (((Ram)p2).getCant()), (((Ram)p2).getCodigo()), (((Ram)p2).getMarca()), (((Ram)p2).getModelo()), (((Ram)p2).getTipoProducto()), (((Ram)p2).getCantGB()),(((Ram)p2).getTipoDDR()), (((Ram)p2).getSpeed()), (((Ram)p2).isMultiCHSUP() ));
							k.setCant(Integer.valueOf(respuesta));
							Empresa.getinstance().EditProductos(modelo, cant-1);
							productos.add(k);
							CargarTablaRam();
						}
						
						loadFactura();
					} else {
						JOptionPane.showConfirmDialog(null, "debe seleccionar el modelo");
					}
					total=0;
					for (Productos p : productos) {
					
					//	total += p.getPrecioVenta();
						total = total+(p.getCant()*p.getPrecioVenta());
						
					}
			textField_8.setText((String.valueOf(total)));
					
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/agregar.png")).getImage();
		button.setIcon(new ImageIcon(img1));
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("OK");
		button.setBounds(18, 523, 131, 58);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("Eliminar");
		Image img2 = new ImageIcon(this.getClass().getResource("/eliminar-64.png")).getImage();
		button_1.setIcon(new ImageIcon(img2));
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_1.setActionCommand("Cancel");
		button_1.setBounds(161, 523, 118, 58);
		contentPanel.add(button_1);
		
		JButton btnFacturar = new JButton("FACTURAR!");
		btnFacturar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbtnCredito.isSelected()){
					Clientes cli = Empresa.getinstance().BuscarCliente(cbxClientes.getSelectedIndex());
					Factura f = new  Factura( productos, cli, total, "222");
					Empresa.getinstance().setCuentasPorCobrar(f);
				} else {
					Clientes cli = Empresa.getinstance().BuscarCliente(cbxClientes.getSelectedIndex());
					Factura f = new  Factura( productos, cli, total, "222");
					Empresa.getinstance().AddFactura(f);
				}
				JOptionPane.showMessageDialog(null, "Facturacion realizada con exito!","555", JOptionPane.INFORMATION_MESSAGE);
				dispose();
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/Factura.png")).getImage();
		btnFacturar.setIcon(new ImageIcon(img3));
		btnFacturar.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		btnFacturar.setActionCommand("OK");
		btnFacturar.setBounds(291, 523, 147, 58);
		contentPanel.add(btnFacturar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("InternalFrame.paletteBackground"));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(452, 523, 440, 69);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setForeground(new Color(255, 0, 0));
		lblTotal.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 17));
		lblTotal.setBounds(27, 24, 72, 16);
		panel_1.add(lblTotal);
		
		textField_8 = new JTextField();
		textField_8.setBounds(111, 21, 130, 26);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/efectivo5.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img4));
		lblNewLabel_4.setBounds(293, 6, 72, 54);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Lista de Productos");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(81, 221, 147, 16);
		contentPanel.add(lblNewLabel_2);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(452, 249, 440, 262);
		contentPanel.add(scrollPane1);
		
		tableFactura = new JTable();
		
		
		
		scrollPane1.setViewportView(tableFactura);
		
		JLabel lblCarrito = new JLabel("Carrito");
		lblCarrito.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCarrito.setBounds(646, 221, 62, 16);
		contentPanel.add(lblCarrito);
	}
	
	public void CargarTablaProcesador() {
		tablemodel.setRowCount(0);
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof Procesador) {
				
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				fila[4] = ((Procesador) p).getSocket();
				fila[5] = ((Procesador) p).getVelocidadBase();
				fila[6] = ((Procesador) p).getVelocidadTurbo();
				if (((Procesador) p).isUnlock() == false) {
					fila[7] = "No";
				}else if(((Procesador) p).isUnlock() == true) {
					fila[7] = "Si";	
				}
				tablemodel.addRow(fila);

			}
		}
		

		// tbt_productos = new JTable();
		tbt_productos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbt_productos.setModel(tablemodel);
		tbt_productos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = tbt_productos.getColumnModel();
		/*columnModel.getColumn(0).setPreferredWidth(50);
		columnModel.getColumn(1).setPreferredWidth(171);
		columnModel.getColumn(2).setPreferredWidth(110);
		columnModel.getColumn(3).setPreferredWidth(110);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(60);
		columnModel.getColumn(6).setPreferredWidth(171);
		columnModel.getColumn(7).setPreferredWidth(110);
		columnModel.getColumn(8).setPreferredWidth(110);
		columnModel.getColumn(9).setPreferredWidth(150);
		columnModel.getColumn(10).setPreferredWidth(60);*/
		
	}
	
	public void CargarTablaRam() {
		tablemodel.setRowCount(0);
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof Ram) {
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				fila[4] = ((Ram) p).getCantGB();
				fila[5] = ((Ram) p).getTipoDDR();
				fila[6] = ((Ram) p).getSpeed();
				tablemodel.addRow(fila);
			}

				// tablemodel.addRow(fila);
		}
		// tbt_productos = new JTable();
				tbt_productos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				tbt_productos.setModel(tablemodel);
				tbt_productos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				TableColumnModel columnModel = tbt_productos.getColumnModel();
				
			}
	
	public void CargarTablaHardDrive() {
		tablemodel.setRowCount(0);
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof HardDrive) {
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				fila[4] = ((HardDrive) p).getCantGB();
				fila[5] = ((HardDrive) p).getWrSpeed();
				fila[6] = ((HardDrive) p).getRdSpeed();
				tablemodel.addRow(fila);

			}
				// tablemodel.addRow(fila);
		}
	
		// tbt_productos = new JTable();
		tbt_productos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbt_productos.setModel(tablemodel);
		tbt_productos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = tbt_productos.getColumnModel();
		/*columnModel.getColumn(0).setPreferredWidth(50);
		columnModel.getColumn(1).setPreferredWidth(171);
		columnModel.getColumn(2).setPreferredWidth(110);
		columnModel.getColumn(3).setPreferredWidth(110);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(60);
		columnModel.getColumn(6).setPreferredWidth(171);
		columnModel.getColumn(7).setPreferredWidth(110);
		columnModel.getColumn(8).setPreferredWidth(110);
		columnModel.getColumn(9).setPreferredWidth(150);
		columnModel.getColumn(10).setPreferredWidth(60);*/
		
	}
	public void CargarTablaMotherboard() {
		tablemodel.setRowCount(0);
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
		if(p instanceof Motherboard) {
			
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				fila[4] = ((Motherboard) p).getMarcaProcesadores();
				fila[5] = ((Motherboard) p).getSocketProcesador();
				fila[6] = ((Motherboard) p).getTipoRam();
				fila[7] = ((Motherboard) p).getCantSlotsRam();
				fila[8] = ((Motherboard) p).getCantIDE();
				fila[9] = ((Motherboard) p).getCantSata();
				tablemodel.addRow(fila);

			}
		}
	
		//tbt_productos = new JTable();
		tbt_productos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbt_productos.setModel(tablemodel);
		tbt_productos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = tbt_productos.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(50);
		columnModel.getColumn(1).setPreferredWidth(171);
		columnModel.getColumn(2).setPreferredWidth(110);
		columnModel.getColumn(3).setPreferredWidth(110);
		
	}
	
	
	public void CargarTablaKits() {
		tablemodel.setRowCount(0);
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof kits) {
				fila[0] = p.getCodigo();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				tablemodel.addRow(fila);

			}
		}
	
		//tbt_productos = new JTable();
		tbt_productos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbt_productos.setModel(tablemodel);
		tbt_productos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = tbt_productos.getColumnModel();
		
		/*columnModel.getColumn(0).setPreferredWidth(50);
		columnModel.getColumn(1).setPreferredWidth(171);
		columnModel.getColumn(2).setPreferredWidth(110);
		columnModel.getColumn(3).setPreferredWidth(110);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(60);
		columnModel.getColumn(6).setPreferredWidth(171);
		columnModel.getColumn(7).setPreferredWidth(110);
		columnModel.getColumn(8).setPreferredWidth(110);
		columnModel.getColumn(9).setPreferredWidth(150);
		columnModel.getColumn(10).setPreferredWidth(60);*/
		
	}
	
	public void loadFactura(){
		tablemodel1.setRowCount(0);
		tablemodel1.setColumnIdentifiers(columnNames1);
		fila = new Object[tablemodel1.getColumnCount()];
		
		for (Productos p : productos) {
			if(p instanceof Procesador) {
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				tablemodel1.addRow(fila);
			}
			
			if(p instanceof Motherboard) {
				
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				tablemodel1.addRow(fila);

			}
			if(p instanceof HardDrive) {
				
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				tablemodel1.addRow(fila);

			}
			if(p instanceof Ram) {
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				tablemodel1.addRow(fila);
			}
			
		
		}
		
		tableFactura.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableFactura.setModel(tablemodel1);
		tableFactura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = tableFactura.getColumnModel();
	
	
		
	}
	
	
	
	
	
	
}
