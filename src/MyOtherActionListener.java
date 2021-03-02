import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyOtherActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton=(JButton)e.getSource();
		String.valueOf(67.9f);
		
		System.out.println("soy "+boton.getText());

	}

}
