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

public class Ejemplo03 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo03 frame = new Ejemplo03();
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
	public Ejemplo03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(66, 14, 358, 20);
		contentPane.add(textField);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(10, 14, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblSaluda = new JLabel("");
		lblSaluda.setBounds(10, 98, 414, 14);
		contentPane.add(lblSaluda);
		
		JButton btnSaluda = new JButton("Saluda");
		btnSaluda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					lblSaluda.setText("Hola "+textField.getText()+" que tal estas?");
				}else {
					lblSaluda.setText("No has escrito nada en el nombre");
				}
			}
		});
		btnSaluda.setBounds(180, 199, 89, 23);
		contentPane.add(btnSaluda);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(81, 161, 111, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(38, 203, 46, 14);
		contentPane.add(lblResultado);
		
		JButton btnValida = new JButton("Valida");
		btnValida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtNumero.getText().isEmpty()) {
					//En este caso hay un problema porque los componentes
					//fucionan con String si quiero un numero debo Convertir
					lblSaluda.setText(String.valueOf(Float.valueOf(txtNumero.getText())*2));
				}
			}
		});
		btnValida.setBounds(239, 157, 89, 23);
		contentPane.add(btnValida);
		
	}
}
