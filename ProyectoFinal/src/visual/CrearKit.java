package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearKit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearKit frame = new CrearKit();
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
	public CrearKit() {
		setResizable(false);
		setBounds(100, 100, 640, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 51, 153));
		panel.setBounds(0, 0, 640, 171);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(24, 10, 151, 151);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/joemorel/Downloads/icons8-estación-de-trabajo-96.png"));
		label.setBounds(26, 29, 104, 96);
		panel_1.add(label);
		
		JLabel lblCrearOfertas = new JLabel("Crear Ofertas ");
		lblCrearOfertas.setForeground(Color.WHITE);
		lblCrearOfertas.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblCrearOfertas.setBounds(187, 26, 151, 16);
		panel.add(lblCrearOfertas);
		
		JLabel lblNewLabel = new JLabel("Nombre de la Oferta:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(187, 54, 151, 16);
		panel.add(lblNewLabel);
		
		JLabel lblCdigo = new JLabel("Código:");
		lblCdigo.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdigo.setForeground(Color.WHITE);
		lblCdigo.setBounds(187, 120, 57, 29);
		panel.add(lblCdigo);
		
		textField = new JTextField();
		textField.setBounds(187, 82, 151, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(253, 122, 85, 26);
		panel.add(textField_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new CompoundBorder());
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setBounds(378, 49, 224, 73);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setForeground(new Color(220, 20, 60));
		lblTotal.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblTotal.setBounds(16, 20, 74, 36);
		panel_3.add(lblTotal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 102, 255));
		panel_2.setBounds(0, 170, 640, 27);
		contentPane.add(panel_2);
		
		JLabel lblContenido = new JLabel("Lista de componentes");
		lblContenido.setForeground(new Color(255, 255, 255));
		lblContenido.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_2.add(lblContenido);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 220, 604, 204);
		contentPane.add(scrollPane);
		
		JButton button = new JButton("Modificar");
		Image img1 = new ImageIcon(this.getClass().getResource("/modificar-48.png")).getImage();
		button.setIcon(new ImageIcon(img1));
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("OK");
		button.setBounds(191, 436, 131, 58);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Eliminar");
		Image img2 = new ImageIcon(this.getClass().getResource("/eliminar-64.png")).getImage();
		button_1.setIcon(new ImageIcon(img2));
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_1.setActionCommand("Cancel");
		button_1.setBounds(344, 436, 118, 58);
		contentPane.add(button_1);
		
		button_2 = new JButton("Salir");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
		button_2.setIcon(new ImageIcon(img3));
		button_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_2.setActionCommand("Cancel");
		button_2.setBounds(484, 436, 118, 58);
		contentPane.add(button_2);
		
		JButton btnGuardar = new JButton("Guardar");
		Image img4 = new ImageIcon(this.getClass().getResource("/modificar1-48.png")).getImage();
		btnGuardar.setIcon(new ImageIcon(img4));
		btnGuardar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnGuardar.setActionCommand("OK");
		btnGuardar.setBounds(38, 436, 131, 58);
		contentPane.add(btnGuardar);
	}
}
