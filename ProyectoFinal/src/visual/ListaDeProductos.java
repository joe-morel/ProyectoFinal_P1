package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.text.Position;

import logical.Empleados;
import logical.Empresa;
import logical.Productos;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ListaDeProductos extends JFrame {

	private JPanel contentPane;
	private JTable tbtProductos;
	private int aux=0;
	private static DefaultTableModel tablemodel = new DefaultTableModel();;
	private static Object[] fila;
	String[] columnNames = {"Codigo", "Tipo de Producto", "Marca", "Modelo", "Precio de Compra", "Precio de Venta","Cantidad"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaDeProductos frame = new ListaDeProductos();
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
	public ListaDeProductos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeProductos = new JLabel("lista de productos");
		lblListaDeProductos.setBounds(5, 5, 422, 16);
		contentPane.add(lblListaDeProductos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 67, 422, 227);
		contentPane.add(scrollPane);
		
		tbtProductos = new JTable();
		tbtProductos.setModel(new DefaultTableModel());
		
		JComboBox comboBox_sel = new JComboBox();
		comboBox_sel.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Harddrive", "Ram", "Procesador", "Motherboard", "Kit"}));
		comboBox_sel.setBounds(171, 32, 143, 22);
		contentPane.add(comboBox_sel);
		CargarTabla();
		scrollPane.setViewportView(tbtProductos);
		
		
	}
	
	public void CargarTabla() {
		tablemodel.setColumnIdentifiers(columnNames);
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			fila[0] = p.getCodigo();
			fila[1] = p.getTipoProducto();
			fila[2] = p.getMarca();
			fila[3] = p.getModelo();
			fila[4] = p.getPrecio();
			fila[5] = p.getPrecioVenta();
			fila[6] = p.getCant();
			tablemodel.addRow(fila);
		}
		tbtProductos = new JTable();
		tbtProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbtProductos.setModel(tablemodel);
		tbtProductos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		TableColumnModel columnModel = tbtProductos.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(50);
		columnModel.getColumn(1).setPreferredWidth(100);
		columnModel.getColumn(2).setPreferredWidth(100);
		columnModel.getColumn(3).setPreferredWidth(100);
		columnModel.getColumn(4).setPreferredWidth(120);
		columnModel.getColumn(5).setPreferredWidth(100);
		columnModel.getColumn(6).setPreferredWidth(100);
	}
}
