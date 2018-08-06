package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import logical.Empresa;
import logical.HardDrive;
import logical.Motherboard;
import logical.Procesador;
import logical.Ram;

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
import javax.swing.SpinnerNumberModel;

public class AnadirProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txt_Codigo;
	private JTextField txt_Marca;
	private JTextField txt_Modelo;
	
	private JRadioButton rdbtnProcesador;
	private JRadioButton rdbtnDisco;
	private JRadioButton rdbtnMotherboard;
	private JRadioButton rdbtnMemoriaRam;
	private JPanel panel_4;
	private JPanel panel_9;
	private JPanel panel_3;
	private JPanel panel_7;
	private JPanel panel_8;
	private JSpinner spn_cantram;
	

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public AnadirProducto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 561);
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
	  
	  JPanel panel_9_1 = new JPanel();
	  panel_9_1.setLayout(null);
	  panel_9_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalles del Articulo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  panel_9_1.setBackground(Color.WHITE);
	  panel_9_1.setBounds(23, 198, 593, 153);
	  panel_1.add(panel_9_1);
	  
	  JLabel label_1 = new JLabel("Socket:");
	  label_1.setBounds(19, 41, 53, 16);
	  panel_9_1.add(label_1);
	  
	  JComboBox cbx_Socketmtb = new JComboBox();
	  cbx_Socketmtb.setToolTipText("");
	  cbx_Socketmtb.setBounds(70, 37, 147, 27);
	  panel_9_1.add(cbx_Socketmtb);
	  
	  JLabel label_8 = new JLabel("Tipo de Memoria:");
	  label_8.setBounds(294, 41, 115, 16);
	  panel_9_1.add(label_8);
	  
	  JComboBox cbx_tipoMemmtb = new JComboBox();
	  cbx_tipoMemmtb.setModel(new DefaultComboBoxModel(new String[] {"<seleccionar>", "ddr-1", "ddr-2", "ddr-3", "ddr-4"}));
	  cbx_tipoMemmtb.setBounds(421, 37, 147, 27);
	  panel_9_1.add(cbx_tipoMemmtb);
	  
	  JLabel label_9 = new JLabel("Cant. Slots RAM:");
	  label_9.setBounds(294, 81, 115, 16);
	  panel_9_1.add(label_9);
	  
	  spn_cantram = new JSpinner();
	  spn_cantram.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
	  spn_cantram.setBounds(421, 76, 147, 26);
	  panel_9_1.add(spn_cantram);
	  panel_9_1.setVisible(false);
	  
	  //JPanel panel_9 = new JPanel();
	  panel_9_1.setBounds(23, 198, 593, 153);
	  panel_1.add(panel_9_1);
	  panel_9_1.setLayout(null);
	  panel_9_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalles del Articulo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  panel_9_1.setBackground(Color.WHITE);
	  
	  JLabel lblCantidadSata = new JLabel("Cantidad SATA:");
	  lblCantidadSata.setBounds(19, 81, 115, 16);
	  panel_9_1.add(lblCantidadSata);
	  
	  JSpinner spn_CantSATA = new JSpinner();
	  spn_CantSATA.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
	  spn_CantSATA.setBounds(119, 76, 97, 26);
	  panel_9_1.add(spn_CantSATA);
	  
	  JSpinner spn_CantIDE = new JSpinner();
	  spn_CantIDE.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
	  spn_CantIDE.setBounds(119, 111, 97, 26);
	  panel_9_1.add(spn_CantIDE);
	  
	  JLabel lblNewLabel_4 = new JLabel("Cantidd IDE");
	  lblNewLabel_4.setBounds(19, 116, 115, 16);
	  panel_9_1.add(lblNewLabel_4);
	  
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
	  comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "asdasd"}));
	  comboBox.setBounds(87, 36, 147, 27);
	  panel_4.add(comboBox);
	  
	  JLabel lblTipoDeMemoria = new JLabel("Velocidad Base:");
	  lblTipoDeMemoria.setBounds(293, 41, 108, 16);
	  panel_4.add(lblTipoDeMemoria);
	  
	  JSpinner spinner_3 = new JSpinner();
	  spinner_3.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
	  spinner_3.setBounds(413, 36, 130, 26);
	  panel_4.add(spinner_3);
	  
	  JLabel lblVelocidadTurbo = new JLabel("Velocidad Turbo:");
	  lblVelocidadTurbo.setBounds(293, 81, 108, 16);
	  panel_4.add(lblVelocidadTurbo);
	  
	  JSpinner spinner_5 = new JSpinner();
	  spinner_5.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
	  spinner_5.setBounds(413, 76, 130, 26);
	  panel_4.add(spinner_5);
	  
	  JLabel lblEstado = new JLabel("Unlock:");
	  lblEstado.setBounds(36, 81, 53, 16);
	  panel_4.add(lblEstado);
	  
	  JComboBox comboBox_1 = new JComboBox();
	  comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Si ", "No"}));
	  comboBox_1.setBounds(87, 77, 147, 27);
	  panel_4.add(comboBox_1);
	  
	  panel_8 = new JPanel();
	  panel_8.setBounds(23, 198, 593, 153);
	  panel_1.add(panel_8);
	  panel_8.setLayout(null);
	  panel_8.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalles del Articulo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  panel_8.setBackground(Color.WHITE);
	  
	  JLabel label_6 = new JLabel("Capacidad: ");
	  label_6.setBounds(19, 41, 78, 16);
	  panel_8.add(label_6);
	  
	  JComboBox cbx_CapacidadRAM = new JComboBox();
	  cbx_CapacidadRAM.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "1", "2", "3", "4"}));
	  cbx_CapacidadRAM.setBounds(109, 37, 147, 27);
	  panel_8.add(cbx_CapacidadRAM);
	  
	  JLabel label_7 = new JLabel("Tipo de Conexión:");
	  label_7.setBounds(294, 41, 115, 16);
	  panel_8.add(label_7);
	  
	  JComboBox cbx_TipoCo = new JComboBox();
	  cbx_TipoCo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "ddr3"}));
	  cbx_TipoCo.setBounds(421, 37, 147, 27);
	  panel_8.add(cbx_TipoCo);
	  
	  JLabel lblSpeed = new JLabel("Speed:");
	  lblSpeed.setBounds(19, 81, 84, 16);
	  panel_8.add(lblSpeed);
	  
	  JSpinner spn_SpeedRam = new JSpinner();
	  spn_SpeedRam.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
	  spn_SpeedRam.setBounds(109, 76, 147, 26);
	  panel_8.add(spn_SpeedRam);
		
	  panel_7 = new JPanel();
	  panel_7.setBounds(23, 198, 593, 153);
	  panel_1.add(panel_7);
	  panel_7.setLayout(null);
	  panel_7.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalles del Articulo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  panel_7.setBackground(Color.WHITE);
	  
	  JLabel lblCapacidad = new JLabel("Capacidad: ");
	  lblCapacidad.setBounds(19, 41, 78, 16);
	  panel_7.add(lblCapacidad);
	  
	  JComboBox cbx_CapacidadDisco = new JComboBox();
	  cbx_CapacidadDisco.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "180", "250", "500", "1000"}));
	  cbx_CapacidadDisco.setBounds(109, 36, 147, 27);
	  panel_7.add(cbx_CapacidadDisco);
	  
	  JLabel lblTipoDeConexin = new JLabel("Tipo de Conexión:");
	  lblTipoDeConexin.setBounds(294, 41, 115, 16);
	  panel_7.add(lblTipoDeConexin);
	  
	  JComboBox cbx_TipoDisco = new JComboBox();
	  cbx_TipoDisco.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "ALGO"}));
	  cbx_TipoDisco.setBounds(421, 37, 147, 27);
	  panel_7.add(cbx_TipoDisco);
	  
	  JLabel lblReadSpeed = new JLabel("Read Speed:");
	  lblReadSpeed.setBounds(325, 81, 84, 16);
	  panel_7.add(lblReadSpeed);
	  
	  JSpinner spn_ReadSpeed = new JSpinner();
	  spn_ReadSpeed.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
	  spn_ReadSpeed.setBounds(421, 76, 147, 26);
	  panel_7.add(spn_ReadSpeed);
	  
	  JLabel lblVelocidadDeEscritura = new JLabel("Write Speed:");
	  lblVelocidadDeEscritura.setBounds(19, 81, 84, 16);
	  panel_7.add(lblVelocidadDeEscritura);
	  
	  JSpinner spn_WriteSpeed = new JSpinner();
	  spn_WriteSpeed.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
	  spn_WriteSpeed.setBounds(109, 76, 147, 26);
	  panel_7.add(spn_WriteSpeed);
		
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
		
		txt_Codigo = new JTextField();
		txt_Codigo.setBounds(73, 21, 123, 26);
		panel_2.add(txt_Codigo);
		txt_Codigo.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(208, 26, 54, 16);
		panel_2.add(lblMarca);
		
		txt_Marca = new JTextField();
		txt_Marca.setColumns(10);
		txt_Marca.setBounds(263, 21, 116, 26);
		panel_2.add(txt_Marca);
		
		JLabel lblPrecioC = new JLabel("P.Costo:");
		lblPrecioC.setBounds(18, 68, 63, 16);
		panel_2.add(lblPrecioC);
		
		JSpinner spn_PCosto = new JSpinner();
		spn_PCosto.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spn_PCosto.setBounds(73, 63, 123, 26);
		panel_2.add(spn_PCosto);
		
		JLabel lblPventa = new JLabel("P.Venta:");
		lblPventa.setBounds(18, 110, 63, 16);
		panel_2.add(lblPventa);
		
		JSpinner spn_PVenta = new JSpinner();
		spn_PVenta.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spn_PVenta.setBounds(73, 105, 123, 26);
		panel_2.add(spn_PVenta);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(208, 68, 54, 16);
		panel_2.add(lblModelo);
		
		txt_Modelo = new JTextField();
		txt_Modelo.setColumns(10);
		txt_Modelo.setBounds(263, 63, 116, 26);
		panel_2.add(txt_Modelo);
		
		JSpinner spn_Cantidad = new JSpinner();
		spn_Cantidad.setBounds(273, 105, 113, 26);
		panel_2.add(spn_Cantidad);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(208, 110, 63, 16);
		panel_2.add(lblCantidad);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Tipo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(442, 33, 174, 153);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		panel_8.setVisible(false);
		panel_7.setVisible(false);
		panel_4.setVisible(false);
		
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
				panel_9_1.setVisible(true);				
				
				
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
				panel_9_1.setVisible(false);				
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
				panel_9_1.setVisible(false);
				
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
				panel_9_1.setVisible(false);
				
			}
		});
		rdbtnMemoriaRam.setBounds(31, 117, 126, 23);
		panel_3.add(rdbtnMemoriaRam);
		
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 442, 640, 69);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ( ((txt_Marca.getText() != null) && (txt_Marca.getText().isEmpty()==false)) &&
					 ((txt_Modelo.getText() != null) && (txt_Modelo.getText().isEmpty()==false)) &&
					 ((spn_Cantidad.getValue() != null) && (spn_Cantidad.getValue() != "0")) &&
					 ((spn_PCosto.getValue() != null) && (spn_PCosto.getValue() != "0")) &&
					 ((spn_PVenta.getValue() != null) && (spn_PVenta.getValue() != "0")) ) {
				if(((float)spn_PVenta.getValue()) > ((float) spn_PCosto.getValue())) {
					float precio = (float) spn_PCosto.getValue();
					float PrecioVenta = (float) spn_PVenta.getValue();
					String marca = txt_Marca.getText();
					String modelo = txt_Modelo.getText();
					int cantidad = (int) spn_Cantidad.getValue();
					String codigo = "codigo";
					if(rdbtnMotherboard.isSelected() == true) {
						if((cbx_Socketmtb.getSelectedIndex() != 0) && (cbx_tipoMemmtb.getSelectedIndex() != 0) && (spn_cantram.getValue() != "0") && ( (spn_CantIDE.getValue() != "0") || (spn_CantSATA.getValue() != "0"))) {
							
							String socket = (String) cbx_Socketmtb.getSelectedItem();
							String tipoMemmtb = (String) cbx_tipoMemmtb.getSelectedItem();
							int cantIDE = (int) spn_CantIDE.getValue();
							int cantram = (int) spn_cantram.getValue(); 
							int cantSata = (int) spn_CantSATA.getValue();
							String aux = "--";
							int aux1 = 0;
							boolean a = false;
							String TipoProducto = "Motherboard";
							Motherboard M = new Motherboard(precio, PrecioVenta, cantidad, codigo, marca, modelo, TipoProducto, aux, socket, tipoMemmtb, cantIDE, aux1, cantSata, cantram, a);
							Empresa.getinstance().AddProducto(M);
							JOptionPane.showMessageDialog(null, "Ha registrado un Motherboard.");
						}else {
							JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos del Motherboard");
						}
					}
					if(rdbtnDisco.isSelected() == true) {
						if((cbx_CapacidadDisco.getSelectedIndex() != 0) && (cbx_TipoDisco.getSelectedIndex() != 0) && (spn_ReadSpeed.getValue() != "0") && (spn_WriteSpeed.getValue() != "0")) {
							float wrSpeed = (float) spn_WriteSpeed.getValue();
							float rdSpeed = (float) spn_ReadSpeed.getValue();
							String tipoConexion = (String) cbx_TipoDisco.getSelectedItem();
							float cantGB = Float.valueOf(cbx_CapacidadDisco.getSelectedItem().toString());
							String TipoProducto = "HardDrive";
							HardDrive h = new HardDrive(precio, PrecioVenta, cantidad, codigo, marca, modelo, TipoProducto, cantGB, tipoConexion, wrSpeed, rdSpeed);
							Empresa.getinstance().AddProducto(h);
							JOptionPane.showMessageDialog(null, "Ha registrado un Disco duro.");
						}else {
							JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos del Disco duro.");
						}
					}
					if(rdbtnMemoriaRam.isSelected() == true) {
						System.out.println("agregando RAM");
						if((cbx_CapacidadRAM.getSelectedIndex() != 0) && (cbx_TipoCo.getSelectedIndex() != 0) && (spn_SpeedRam.getValue() != "0") ) {
							float Speed = (float) spn_SpeedRam.getValue();
							String tipoConexion = (String) cbx_TipoCo.getSelectedItem();
							float cantGB = Float.valueOf(cbx_CapacidadRAM.getSelectedItem().toString());
							String TipoProducto = "Memoria Ram";
							boolean aux = false;
							Ram r = new Ram(precio, PrecioVenta, cantidad, codigo, marca, modelo, TipoProducto, cantGB, tipoConexion, Speed, aux);
							Empresa.getinstance().AddProducto(r);
							JOptionPane.showMessageDialog(null, "Ha registrado una memoria RAM.");
						}else {
							JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos de la memoria RAM.");
						}
					}
					if(rdbtnProcesador.isSelected() == true) {
						if((comboBox.getSelectedIndex() != 0) && (comboBox_1.getSelectedIndex() != 0) &&(spinner_3.getValue() != "0") && (spinner_5.getValue() != "0")) {
								String Socket = (String) comboBox.getSelectedItem();
								float velocidadBase = (float) spinner_3.getValue();
								float velocidadTurbo = (float) spinner_5.getValue();
								boolean Unlock;
								if (comboBox_1.getSelectedItem() == "NO") {
									Unlock = false;
								}else {
									Unlock = true;
								}
								String TipoProducto = "Procesador";
								Procesador p = new Procesador(precio, PrecioVenta, cantidad, codigo, marca, modelo, TipoProducto, Socket, velocidadBase, velocidadTurbo, Unlock);
								Empresa.getinstance().AddProducto(p);
								JOptionPane.showMessageDialog(null, "Ha registrado un Procesador.");
						}else {
							JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos del Procesador.");
						}
					}
				}else{
					JOptionPane.showMessageDialog(null, "El valor de venta debe ser mayor que el costo");
				}
					
				}else {
					JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos.");
				}
				
			}
		});
		btnNewButton.setBounds(137, 4, 135, 60);
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

