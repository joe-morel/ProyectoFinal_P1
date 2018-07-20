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

public class NuevoCliente extends JDialog {

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
			NuevoEmpleado dialog = new NuevoEmpleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
				lblNewLabel.setIcon(new ImageIcon("/Users/joemorel/git/ProyectoFinal_P1/ProyectoFinal/img/icons8-persona-de-sexo-masculino-96.png"));
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
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(106, 210, 158, 26);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(434, 210, 158, 26);
		contentPanel.add(textField_2);
		
		JLabel lblDireccin = new JLabel("Dirección:");
		lblDireccin.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblDireccin.setBounds(33, 265, 79, 16);
		contentPanel.add(lblDireccin);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(106, 260, 158, 26);
		contentPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(434, 259, 158, 26);
		contentPanel.add(textField_4);
		
		JLabel lblCdula_1 = new JLabel("Cédula:");
		lblCdula_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula_1.setBounds(33, 319, 79, 16);
		contentPanel.add(lblCdula_1);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		textField_5.setBounds(106, 314, 158, 26);
		contentPanel.add(textField_5);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Cr\u00E9dito", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(292, 292, 300, 145);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Limite de Credito:");
		lblNewLabel_1.setBounds(16, 64, 112, 16);
		panel.add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(140, 59, 138, 26);
		panel.add(spinner);
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
				okButton.setIcon(new ImageIcon("/Users/joemorel/Downloads/icons8-guardar-como-48.png"));
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
				cancelButton.setIcon(new ImageIcon("/Users/joemorel/Downloads/icons8-señal-de-salida-48.png"));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}