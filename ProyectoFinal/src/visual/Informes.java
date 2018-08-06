package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class Informes extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Informes() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 922, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 922, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gráficas");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		lblNewLabel.setBounds(412, 22, 97, 21);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Ganancias y Perdidas", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(29, 84, 414, 279);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Ventas Por Mes", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(29, 392, 414, 279);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Productos Mas Vendidos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(479, 84, 414, 279);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(479, 392, 414, 279);
		contentPane.add(panel_4);
	}

}
