package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.text.Position;

import logical.Empleados;
import logical.Empresa;
import logical.HardDrive;
import logical.Motherboard;
import logical.Procesador;
import logical.Productos;
import logical.Ram;
import logical.kits;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.List;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

public class ListaDeProductos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	//private JTable tbt_productos;
	private static DefaultTableModel tablemodel = new DefaultTableModel();;
	private ArrayList<String> columnNames = new ArrayList<String>();
	private static Object[] fila;
	//private int aux_Procesador = 0, aux_Ram = 0, aux_HardDrive= 0, aux_kits=0, aux_Motherboard = 0 ;
	JComboBox cbxTipo = new JComboBox();
	private JTable tbt_productos;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ListaDeProductos() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 204, 153));
		panel.setBounds(0, 0, 640, 171);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(29, 10, 151, 124);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/usuario-96.png")).getImage();
		label.setIcon(new ImageIcon(img0));
		label.setBounds(27, -13, 96, 151);
		panel_1.add(label);
		
		JLabel lblAlmacen = new JLabel("ALMACEN");
		lblAlmacen.setForeground(Color.WHITE);
		lblAlmacen.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblAlmacen.setBounds(261, 10, 117, 26);
		panel.add(lblAlmacen);
		
		JLabel label_2 = new JLabel("Codigo:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		label_2.setBounds(29, 140, 67, 21);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(87, 137, 93, 26);
		panel.add(textField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(236, 57, 384, 104);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTotales = new JLabel("Totales:");
		lblTotales.setForeground(new Color(255, 0, 51));
		lblTotales.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 20));
		lblTotales.setBounds(43, 35, 91, 35);
		panel_3.add(lblTotales);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 36, 188, 33);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 204));
		panel_2.setBounds(0, 171, 640, 27);
		contentPane.add(panel_2);
		
		JLabel lblListaDeProductos = new JLabel("Lista de Productos");
		lblListaDeProductos.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_2.add(lblListaDeProductos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 221, 604, 204);
		contentPane.add(scrollPane);
		
		//tabla//
		scrollPane.setViewportView(tbt_productos);
		
		tbt_productos = new JTable();
		scrollPane.setViewportView(tbt_productos);
		
		JButton button = new JButton("Modificar");
		Image img1 = new ImageIcon(this.getClass().getResource("/modificar-48.png")).getImage();
		button.setIcon(new ImageIcon(img1));
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("OK");
		button.setBounds(68, 437, 131, 58);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Eliminar");
		Image img2 = new ImageIcon(this.getClass().getResource("/eliminar-64.png")).getImage();
		button_1.setIcon(new ImageIcon(img2));
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_1.setActionCommand("Cancel");
		button_1.setBounds(267, 437, 118, 58);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Salir");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
		button_2.setIcon(new ImageIcon(img3));
		button_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_2.setActionCommand("Cancel");
		button_2.setBounds(453, 437, 118, 58);
		contentPane.add(button_2);
		
		
		cbxTipo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if ((cbxTipo.getSelectedItem().toString() == "Procesador")) {
					DefaultTableModel model = (DefaultTableModel) tbt_productos.getModel();
					model.setColumnCount(0);
					model.setRowCount(0);
					columnNames.clear();
					columnNames.add("Codigo");
					columnNames.add("Tipo Producto");
					columnNames.add("Marca");
					columnNames.add("Modelo");
					columnNames.add("Precio de Costo");
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
					columnNames.add("Codigo");
					columnNames.add("Tipo Producto");
					columnNames.add("Marca");
					columnNames.add("Modelo");
					columnNames.add("Precio de Costo");
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
					columnNames.add("Codigo");
					columnNames.add("Tipo Producto");
					columnNames.add("Marca");
					columnNames.add("Modelo");
					columnNames.add("Precio de Costo");
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
					columnNames.add("Codigo");
					columnNames.add("Tipo Producto");
					columnNames.add("Marca");
					columnNames.add("Modelo");
					columnNames.add("Precio de Costo");
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
					columnNames.add("Tipo Producto");
					columnNames.add("Modelo");
					columnNames.add("Precio de Costo");
					columnNames.add("Precio de Venta");
					CargarTablaKits();
				}
			}
		});
		cbxTipo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Procesador", "RAM", "HardDrive", "Motherboard", "Kits"}));
		cbxTipo.setBounds(239, 200, 146, 22);		
		contentPane.add(cbxTipo);
	}
	/**
	 * 
	 */
	public void CargarTablaProcesador() {
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof Procesador) {
				fila[0] = p.getCodigo();
				fila[1] = p.getTipoProducto();
				fila[2] = p.getMarca();
				fila[3] = p.getModelo();
				fila[4] = p.getPrecio();
				fila[5] = p.getPrecioVenta();
				fila[6] = p.getCant();
				fila[7] = ((Procesador) p).getSocket();
				fila[8] = ((Procesador) p).getVelocidadBase();
				fila[9] = ((Procesador) p).getVelocidadTurbo();
				if (((Procesador) p).isUnlock() == false) {
					fila[10] = "No";
				}else if(((Procesador) p).isUnlock() == true) {
					fila[10] = "Si";	
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
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof Ram) {
				fila[0] = p.getCodigo();
				fila[1] = p.getTipoProducto();
				fila[2] = p.getMarca();
				fila[3] = p.getModelo();
				fila[4] = p.getPrecio();
				fila[5] = p.getPrecioVenta();
				fila[6] = p.getCant();
				fila[7] = ((Ram) p).getCantGB();
				fila[8] = ((Ram) p).getTipoDDR();
				fila[9] = ((Ram) p).getSpeed();
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
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof HardDrive) {
				fila[0] = p.getCodigo();
				fila[1] = p.getTipoProducto();
				fila[2] = p.getMarca();
				fila[3] = p.getModelo();
				fila[4] = p.getPrecio();
				fila[5] = p.getPrecioVenta();
				fila[6] = p.getCant();
				fila[7] = ((HardDrive) p).getCantGB();
				fila[8] = ((HardDrive) p).getWrSpeed();
				fila[9] = ((HardDrive) p).getRdSpeed();
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
	/**
	 * 
	 */
	/**
	 * 
	 */
	public void CargarTablaMotherboard() {
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
		if(p instanceof Motherboard) {
				fila[0] = p.getCodigo();
				fila[1] = p.getTipoProducto();
				fila[2] = p.getMarca();
				fila[3] = p.getModelo();
				fila[4] = p.getPrecio();
				fila[5] = p.getPrecioVenta();
				fila[6] = p.getCant();
				fila[7] = ((Motherboard) p).getSocketProcesador();
				fila[8] = ((Motherboard) p).getTipoRam();
				fila[9] = ((Motherboard) p).getCantSlotsRam();
				fila[10] = ((Motherboard) p).getCantIDE();
				fila[11] = ((Motherboard) p).getCantSata();
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
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof kits) {
				fila[0] = p.getCodigo();
				fila[1] = p.getTipoProducto();
				fila[2] = p.getModelo();
				fila[3] = p.getPrecio();
				fila[4] = p.getPrecioVenta();
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
}

