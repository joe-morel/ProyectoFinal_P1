package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaDeClientes extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 530);
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
		
		textField = new JTextField();
		textField.setBounds(259, 54, 260, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCdula = new JLabel("Cédula:");
		lblCdula.setForeground(Color.WHITE);
		lblCdula.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula.setBounds(186, 97, 61, 16);
		panel.add(lblCdula);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(259, 92, 216, 26);
		panel.add(textField_1);
		
		JLabel lblTelfono = new JLabel("Teléfono:");
		lblTelfono.setForeground(Color.WHITE);
		lblTelfono.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblTelfono.setBounds(186, 137, 73, 16);
		panel.add(lblTelfono);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(259, 132, 181, 26);
		panel.add(textField_2);
		
		JLabel label = new JLabel("Código:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		label.setBounds(23, 185, 49, 16);
		panel.add(label);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(76, 180, 98, 26);
		panel.add(textField_3);
		
		table = new JTable();
		table.setBounds(235, 308, 157, -69);
		contentPane.add(table);
		
		JList list = new JList();
		list.setBounds(8, 225, 624, 207);
		contentPane.add(list);
		
		JButton btnModificar = new JButton("Modificar");
		Image img1 = new ImageIcon(this.getClass().getResource("/modificar-48.png")).getImage();
		btnModificar.setIcon(new ImageIcon(img1));
		btnModificar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnModificar.setActionCommand("OK");
		btnModificar.setBounds(68, 444, 131, 58);
		contentPane.add(btnModificar);
		
		JButton button = new JButton("Salir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
	}
}
