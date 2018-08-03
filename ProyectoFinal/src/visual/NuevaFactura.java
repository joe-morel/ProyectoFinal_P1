package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;

public class NuevaFactura extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JRadioButton rbtnContado;
	private JRadioButton rbtnCredito;
	private JTextField textField_7;
	private JTextField textField_8;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevaFactura dialog = new NuevaFactura();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevaFactura() {
		setBounds(100, 100, 900, 620);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 900, 54);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblFacturacin = new JLabel("Facturación");
		lblFacturacin.setForeground(new Color(0, 102, 153));
		lblFacturacin.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblFacturacin.setBounds(372, 9, 155, 36);
		panel.add(lblFacturacin);
		{
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(0, 102, 153));
			panel_1.setBounds(0, 54, 900, 151);
			contentPanel.add(panel_1);
			panel_1.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Cliente:");
				lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setBounds(17, 31, 61, 16);
				panel_1.add(lblNewLabel);
			}
			
			textField = new JTextField();
			textField.setBounds(90, 27, 139, 26);
			panel_1.add(textField);
			textField.setColumns(10);
			
			JLabel lblCdula = new JLabel("Cédula:");
			lblCdula.setForeground(Color.WHITE);
			lblCdula.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblCdula.setBounds(17, 70, 61, 16);
			panel_1.add(lblCdula);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(90, 65, 139, 26);
			panel_1.add(textField_1);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "M\u00E9todo de Pago", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
			panel_2.setBounds(700, 28, 168, 95);
			panel_1.add(panel_2);
			panel_2.setLayout(null);
			
			 rbtnContado = new JRadioButton("Al Contado");
			 rbtnContado.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		rbtnContado.setSelected(true);
			 		rbtnCredito.setSelected(false);
			 	}
			 });
			rbtnContado.setBounds(18, 24, 141, 23);
			panel_2.add(rbtnContado);
			
			rbtnCredito = new JRadioButton("A Crédito");
			rbtnCredito.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					rbtnContado.setSelected(false);
					rbtnCredito.setEnabled(true);
				}
			});
			rbtnCredito.setBounds(18, 59, 141, 23);
			panel_2.add(rbtnCredito);
			
			JLabel lblTl = new JLabel("Télefono:");
			lblTl.setForeground(Color.WHITE);
			lblTl.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblTl.setBounds(17, 107, 88, 16);
			panel_1.add(lblTl);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(100, 103, 129, 26);
			panel_1.add(textField_2);
			
			JLabel lblCajero = new JLabel("Cajero:");
			lblCajero.setForeground(Color.WHITE);
			lblCajero.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblCajero.setBounds(262, 31, 61, 16);
			panel_1.add(lblCajero);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(335, 26, 139, 26);
			panel_1.add(textField_3);
			
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setForeground(Color.WHITE);
			lblUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblUsuario.setBounds(262, 70, 74, 16);
			panel_1.add(lblUsuario);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(335, 65, 139, 26);
			panel_1.add(textField_4);
			
			JLabel lblFecha_1 = new JLabel("Fecha:");
			lblFecha_1.setForeground(Color.WHITE);
			lblFecha_1.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
			lblFecha_1.setBounds(262, 108, 74, 16);
			panel_1.add(lblFecha_1);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(335, 103, 139, 26);
			panel_1.add(textField_5);
			
			JLabel lblNoFact = new JLabel("Fact. #:");
			lblNoFact.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
			lblNoFact.setForeground(UIManager.getColor("Button.highlight"));
			lblNoFact.setBounds(496, 67, 61, 16);
			panel_1.add(lblNoFact);
			
			textField_6 = new JTextField();
			textField_6.setBounds(553, 62, 74, 26);
			panel_1.add(textField_6);
			textField_6.setColumns(10);
		}
		
		JList list = new JList();
		list.setBounds(6, 249, 440, 262);
		contentPanel.add(list);
		
		JButton button = new JButton("Añadir");
		Image img1 = new ImageIcon(this.getClass().getResource("/agregar.png")).getImage();
		button.setIcon(new ImageIcon(img1));
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("OK");
		button.setBounds(18, 523, 131, 58);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("Eliminar");
		Image img2 = new ImageIcon(this.getClass().getResource("/eliminar-64.png")).getImage();
		button_1.setIcon(new ImageIcon(img2));
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_1.setActionCommand("Cancel");
		button_1.setBounds(161, 523, 118, 58);
		contentPanel.add(button_1);
		
		JButton btnFacturar = new JButton("FACTURAR!");
		Image img3 = new ImageIcon(this.getClass().getResource("/Factura.png")).getImage();
		btnFacturar.setIcon(new ImageIcon(img3));
		btnFacturar.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		btnFacturar.setActionCommand("OK");
		btnFacturar.setBounds(291, 523, 147, 58);
		contentPanel.add(btnFacturar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("InternalFrame.paletteBackground"));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(452, 523, 440, 69);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sub-Total:");
		lblNewLabel_1.setBounds(31, 11, 72, 16);
		panel_1.add(lblNewLabel_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(111, 6, 130, 26);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setForeground(new Color(255, 0, 0));
		lblTotal.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 17));
		lblTotal.setBounds(31, 39, 72, 16);
		panel_1.add(lblTotal);
		
		textField_8 = new JTextField();
		textField_8.setBounds(111, 34, 130, 26);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/efectivo5.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img4));
		lblNewLabel_4.setBounds(293, 6, 72, 54);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Lista de Productos");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(145, 221, 147, 16);
		contentPanel.add(lblNewLabel_2);
		
		JList list_1 = new JList();
		list_1.setBounds(452, 249, 440, 262);
		contentPanel.add(list_1);
		
		JLabel lblCarrito = new JLabel("Carrito");
		lblCarrito.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCarrito.setBounds(646, 221, 62, 16);
		contentPanel.add(lblCarrito);
	}
}
