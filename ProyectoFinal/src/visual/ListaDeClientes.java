package visual;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.TableColumnModel;


import javax.swing.table.DefaultTableModel;

import logical.Empresa;
import logical.Productos;
import logical.Clientes;

import javax.swing.JScrollPane;

public class ListaDeClientes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JScrollPane scrollPane = new JScrollPane();
	private JTextField txt_nombre;
	private JTextField txt_cedula;
	private JTextField txt_telefono;
	private JTable tbtClientes;
	private static DefaultTableModel tablemodel = new DefaultTableModel();;
	String[] columnNames = {"Codigo", "Nombre", "Cedula", "Telefono", "Dirreccion", "LimiteCredito"};
	private static Object[] fila;
	//private ModificarCliente MC;
	private String identificador;
	private NuevoCliente nuevoCliente;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaDeClientes frame = new ListaDeClientes();
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
	public ListaDeClientes() {
		
		this.identificador= "";
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 640, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(0, 0, 640, 218);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(23, 22, 151, 151);
		panel.add(panel_1);
		
		JLabel label_1 = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/usuario-96.png")).getImage();
		label_1.setIcon(new ImageIcon(img0));
		label_1.setBounds(27, 0, 96, 151);
		panel_1.add(label_1);
		
		JLabel lblListadoDeClientes = new JLabel("Listado de Clientes");
		lblListadoDeClientes.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblListadoDeClientes.setForeground(SystemColor.text);
		lblListadoDeClientes.setBounds(243, 6, 154, 16);
		panel.add(lblListadoDeClientes);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(SystemColor.text);
		lblNombre.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNombre.setBounds(186, 59, 61, 16);
		panel.add(lblNombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(259, 54, 260, 26);
		panel.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		JLabel lblCdula = new JLabel("Cédula:");
		lblCdula.setForeground(Color.WHITE);
		lblCdula.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula.setBounds(186, 97, 61, 16);
		panel.add(lblCdula);
		
		txt_cedula = new JTextField();
		txt_cedula.setColumns(10);
		txt_cedula.setBounds(259, 92, 216, 26);
		panel.add(txt_cedula);
		
		JLabel lblTelfono = new JLabel("Teléfono:");
		lblTelfono.setForeground(Color.WHITE);
		lblTelfono.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblTelfono.setBounds(186, 137, 73, 16);
		panel.add(lblTelfono);
		
		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(259, 132, 181, 26);
		panel.add(txt_telefono);
		
		JLabel label = new JLabel("Código:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		label.setBounds(23, 185, 49, 16);
		panel.add(label);
		
		JTextField txt_codigo = new JTextField();
		txt_codigo.setEnabled(false);
		txt_codigo.setColumns(10);
		txt_codigo.setBounds(76, 180, 98, 26);
		panel.add(txt_codigo);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int aux = Clientes.getCantClientes();
				Clientes.setCantSuplidores(aux-1);
				nuevoCliente = new NuevoCliente();
				Empresa.getinstance().Getclientes().get(tbtClientes.getSelectedRow());
				nuevoCliente.ModificarCliente(Empresa.getinstance().Getclientes().get(tbtClientes.getSelectedRow()), tbtClientes.getSelectedRow());
				nuevoCliente.show();
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/modificar-48.png")).getImage();
		btnModificar.setIcon(new ImageIcon(img1));
		btnModificar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnModificar.setActionCommand("OK");
		btnModificar.setBounds(68, 444, 131, 58);
		contentPane.add(btnModificar);
		
		JButton button = new JButton("Salir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tbtClientes.getModel();
				model.setRowCount(0);
				dispose();
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
		button.setIcon(new ImageIcon(img3));
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("Cancel");
		button.setBounds(453, 444, 118, 58);
		contentPane.add(button);
		
		JButton btnEliminar = new JButton("Eliminar");
		Image img2 = new ImageIcon(this.getClass().getResource("/eliminar-64.png")).getImage();
	
		btnEliminar.setIcon(new ImageIcon(img2));
		btnEliminar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnEliminar.setActionCommand("Cancel");
		btnEliminar.setBounds(267, 444, 118, 58);
		contentPane.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 229, 604, 204);
		contentPane.add(scrollPane);
		CargarTabla();
		
		//tbtClientes = new JTable();
		scrollPane.setViewportView(tbtClientes);
		/*tbtClientes.setModel(new DefaultTableModel(
			new Object[][] {
				{},
				{},
			},
			new String[] {
				, "New column", "New column"
			}
		));*/
	}
	public void CargarTabla() {

		
		tablemodel.setColumnIdentifiers(columnNames);
		fila = new Object[tablemodel.getColumnCount()];
		for (Clientes c : Empresa.getinstance().Getclientes()) {
			fila[0] = "CP-"+c.getCantClientes();
			fila[1] = c.getNombre();
			fila[2] = c.getCedula();
			fila[3] = c.getTelefono();
			fila[4] = c.getDireccion();
			fila[5] = c.getLimiteCredito();
			tablemodel.addRow(fila);
		}
		tbtClientes = new JTable();
		scrollPane.setViewportView(tbtClientes);
		tbtClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbtClientes.setModel(tablemodel);
		tbtClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		TableColumnModel columnModel = tbtClientes.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(60);
		columnModel.getColumn(1).setPreferredWidth(190);
		columnModel.getColumn(2).setPreferredWidth(110);
		columnModel.getColumn(3).setPreferredWidth(110);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(90);
	}
	
	
}
