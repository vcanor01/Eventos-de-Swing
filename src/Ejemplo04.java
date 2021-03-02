import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo04 extends JFrame {

	private JPanel contentPane;
	private JTextField txtOpUno;
	private JTextField txtOpDos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo04 frame = new Ejemplo04();
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
	public Ejemplo04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtOpUno = new JTextField();
		txtOpUno.setBounds(10, 66, 86, 20);
		contentPane.add(txtOpUno);
		txtOpUno.setColumns(10);
		
		JLabel lblSigno = new JLabel("+");
		lblSigno.setBounds(106, 69, 26, 14);
		contentPane.add(lblSigno);
		
		txtOpDos = new JTextField();
		txtOpDos.setBounds(126, 66, 86, 20);
		contentPane.add(txtOpDos);
		txtOpDos.setColumns(10);
		
		JLabel lblResultado = new JLabel("=");
		lblResultado.setBounds(222, 69, 46, 14);
		contentPane.add(lblResultado);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(252, 69, 46, 14);
		contentPane.add(label_1);
		
		JButton btnSuma = new JButton("suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//no se hace asi porque accedemos a un objet de tipo textfield
				//float resultado=txtOpUno+txtOpDos;
				//no se hace asi porque las cadenas no tienen valor numerico
				float resultado=Float.valueOf(txtOpUno.getText())+Float.valueOf(txtOpDos.getText());
				lblResultado.setText(String.valueOf(resultado));
				//por lo tanto siempre hay que encontrar el elemento al que queremos acceder y darle
				//el formato adecuado. tanto de ida como de vuelta
			}
		});
		btnSuma.setBounds(135, 175, 89, 23);
		contentPane.add(btnSuma);
	}

}
