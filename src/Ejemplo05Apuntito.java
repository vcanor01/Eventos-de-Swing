import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Ejemplo05Apuntito extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo05Apuntito frame = new Ejemplo05Apuntito();
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
	public Ejemplo05Apuntito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(222, 43, 167, 165);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 3, 0, 0));
		int cantidad=9;
		for(int i=1;i<=cantidad;i++) {
			String cadena = String.valueOf(i);
			JButton btnNewButton = new JButton(cadena);
			panel.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					hazAlgo(cadena);
				}
			});
		}
		
		JLabel lblNewLabel = new JLabel(" ");
		panel.add(lblNewLabel);
		
		String text = "0";
		JButton btnNewButton_0 = new JButton(text);
		panel.add(btnNewButton_0);
		btnNewButton_0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				hazAlgo(text);
			}
		});
	}
	public void hazAlgo(String s) {
		System.out.println(s);
	}
}
