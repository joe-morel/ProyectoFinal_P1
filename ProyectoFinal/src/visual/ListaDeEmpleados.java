package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import logical.Clientes;
import logical.Empleados;
import logical.Empresa;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ListaDeEmpleados extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JScrollPane scrollPane = new JScrollPane();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable tbtEmpleados;
	private static DefaultTableModel tablemodel = new DefaultTableModel();;
	String[] columnNames = {"Codigo", "Nombre", "Cedula", "Telefono", "Dirreccion"};
	private static Object[] fila;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaDeEmpleados frame = new ListaDeEmpleados();
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
	public ListaDeEmpleados() {
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 640, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(0, 0, 640, 218);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(23, 22, 151, 151);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/usuario-96.png")).getImage();
		label.setIcon(new ImageIcon(img0));
		label.setBounds(27, 0, 96, 151);
		panel_1.add(label);
		
		JLabel lblListadoDeEmpleados = new JLabel("Listado de Empleados");
		lblListadoDeEmpleados.setForeground(Color.WHITE);
		lblListadoDeEmpleados.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblListadoDeEmpleados.setBounds(230, 6, 179, 16);
		panel.add(lblListadoDeEmpleados);
		
		JLabel label_2 = new JLabel("Nombre:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		label_2.setBounds(186, 59, 61, 16);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(259, 54, 260, 26);
		panel.add(textField);
		
		JLabel label_3 = new JLabel("Cédula:");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		label_3.setBounds(186, 97, 61, 16);
		panel.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(259, 92, 216, 26);
		panel.add(textField_1);
		
		JLabel label_4 = new JLabel("Teléfono:");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		label_4.setBounds(186, 137, 73, 16);
		panel.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(259, 132, 181, 26);
		panel.add(textField_2);
		
		JLabel label_5 = new JLabel("Código:");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		label_5.setBounds(23, 185, 49, 16);
		panel.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(76, 180, 98, 26);
		panel.add(textField_3);
		
		JButton button = new JButton("Modificar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarEmpleado me = new ModificarEmpleado(Empresa.getinstance().BuscarEmpleado(tbtEmpleados.getSelectedRow()), tbtEmpleados.getSelectedRow());
				me.show();
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/modificar-48.png")).getImage();
		button.setIcon(new ImageIcon(img1));
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("OK");
		button.setBounds(68, 444, 131, 58);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Eliminar");
		Image img2 = new ImageIcon(this.getClass().getResource("/eliminar-64.png")).getImage();
		button_1.setIcon(new ImageIcon(img2));
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_1.setActionCommand("Cancel");
		button_1.setBounds(267, 444, 118, 58);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Salir");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tbtEmpleados.getModel();
				model.setRowCount(0);
				dispose();
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
		button_2.setIcon(new ImageIcon(img3));
		button_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_2.setActionCommand("Cancel");
		button_2.setBounds(453, 444, 118, 58);
		contentPane.add(button_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 229, 604, 204);
		contentPane.add(scrollPane);
		CargarTabla();
		scrollPane.setViewportView(tbtEmpleados);
		
	}
	public void CargarTabla() {
		tablemodel.setColumnIdentifiers(columnNames);
		fila = new Object[tablemodel.getColumnCount()];
		for (Empleados e : Empresa.getinstance().GetEmpleado()) {
			fila[0] = e.getCode();
			fila[1] = e.getNombre();
			fila[2] = e.getCedula();
			fila[3] = e.getTelefono();
			fila[4] = e.getDireccion();
			tablemodel.addRow(fila);
		}
		tbtEmpleados = new JTable();
		tbtEmpleados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbtEmpleados.setModel(tablemodel);
		tbtEmpleados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		TableColumnModel columnModel = tbtEmpleados.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(60);
		columnModel.getColumn(1).setPreferredWidth(171);
		columnModel.getColumn(2).setPreferredWidth(110);
		columnModel.getColumn(3).setPreferredWidth(110);
		columnModel.getColumn(4).setPreferredWidth(150);
	}
}
