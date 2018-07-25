package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class AnadirProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private JRadioButton rdbtnProcesador;
	private JRadioButton rdbtnDisco;
	private JRadioButton rdbtnMotherboard;
	private JRadioButton rdbtnMemoriaRam;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_3;
	private JPanel panel_7;
	private JPanel panel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnadirProducto frame = new AnadirProducto();
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
	public AnadirProducto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 530);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 640, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIngresoDeArticulos = new JLabel("Ingreso de Articulos");
		lblIngresoDeArticulos.setForeground(new Color(51, 153, 204)); 
		lblIngresoDeArticulos.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblIngresoDeArticulos.setBounds(66, 19, 187, 26);
		panel.add(lblIngresoDeArticulos);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(514, 21, 109, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("|");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 27));
		lblNewLabel.setForeground(new Color(51, 153, 204));
		lblNewLabel.setBounds(309, 26, 21, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setForeground(new Color(51, 153, 204));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(441, 26, 61, 16);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/user-48.png")).getImage();
		label.setIcon(new ImageIcon(img1));
		label.setBounds(374, 14, 55, 41);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 153, 204));
		panel_1.setBounds(0, 68, 640, 374);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setToolTipText("");
		panel_2.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		panel_2.setBorder(new TitledBorder(null, "Informacion Basica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(23, 33, 400, 153);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Código:");
		lblNewLabel_2.setBounds(18, 26, 54, 16);
		panel_2.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(73, 21, 123, 26);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(208, 26, 54, 16);
		panel_2.add(lblMarca);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(263, 21, 116, 26);
		panel_2.add(textField_2);
		
		JLabel lblPrecioC = new JLabel("P.Costo:");
		lblPrecioC.setBounds(18, 68, 63, 16);
		panel_2.add(lblPrecioC);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(73, 63, 123, 26);
		panel_2.add(spinner);
		
		JLabel lblPventa = new JLabel("P.Venta:");
		lblPventa.setBounds(18, 110, 63, 16);
		panel_2.add(lblPventa);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(73, 105, 123, 26);
		panel_2.add(spinner_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(263, 63, 116, 26);
		panel_2.add(textField_3);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(208, 68, 54, 16);
		panel_2.add(lblModelo);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(273, 105, 113, 26);
		panel_2.add(spinner_2);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(208, 110, 63, 16);
		panel_2.add(lblCantidad);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Tipo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(442, 33, 174, 153);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		rdbtnMotherboard = new JRadioButton("MotherBoard");
		rdbtnMotherboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMotherboard.setSelected(true);
				rdbtnDisco.setSelected(false);
				rdbtnProcesador.setSelected(false);
				rdbtnMemoriaRam.setSelected(false);
				panel_8.setVisible(false);
				panel_7.setVisible(false);
				panel_4.setVisible(false);
	//			panel_5.setVisible(true);
				panel_3.setVisible(true);
				
				
			}
		});
		rdbtnMotherboard.setBounds(31, 12, 111, 23);
		panel_3.add(rdbtnMotherboard);
		
		rdbtnProcesador = new JRadioButton("Procesador");
		rdbtnProcesador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMotherboard.setSelected(false);
				rdbtnDisco.setSelected(false);
				rdbtnProcesador.setSelected(true);
				rdbtnMemoriaRam.setSelected(false);
				panel_8.setVisible(false);
				panel_7.setVisible(false);
				panel_4.setVisible(true);
			//	panel_5.setVisible(false);
				panel_3.setVisible(true);
				
			}
		});
		rdbtnProcesador.setBounds(31, 47, 111, 23);
		panel_3.add(rdbtnProcesador);
		
		rdbtnDisco = new JRadioButton("Disco Duro");
		rdbtnDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMotherboard.setSelected(false);
				rdbtnDisco.setSelected(true);
				rdbtnProcesador.setSelected(false);
				rdbtnMemoriaRam.setSelected(false);
				panel_8.setVisible(false);
				panel_7.setVisible(true);
				panel_4.setVisible(false);
		//		panel_5.setVisible(false);
				panel_3.setVisible(true);
				
				
			}
		});
		rdbtnDisco.setBounds(31, 82, 111, 23);
		panel_3.add(rdbtnDisco);
		
		rdbtnMemoriaRam = new JRadioButton("Memoria RAM");
		rdbtnMemoriaRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMotherboard.setSelected(false);
				rdbtnDisco.setSelected(false);
				rdbtnProcesador.setSelected(false);
				rdbtnMemoriaRam.setSelected(true);
				panel_8.setVisible(true);
				panel_7.setVisible(false);
				panel_4.setVisible(false);
			//	panel_5.setVisible(false);
				panel_3.setVisible(true);
				
			}
		});
		rdbtnMemoriaRam.setBounds(31, 117, 126, 23);
		panel_3.add(rdbtnMemoriaRam);
	  
	  panel_8 = new JPanel();
	  panel_8.setBounds(23, 198, 593, 153);
	  panel_1.add(panel_8);
	  panel_8.setLayout(null);
	  panel_8.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalles del Articulo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  panel_8.setBackground(Color.WHITE);
	  
	  JLabel label_6 = new JLabel("Capacidad: ");
	  label_6.setBounds(19, 41, 78, 16);
	  panel_8.add(label_6);
	  
	  JComboBox comboBox_6 = new JComboBox();
	  comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>"}));
	  comboBox_6.setBounds(109, 37, 147, 27);
	  panel_8.add(comboBox_6);
	  
	  JLabel label_7 = new JLabel("Tipo de Conexión:");
	  label_7.setBounds(294, 41, 115, 16);
	  panel_8.add(label_7);
	  
	  JComboBox comboBox_7 = new JComboBox();
	  comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>"}));
	  comboBox_7.setBounds(421, 37, 147, 27);
	  panel_8.add(comboBox_7);
	  
	  JLabel lblSpeed = new JLabel("Speed:");
	  lblSpeed.setBounds(19, 81, 84, 16);
	  panel_8.add(lblSpeed);
	  
	  JSpinner spinner_9 = new JSpinner();
	  spinner_9.setBounds(109, 76, 147, 26);
	  panel_8.add(spinner_9);
		
	  panel_7 = new JPanel();
		panel_7.setBounds(23, 198, 593, 153);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalles del Articulo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBackground(Color.WHITE);
		
		JLabel lblCapacidad = new JLabel("Capacidad: ");
		lblCapacidad.setBounds(19, 41, 78, 16);
		panel_7.add(lblCapacidad);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>"}));
		comboBox_4.setBounds(109, 37, 147, 27);
		panel_7.add(comboBox_4);
		
		JLabel lblTipoDeConexin = new JLabel("Tipo de Conexión:");
		lblTipoDeConexin.setBounds(294, 41, 115, 16);
		panel_7.add(lblTipoDeConexin);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "SSD", "HDD"}));
		comboBox_5.setBounds(421, 37, 147, 27);
		panel_7.add(comboBox_5);
		
		JLabel lblReadSpeed = new JLabel("Read Speed:");
		lblReadSpeed.setBounds(325, 81, 84, 16);
		panel_7.add(lblReadSpeed);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(421, 76, 147, 26);
		panel_7.add(spinner_6);
		
		JLabel lblVelocidadDeEscritura = new JLabel("Write Speed:");
		lblVelocidadDeEscritura.setBounds(19, 81, 84, 16);
		panel_7.add(lblVelocidadDeEscritura);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(109, 76, 147, 26);
		panel_7.add(spinner_7);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalles del Articulo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(23, 198, 593, 153);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Socket:");
		lblNewLabel_3.setBounds(36, 40, 53, 16);
		panel_4.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>"}));
		comboBox.setBounds(87, 36, 147, 27);
		panel_4.add(comboBox);
		
		JLabel lblTipoDeMemoria = new JLabel("Velocidad Base:");
		lblTipoDeMemoria.setBounds(293, 41, 108, 16);
		panel_4.add(lblTipoDeMemoria);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(413, 36, 130, 26);
		panel_4.add(spinner_3);
		
		JLabel lblVelocidadTurbo = new JLabel("Velocidad Turbo:");
		lblVelocidadTurbo.setBounds(293, 81, 108, 16);
		panel_4.add(lblVelocidadTurbo);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(413, 76, 130, 26);
		panel_4.add(spinner_5);
		
		JLabel lblEstado = new JLabel("Unlock:");
		lblEstado.setBounds(36, 81, 53, 16);
		panel_4.add(lblEstado);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Si ", "No"}));
		comboBox_1.setBounds(87, 77, 147, 27);
		panel_4.add(comboBox_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(23, 198, 593, 153);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalles del Articulo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBackground(Color.WHITE);
		
		JLabel label_2 = new JLabel("Socket:");
		label_2.setBounds(19, 41, 53, 16);
		panel_5.add(label_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(70, 37, 147, 27);
		panel_5.add(comboBox_2);
		
		JLabel label_3 = new JLabel("Tipo de Memoria:");
		label_3.setBounds(294, 41, 115, 16);
		panel_5.add(label_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(421, 37, 147, 27);
		panel_5.add(comboBox_3);
		
		JLabel label_4 = new JLabel("Cant. Slots RAM:");
		label_4.setBounds(294, 81, 115, 16);
		panel_5.add(label_4);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(421, 76, 147, 26);
		panel_5.add(spinner_4);
		
		JLabel label_5 = new JLabel("Tipo de Bus:");
		label_5.setBounds(19, 81, 77, 16);
		panel_5.add(label_5);
		
		JCheckBox checkBox = new JCheckBox("SATA");
		checkBox.setBounds(97, 77, 77, 23);
		panel_5.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("SATA Express");
		checkBox_1.setBounds(163, 77, 119, 23);
		panel_5.add(checkBox_1);
		
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 442, 640, 69);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(137, 4, 114, 60);
		panel_6.add(btnNewButton);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		Image img0 = new ImageIcon(this.getClass().getResource("/Anadir-48.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img0));
		
		JButton button = new JButton("Salir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(388, 4, 114, 60);
		panel_6.add(button);
		Image img2 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
		button.setIcon(new ImageIcon(img2));
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("Cancel");
	}
}

