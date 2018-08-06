package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class Inventario extends JFrame {

	private JPanel contentPane;
	private JTable tbt_inventario;
	private static DefaultTableModel tablemodel = new DefaultTableModel();;
	private ArrayList<String> columnNames = new ArrayList<String>();
	private static Object[] fila;
	JComboBox cbxTipo = new JComboBox();

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Inventario() {
			setResizable(false);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 640, 530);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 640, 92);
			panel.setLayout(null);
			panel.setBackground(new Color(0, 204, 153));
			contentPane.add(panel);
			Image img0 = new ImageIcon(this.getClass().getResource("/usuario-96.png")).getImage();
			
			JLabel lblAlmacen = new JLabel("Inventario");
			lblAlmacen.setForeground(Color.WHITE);
			lblAlmacen.setFont(new Font("Lucida Grande", Font.BOLD, 22));
			lblAlmacen.setBounds(261, 10, 117, 26);
			panel.add(lblAlmacen);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(0, 91, 640, 27);
			panel_2.setBackground(new Color(204, 255, 204));
			contentPane.add(panel_2);
			
			JLabel lblListaDeProductos = new JLabel("Lista de Productos");
			lblListaDeProductos.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			panel_2.add(lblListaDeProductos);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 168, 604, 258);
			contentPane.add(scrollPane);
			
			//tabla//
			scrollPane.setViewportView(tbt_inventario);
			
			tbt_inventario = new JTable();
			scrollPane.setViewportView(tbt_inventario);
			Image img1 = new ImageIcon(this.getClass().getResource("/modificar-48.png")).getImage();
			Image img2 = new ImageIcon(this.getClass().getResource("/eliminar-64.png")).getImage();
			
			JButton button_2 = new JButton("Salir");
			button_2.setBounds(453, 437, 118, 58);
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			Image img3 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
			button_2.setIcon(new ImageIcon(img3));
			button_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			button_2.setActionCommand("Cancel");
			contentPane.add(button_2);
			
			JComboBox cbxTipo = new JComboBox();
			cbxTipo.setBounds(239, 129, 146, 22);
			contentPane.add(cbxTipo);
			
			
			cbxTipo.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if ((cbxTipo.getSelectedItem().toString() == "Procesador")) {
						DefaultTableModel model = (DefaultTableModel) tbt_inventario.getModel();
						model.setColumnCount(0);
						model.setRowCount(0);
						columnNames.clear();
						columnNames.add("Codigo");
						columnNames.add("Tipo Producto");
						columnNames.add("Marca");
						columnNames.add("Modelo");
						columnNames.add("Precio de Costo");
						columnNames.add("Precio de Venta");
						columnNames.add("Cantidad disponible");
						columnNames.add("Soket");
						columnNames.add("velocidadBase");
						columnNames.add("velocidadTurbo");
						columnNames.add("Unlock");
						
						CargarTablaProcesador();
						
					} else if ((cbxTipo.getSelectedItem().toString()) == "RAM" ) {
						DefaultTableModel model = (DefaultTableModel) tbt_inventario.getModel();
						model.setColumnCount(0);
						model.setRowCount(0);
						columnNames.clear();
						columnNames.add("Codigo");
						columnNames.add("Tipo Producto");
						columnNames.add("Marca");
						columnNames.add("Modelo");
						columnNames.add("Precio de Costo");
						columnNames.add("Precio de Venta");
						columnNames.add("Cantidad disponible");
						columnNames.add("Cantidad de GB");
						columnNames.add("Tipo");
						columnNames.add("speed");
						
						CargarTablaRam();
					}else if ((cbxTipo.getSelectedItem().toString()) == "HardDrive") {
						DefaultTableModel model = (DefaultTableModel) tbt_inventario.getModel();
						model.setColumnCount(0);
						model.setRowCount(0);
						columnNames.clear();
						columnNames.add("Codigo");
						columnNames.add("Tipo Producto");
						columnNames.add("Marca");
						columnNames.add("Modelo");
						columnNames.add("Precio de Costo");
						columnNames.add("Precio de Venta");
						columnNames.add("Cantidad disponible");
						columnNames.add("Cantidad de GB");
						columnNames.add("Tipo de conexcion");
						columnNames.add("write Speed");
						columnNames.add("Read Speed");
					
						CargarTablaHardDrive();
					}else if ((cbxTipo.getSelectedItem().toString()) == "Motherboard") {
						DefaultTableModel model = (DefaultTableModel) tbt_inventario.getModel();
						model.setColumnCount(0);
						model.setRowCount(0);
						columnNames.clear();
						columnNames.add("Codigo");
						columnNames.add("Tipo Producto");
						columnNames.add("Marca");
						columnNames.add("Modelo");
						columnNames.add("Precio de Costo");
						columnNames.add("Precio de Venta");
						columnNames.add("Cantidad disponible");
						columnNames.add("Socket");
						columnNames.add("Tipo RAM");
						columnNames.add("Cantidad Slots RAM");
						columnNames.add("Cantidad IDE");
						columnNames.add("Cantidad Sata");
						CargarTablaMotherboard();
					}else if ((cbxTipo.getSelectedItem().toString()) == "Kits") {
						DefaultTableModel model = (DefaultTableModel) tbt_inventario.getModel();
						model.setColumnCount(0);
						model.setRowCount(0);
						columnNames.clear();
						columnNames.add("Codigo");
						columnNames.add("Tipo Producto");
						columnNames.add("Modelo");
						columnNames.add("Precio de Costo");
						columnNames.add("Precio de Venta");
						columnNames.add("Cantidad disponible");
						CargarTablaKits();
					}
				}
			});
			cbxTipo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Procesador", "RAM", "HardDrive", "Motherboard", "Kits"}));
			contentPane.add(cbxTipo);
			
			for (Productos p : Empresa.getinstance().GetProducto()) {
				if(p.getCant()<=50) {
					@SuppressWarnings("unused")
					String respuesta = JOptionPane.showInputDialog(null, "Digite nuevo valor para pedido de producto: \ntipo-"+ p.getTipoProducto() +"\nMarca-" + p.getMarca() + " \nModelo-"+ p.getModelo() + "\n El valor debe de ser mayor a 50");
					while ( respuesta.isEmpty() == true) {
						respuesta = JOptionPane.showInputDialog(null, "Digite nuevo valor para pedido de producto: \ntipo-"+ p.getTipoProducto() +"\nMarca-" + p.getMarca() + " \nModelo-"+ p.getModelo() + "\n El valor debe de ser mayor a 50");
					}
					Empresa.getinstance().EditProductos(p.getModelo(), p.getCant() + Integer.valueOf(respuesta));
				}
			}
			
			
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
		
			// tbt_inventario = new JTable();
			tbt_inventario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tbt_inventario.setModel(tablemodel);
			tbt_inventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			TableColumnModel columnModel = tbt_inventario.getColumnModel();
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
		
			// tbt_inventario = new JTable();
			tbt_inventario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tbt_inventario.setModel(tablemodel);
			tbt_inventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			TableColumnModel columnModel = tbt_inventario.getColumnModel();
			
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
		
			// tbt_inventario = new JTable();
			tbt_inventario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tbt_inventario.setModel(tablemodel);
			tbt_inventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			TableColumnModel columnModel = tbt_inventario.getColumnModel();
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
		
			//tbt_inventario = new JTable();
			tbt_inventario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tbt_inventario.setModel(tablemodel);
			tbt_inventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			TableColumnModel columnModel = tbt_inventario.getColumnModel();
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
					fila[5] = p.getCant();
					tablemodel.addRow(fila);

				}
			}
		
			//tbt_inventario = new JTable();
			tbt_inventario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tbt_inventario.setModel(tablemodel);
			tbt_inventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			TableColumnModel columnModel = tbt_inventario.getColumnModel();
			
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

