package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import logical.Clientes;
import logical.Empresa;

import javax.swing.border.EtchedBorder;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField txt_nombre;
	private JTextField txt_apellidos;
	private JTextField txt_direccion;
	private JTextField txt_telefono;
	private JTextField txt_cedula;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			NuevoEmpleado dialog = new NuevoEmpleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	/**
	 * Create the dialog.
	 */
	public NuevoCliente() {
		setAlwaysOnTop(true);
		setResizable(false);
		setBounds(100, 100, 640, 530);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.window);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(51, 153, 204));
			panel.setBounds(0, 0, 640, 171);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
			panel_1.setBounds(244, 10, 151, 151);
			panel.add(panel_1);
			panel_1.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setBounds(27, 0, 96, 151);
				panel_1.add(lblNewLabel);
				Image img = new ImageIcon(this.getClass().getResource("/usuario-96.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img));
			}
			
			JLabel lblEmpleado = new JLabel("Registro de Clientes");
			lblEmpleado.setForeground(new Color(255, 255, 255));
			lblEmpleado.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblEmpleado.setBounds(29, 53, 187, 16);
			panel.add(lblEmpleado);
			{
				JLabel lblCdigo = new JLabel("Código:");
				lblCdigo.setForeground(Color.WHITE);
				lblCdigo.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
				lblCdigo.setBounds(29, 81, 67, 16);
				panel.add(lblCdigo);
			}
			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setEnabled(false);
			textField.setBounds(90, 76, 106, 26);
			panel.add(textField);
			textField.setColumns(10);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 255));
			panel.setBounds(0, 171, 640, 27);
			contentPanel.add(panel);
			{
				JLabel lblInformacinGeneral = new JLabel("Información General");
				lblInformacinGeneral.setFont(new Font("Lucida Grande", Font.BOLD, 13));
				panel.add(lblInformacinGeneral);
			}
		}
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNombre.setBounds(33, 215, 61, 16);
		contentPanel.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblApellidos.setBounds(337, 215, 158, 16);
		contentPanel.add(lblApellidos);
		
		JLabel lblCdula = new JLabel("Telefono:");
		lblCdula.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula.setBounds(337, 264, 72, 16);
		contentPanel.add(lblCdula);
		
<<<<<<< HEAD
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(106, 210, 158, 26);
		contentPanel.add(textField_1);
=======
		txt_nombre = new JTextField();
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(106, 210, 158, 26);
		contentPanel.add(txt_nombre);
>>>>>>> branch 'master' of https://github.com/morel06/ProyectoFinal_P1.git
		
<<<<<<< HEAD
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(434, 210, 158, 26);
		contentPanel.add(textField_2);
=======
		txt_apellidos = new JTextField();
		txt_apellidos.setColumns(10);
		txt_apellidos.setBounds(434, 210, 158, 26);
		contentPanel.add(txt_apellidos);
>>>>>>> branch 'master' of https://github.com/morel06/ProyectoFinal_P1.git
		
		JLabel lblDireccin = new JLabel("Dirección:");
		lblDireccin.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblDireccin.setBounds(33, 265, 79, 16);
		contentPanel.add(lblDireccin);
		
<<<<<<< HEAD
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(106, 260, 158, 26);
		contentPanel.add(textField_3);
=======
		txt_direccion = new JTextField();
		txt_direccion.setColumns(10);
		txt_direccion.setBounds(106, 260, 158, 26);
		contentPanel.add(txt_direccion);
>>>>>>> branch 'master' of https://github.com/morel06/ProyectoFinal_P1.git
		
<<<<<<< HEAD
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(434, 259, 158, 26);
		contentPanel.add(textField_4);
=======
		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(434, 259, 158, 26);
		contentPanel.add(txt_telefono);
>>>>>>> branch 'master' of https://github.com/morel06/ProyectoFinal_P1.git
		
		JLabel lblCdula_1 = new JLabel("Cédula:");
		lblCdula_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula_1.setBounds(33, 319, 79, 16);
		contentPanel.add(lblCdula_1);
		
<<<<<<< HEAD
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(106, 314, 158, 26);
		contentPanel.add(textField_5);
=======
		txt_cedula = new JTextField();
		txt_cedula.setColumns(10);
		txt_cedula.setBounds(106, 314, 158, 26);
		contentPanel.add(txt_cedula);
>>>>>>> branch 'master' of https://github.com/morel06/ProyectoFinal_P1.git
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Cr\u00E9dito", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(292, 292, 300, 145);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Limite de Credito:");
		lblNewLabel_1.setBounds(16, 64, 112, 16);
		panel.add(lblNewLabel_1);
		
		JSpinner sp_limiteCre = new JSpinner();
		sp_limiteCre.setBounds(140, 59, 138, 26);
		panel.add(sp_limiteCre);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.window);
			buttonPane.setBounds(0, 437, 640, 65);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if ((txt_cedula.getText() != null &&  txt_cedula.getText().isEmpty() == false) && (txt_nombre.getText() != null && 
								txt_nombre.getText().isEmpty() == false) && (txt_direccion.getText() != null && txt_direccion.getText().isEmpty()
								== false) && (txt_telefono.getText() != null && txt_telefono.getText().isEmpty() == false) && 
								(txt_apellidos.getText() != null && txt_apellidos.getText().isEmpty() == false)) {
							String nombre = txt_nombre.getText() + txt_apellidos.getText();
							String cedula = txt_cedula.getText();
							String direccion = txt_direccion.getText();
							String telefono = txt_telefono.getText();
							float limiteCredito = (float) sp_limiteCre.getValue();
							String code = "CSC-";
							Clientes c = new Clientes(nombre, cedula, telefono, direccion, code, limiteCredito);
							Empresa.getinstance().AddCliente(c);
							JOptionPane.showMessageDialog(null, "Usted a agregado un cliente");
							}else{
								JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos");
							}
					}
				});
				okButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
				okButton.setBounds(118, 4, 124, 58);
				Image img0 = new ImageIcon(this.getClass().getResource("/guardar-48.png")).getImage();
				okButton.setIcon(new ImageIcon(img0));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
				cancelButton.setBounds(378, 4, 118, 58);
				Image img1 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
				cancelButton.setIcon(new ImageIcon(img1));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
