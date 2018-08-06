package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logical.Clientes;
import logical.Empresa;
import logical.Factura;

import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class CuentasPorCobrar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JScrollPane scrollPane = new JScrollPane();
	private JTable tableDeudores = new  JTable();
	private DefaultTableModel tablemodel = new DefaultTableModel();
	String[] columnNames = {"Codigo", "Nombre", "Cedula", "Telefono", "Dirreccion", "LimiteCredito"};
	private Object[] fila;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public CuentasPorCobrar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(0, 0, 640, 171);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(31, 10, 151, 151);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/grupo.png")).getImage();
		label.setIcon(new ImageIcon(img2));
		label.setBounds(27, 0, 96, 151);
		panel_1.add(label);
		
		JLabel lblCuentasPorCobrar = new JLabel("Cuentas Por Cobrar");
		lblCuentasPorCobrar.setForeground(Color.WHITE);
		lblCuentasPorCobrar.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblCuentasPorCobrar.setBounds(194, 10, 187, 16);
		panel.add(lblCuentasPorCobrar);
		
		JLabel label_2 = new JLabel("Código:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		label_2.setBounds(194, 38, 67, 21);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setText("CP-1");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(255, 35, 106, 26);
		panel.add(textField);
		
		JLabel lblDeudor = new JLabel("Deudor:");
		lblDeudor.setForeground(Color.WHITE);
		lblDeudor.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblDeudor.setBounds(194, 71, 67, 21);
		panel.add(lblDeudor);
		
		textField_1 = new JTextField();
		textField_1.setBounds(255, 71, 130, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Deuda Acumulada", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(422, 38, 197, 85);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total:");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(16, 29, 70, 27);
		panel_2.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(84, 29, 94, 26);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCdula = new JLabel("Cédula:");
		lblCdula.setForeground(Color.WHITE);
		lblCdula.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula.setBounds(194, 104, 67, 21);
		panel.add(lblCdula);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(255, 104, 130, 26);
		panel.add(textField_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 170, 640, 27);
		contentPane.add(panel_3);
		
		JLabel lblListaDeClientes = new JLabel("Lista de Clientes Por Cobrar");
		lblListaDeClientes.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_3.add(lblListaDeClientes);
		
	 scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 209, 604, 204);
		contentPane.add(scrollPane);
		
		tableDeudores = new JTable();
		tablemodel = new DefaultTableModel();
		tablemodel.setColumnIdentifiers(columnNames);
		tableDeudores.setEnabled(true);
		tableDeudores.setRowSelectionAllowed(false);
		tableDeudores.setCellSelectionEnabled(true);
		tableDeudores.setModel(tablemodel);
		// scrollPane.setViewportView(tbtClientes);
		tableDeudores.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		// tbtClientes.setModel(tablemodel);
		tableDeudores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(tableDeudores);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 153, 204));
		panel_4.setBounds(56, 423, 174, 77);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_1 = new JLabel("Monto a Saldar:");
		label_1.setEnabled(false);
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(20, 6, 126, 21);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		panel_4.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBounds(20, 30, 130, 34);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCobrar = new JButton("Cobrar");
		btnCobrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Empresa.getinstance().AddFactura(Empresa.getinstance().BuscarCuentasPorCobrar(tableDeudores.getSelectedRow()));
				Empresa.getinstance().EliminarCuentasPorCobrar(tableDeudores.getSelectedRow());
				CargarTabla();
				  
				JOptionPane.showMessageDialog(null, "Facturacion realizada con exito!","555", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		Image img0 = new ImageIcon(this.getClass().getResource("/efectivo3.png")).getImage();
		btnCobrar.setIcon(new ImageIcon(img0));
		btnCobrar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnCobrar.setActionCommand("OK");
		btnCobrar.setBounds(286, 432, 124, 58);
		contentPane.add(btnCobrar);
		
		JButton button = new JButton("Salir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
		button.setIcon(new ImageIcon(img1));
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("Cancel");
		button.setBounds(466, 432, 118, 58);
		contentPane.add(button);
	
		
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			//	Clientes c = Empresa.getinstance().BuscarCliente(tableDeudores.getSelectedRow());
			//	txt_nombre.setText(c.getNombre());
			//	txt_cedula.setText(c.getCedula());
			//	txt_codigo.setText(Empresa.getinstance().BuscarClienteCodigo(tbtClientes.getSelectedRow()));
			//	txt_telefono.setText(c.getTelefono());
			}
		});
		
		scrollPane.setBounds(18, 229, 604, 204);
		contentPane.add(scrollPane);
		CargarTabla();
		
	}
	
	
public void CargarTabla() {
		
		tablemodel.setRowCount(0);   /*Copiado de Listar Suministrador ejemplo de profe en clase*/
		tablemodel.setColumnIdentifiers(columnNames);
		fila = new Object[tablemodel.getColumnCount()];
	for (Factura c : Empresa.getinstance().getCuentasPorCobrar()) {
			fila[0] = ((Factura)c).getCode();
			fila[1] = ((Factura)c).getCliente().getNombre();
			fila[2] = ((Factura)c).getCliente().getCedula();
			fila[3] = ((Factura)c).getCliente().getLimiteCredito();
			fila[4] = ((Factura)c).getPrecioTotal();
			tablemodel.addRow(fila);
		}
	}
}
