import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Ejemplo05Casi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo05Casi frame = new Ejemplo05Casi();
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
	public Ejemplo05Casi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		int ancho=50,alto=50;
		int x[]= {150,200,250};
		int y[]= {50,100,150};
		int cantidad=9;
		for (int j = 0; j < cantidad; j++) {
			String valueOf = String.valueOf(j+1);
			JButton btnNewButton = new JButton(valueOf);
			btnNewButton.setBounds(x[j%3], y[j/3], ancho, alto);
			contentPane.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					hazAlgo(valueOf);
				}
			});
		}
	}
	public void hazAlgo(String valor) {
		
	}
	public int calculaFila(int i) {
		//0,1,2 return 0
		//3,4,5 return 1
		//6,7,8 return 2
		return i/3;
	}

}
