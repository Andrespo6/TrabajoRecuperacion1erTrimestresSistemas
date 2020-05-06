package Programa;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.JTextPane;

/**
 * @author Andrés Peña
 *
 */
public class Ejecut extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejecut frame = new Ejecut();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Ejecut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Conversor a est\u00E1ndar IEEE 754");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 26));
		lblNewLabel.setBounds(10, 11, 464, 51);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(10, 113, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel(
				"Introduce un numero:");
		lblNewLabel_1.setBounds(10, 73, 447, 29);
		contentPane.add(lblNewLabel_1);

		btnNewButton = new JButton("Convertir");
		btnNewButton.setBounds(368, 181, 89, 23);
		contentPane.add(btnNewButton);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(10, 237, 447, 20);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Resultado:");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 164, 169, 51);
		contentPane.add(lblNewLabel_3);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.Numero = Double.parseDouble(textField.getText());
				Main.CodigoRun();
				lblNewLabel_2.setText(Main.ResIEEE);
			}
		});

	}
}
