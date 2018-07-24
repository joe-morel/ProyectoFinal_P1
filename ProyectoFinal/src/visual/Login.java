package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Login extends JFrame {

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
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("CheckBoxMenuItem.background"));
		panel.setBounds(0, 0, 325, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/logo-login2.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		lblNewLabel_3.setBounds(54, 125, 217, 217);
		panel.add(lblNewLabel_3);
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(325, 0, 325, 508);
		panel_1.setBackground(new Color(51, 153, 204));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblInicioDeSeccin = new JLabel("Login");
		lblInicioDeSeccin.setForeground(UIManager.getColor("Button.highlight"));
		lblInicioDeSeccin.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblInicioDeSeccin.setBounds(124, 75, 76, 27);
		panel_1.add(lblInicioDeSeccin);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario: ");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(118, 216, 89, 16);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(54, 244, 216, 39);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(54, 323, 216, 39);
		panel_1.add(textField_1);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblContrasea.setBounds(110, 295, 104, 16);
		panel_1.add(lblContrasea);
		
		JButton btnNewButton = new JButton("Iniciar Sección");
		btnNewButton.setBounds(110, 390, 117, 35);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/usuario-96.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img0));
		lblNewLabel_2.setBounds(110, 123, 90, 81);
		panel_1.add(lblNewLabel_2);
	}
}
