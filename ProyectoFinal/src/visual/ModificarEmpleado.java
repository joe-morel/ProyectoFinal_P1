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
import logical.Empleados;
import logical.Empresa;

import javax.swing.border.EtchedBorder;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarEmpleado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField txt_nombre;
	private JTextField txt_direccion;
	private JTextField txt_telefono;
	private JTextField txt_cedula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoCliente dialog = new NuevoCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModificarEmpleado(Empleados emp, int aux) {
		setModal(true);
		setAlwaysOnTop(true);
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
				Image img0 = new ImageIcon(this.getClass().getResource("/usuario-96.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img0));
			}
			
			JLabel lblEmpleado = new JLabel("Modificar Empleado");
			lblEmpleado.setForeground(new Color(255, 255, 255));
			lblEmpleado.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblEmpleado.setBounds(29, 53, 203, 16);
			panel.add(lblEmpleado);
			{
				JLabel lblCdigo = new JLabel("Codigo:");
				lblCdigo.setForeground(Color.WHITE);
				lblCdigo.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
				lblCdigo.setBounds(29, 81, 67, 16);
				panel.add(lblCdigo);
			}
			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setText("EP-"+(Empresa.cantEmpleados+1));
			textField.setBounds(90, 76, 106, 26);
			panel.add(textField);
			textField.setText(Empresa.getinstance().BuscarEmpleadoCodigo(aux));
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
		lblNombre.setBounds(34, 226, 61, 16);
		contentPanel.add(lblNombre);
		
		JLabel lblCdula = new JLabel("Telefono:");
		lblCdula.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula.setBounds(338, 275, 72, 16);
		contentPanel.add(lblCdula);
		

	

		txt_nombre = new JTextField();
		txt_nombre.setEnabled(true);
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(106, 221, 304, 26);
		contentPanel.add(txt_nombre);

		
		JLabel lblDireccin = new JLabel("Direccion:");
		lblDireccin.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblDireccin.setBounds(34, 276, 79, 16);
		contentPanel.add(lblDireccin);
		

	

		txt_direccion = new JTextField();
		txt_direccion.setColumns(10);
		txt_direccion.setBounds(106, 271, 158, 26);
		contentPanel.add(txt_direccion);

		

		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(434, 270, 158, 26);
		contentPanel.add(txt_telefono);

		
		JLabel lblCdula_1 = new JLabel("Cedula:");
		lblCdula_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula_1.setBounds(34, 330, 79, 16);
		contentPanel.add(lblCdula_1);
		

	

		txt_cedula = new JTextField();
		txt_cedula.setColumns(10);
		txt_cedula.setBounds(106, 325, 158, 26);
		contentPanel.add(txt_cedula);
		cargarDatos(emp);

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
								== false) && (txt_telefono.getText() != null && txt_telefono.getText().isEmpty() == false)) {
							String nombre = txt_nombre.getText();
							String cedula = txt_cedula.getText();
							String direccion = txt_direccion.getText();
							String telefono = txt_telefono.getText();
							String code = Empresa.getinstance().BuscarEmpleadoCodigo(aux);
							Empleados e = new Empleados(nombre, cedula, telefono, direccion, code);
							Empresa.getinstance().ModificarEmpleado(e, aux);
							JOptionPane.showMessageDialog(null, "Usted a agregado un Empleado",code, JOptionPane.INFORMATION_MESSAGE);
							ListaDeEmpleados.CargarTabla();
							dispose();
							}else{
								JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos");
							}
					}
				});
				okButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
				okButton.setBounds(118, 4, 124, 58);
				Image img1 = new ImageIcon(this.getClass().getResource("/guardar-48.png")).getImage();
				okButton.setIcon(new ImageIcon(img1));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
				cancelButton.setBounds(378, 4, 118, 58);
				Image img2 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
				cancelButton.setIcon(new ImageIcon(img2));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	private void cargarDatos(Empleados emp) {
		txt_nombre.setText(emp.getNombre());
		txt_direccion.setText(emp.getDireccion());
		txt_cedula.setText(emp.getCedula());
		txt_telefono.setText(emp.getTelefono());
		
	}
}
