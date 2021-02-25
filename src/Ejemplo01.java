import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class Ejemplo01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo01 frame = new Ejemplo01();
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
	public Ejemplo01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// ActionListener es una interface por lo tanto no puedo crear un objeto de ella
				//observa las similitudes entre crear una clase y declarar el actionListener
				/*
				 * Son casi iguales. Eso es porque en el primer caso estas declarando una nueva clase
				 * anonima y le decimos que implementa el interface y ademas creamos un objeto porque 
				 * aparece la palabra new
				 */
				
				//anadir un listener a un componente significa que cuando se produzca el evento que 
				//escucha. procederemos a ejecutar el metodo actionPerformed
		JButton btnNewButton = new JButton("New button");
		// Aqui definimos un objeto con una clase anonima
		// que expresa el funcionamiento para un ActionListener asociado a
		// este boton
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//podemos acceder a miembros de la clase
				//miembros de una clase son propiedades y metodos publicos o  atributos
				if(contentPane.getBackground()!=Color.PINK) {
					contentPane.setBackground(Color.PINK);
					System.out.println("he llegado al if de que no es pink");
				}else {
					contentPane.setBackground(new Color(240, 240, 240));
				}
			}
		});
		btnNewButton.setBounds(111, 59, 223, 128);
		contentPane.add(btnNewButton);
	}
}
