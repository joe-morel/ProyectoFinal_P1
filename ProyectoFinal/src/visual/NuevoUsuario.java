package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logical.ControlUser;
import logical.User;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class NuevoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JButton button;
	private JButton button_1;
	private JLabel lblNewLabel_1;
	private JLabel lblTipoDeCuenta;
	private JComboBox comboBox;


	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoUsuario frame = new NuevoUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public NuevoUsuario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 523, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Nombre de Usuario:");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblUsuario.setBounds(81, 134, 140, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setForeground(new Color(255, 255, 255));
		lblContrasea.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblContrasea.setBounds(81, 167, 83, 16);
		contentPane.add(lblContrasea);
		
		JLabel lblVerificarContrasea = new JLabel("Verificar Contraseña:");
		lblVerificarContrasea.setForeground(new Color(255, 255, 255));
		lblVerificarContrasea.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblVerificarContrasea.setBounds(81, 205, 152, 16);
		contentPane.add(lblVerificarContrasea);
		
		textField = new JTextField();
		textField.setBounds(272, 129, 163, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(272, 162, 163, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(272, 200, 163, 26);
		contentPane.add(textField_2);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 523, 32);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Registro De Usuarios");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel.setBounds(176, 6, 171, 16);
		panel.add(lblNewLabel);
		
		button = new JButton("Guardar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				User user = new User(comboBox.getSelectedItem().toString(),textField.getText(),textField_1.getText());
			    ControlUser.getInstance().regUser(user);
			    
			
				
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/guardar-48.png")).getImage();
		button.setIcon(new ImageIcon(img1));
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("OK");
		button.setBounds(81, 291, 124, 58);
		contentPane.add(button);
		
		button_1 = new JButton("Salir");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
		button_1.setIcon(new ImageIcon(img2));
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_1.setActionCommand("Cancel");
		button_1.setBounds(295, 291, 118, 58);
		contentPane.add(button_1);
		
		lblNewLabel_1 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/cuenta.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img3));
		lblNewLabel_1.setBounds(227, 44, 69, 84);
		contentPane.add(lblNewLabel_1);
		
		lblTipoDeCuenta = new JLabel("Tipo de Cuenta:");
		lblTipoDeCuenta.setForeground(Color.WHITE);
		lblTipoDeCuenta.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTipoDeCuenta.setBounds(81, 238, 152, 16);
		contentPane.add(lblTipoDeCuenta);
		
	     comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administrador", "Comercial"}));
		comboBox.setBounds(272, 238, 163, 27);
		contentPane.add(comboBox);
	}
}
