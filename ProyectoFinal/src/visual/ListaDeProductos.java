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
import logical.Productos;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaDeProductos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
	}
	}

