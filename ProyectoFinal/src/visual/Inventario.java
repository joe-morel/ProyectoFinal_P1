package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;

public class Inventario extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Inventario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(0, 0, 640, 122);
		contentPane.add(panel);
		
		JLabel lblInventario = new JLabel("INVENTARIO");
		lblInventario.setForeground(Color.WHITE);
		lblInventario.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblInventario.setBounds(265, 6, 109, 16);
		panel.add(lblInventario);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 122, 640, 27);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("Información General");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_1.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 174, 604, 204);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("Salir");
		button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button.setActionCommand("Cancel");
		button.setBounds(261, 415, 118, 58);
		contentPane.add(button);
	}
}
