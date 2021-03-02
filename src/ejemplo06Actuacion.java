import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ejemplo06Actuacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejemplo06Actuacion frame = new ejemplo06Actuacion();
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
	public ejemplo06Actuacion() {
		MyOtherActionListener miActionListener=new MyOtherActionListener();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("uno");
		btnNewButton.setBounds(71, 48, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(miActionListener);
		
		JButton btnNewButton_1 = new JButton("dos");
		btnNewButton_1.setBounds(248, 48, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(miActionListener);
		
		JButton btnNewButton_2 = new JButton("tres");
		btnNewButton_2.setBounds(170, 133, 89, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(miActionListener);
	}

}
