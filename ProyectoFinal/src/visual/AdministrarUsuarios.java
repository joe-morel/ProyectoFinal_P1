package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;

public class AdministrarUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministrarUsuarios frame = new AdministrarUsuarios();
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
	public AdministrarUsuarios() {
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
		panel_1.setBounds(28, 10, 151, 151);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/grupo.png")).getImage();
		label.setIcon(new ImageIcon(img0));
		label.setBounds(27, 0, 96, 151);
		panel_1.add(label);
		
		JLabel lblAdministrarUsuarios = new JLabel("Administrar Usuarios");
		lblAdministrarUsuarios.setForeground(Color.WHITE);
		lblAdministrarUsuarios.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblAdministrarUsuarios.setBounds(206, 33, 227, 25);
		panel.add(lblAdministrarUsuarios);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setBounds(191, 87, 75, 16);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(264, 83, 130, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 171, 640, 27);
		contentPane.add(panel_2);
		
		JLabel lblListadoDeUsuarios = new JLabel("Listado de Usuarios");
		lblListadoDeUsuarios.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_2.add(lblListadoDeUsuarios);
		
		JList list = new JList();
		list.setBounds(18, 210, 604, 204);
		contentPane.add(list);
		
		JButton button = new JButton("Eliminar");
		Image img2 = new ImageIcon(this.getClass().getResource("/eliminar-64.png")).getImage();
		button.setIcon(new ImageIcon(img2));
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("Cancel");
		button.setBounds(136, 426, 118, 58);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Salir");
		Image img3 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
		button_1.setIcon(new ImageIcon(img3));
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_1.setActionCommand("Cancel");
		button_1.setBounds(390, 424, 114, 60);
		contentPane.add(button_1);
	}

}
