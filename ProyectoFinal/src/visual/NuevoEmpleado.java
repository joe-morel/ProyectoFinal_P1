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
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoEmpleado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
	public NuevoEmpleado() {
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
				Image img0 = new ImageIcon(this.getClass().getResource("/usuario-96.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img0));
			}
			
			JLabel lblEmpleado = new JLabel("Registro de Empleados");
			lblEmpleado.setForeground(new Color(255, 255, 255));
			lblEmpleado.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblEmpleado.setBounds(29, 53, 203, 16);
			panel.add(lblEmpleado);
			{
				JLabel lblCdigo = new JLabel("Código:");
				lblCdigo.setForeground(Color.WHITE);
				lblCdigo.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
				lblCdigo.setBounds(29, 81, 67, 16);
				panel.add(lblCdigo);
			}
			
			textField = new JTextField();
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
		lblNombre.setBounds(34, 226, 61, 16);
		contentPanel.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblApellidos.setBounds(338, 226, 96, 16);
		contentPanel.add(lblApellidos);
		
		JLabel lblCdula = new JLabel("Teléfono:");
		lblCdula.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula.setBounds(338, 275, 72, 16);
		contentPanel.add(lblCdula);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(107, 221, 158, 26);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(435, 221, 158, 26);
		contentPanel.add(textField_2);
		
		JLabel lblDireccin = new JLabel("Dirección:");
		lblDireccin.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblDireccin.setBounds(34, 276, 79, 16);
		contentPanel.add(lblDireccin);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(107, 271, 158, 26);
		contentPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(435, 270, 158, 26);
		contentPanel.add(textField_4);
		
		JLabel lblCdula_1 = new JLabel("Cédula:");
		lblCdula_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula_1.setBounds(34, 330, 79, 16);
		contentPanel.add(lblCdula_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(107, 325, 158, 26);
		contentPanel.add(textField_5);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.window);
			buttonPane.setBounds(0, 437, 640, 65);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("Guardar");
				okButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
				okButton.setBounds(118, 4, 124, 58);
				Image img1 = new ImageIcon(this.getClass().getResource("/guardar-48.png")).getImage();
				okButton.setIcon(new ImageIcon(img1));
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
				Image img2 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
				cancelButton.setIcon(new ImageIcon(img2));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
