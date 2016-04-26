package Input;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel {
	
	public ButtonPanel(){
		super();
		
		JLabel iplabel = new JLabel();
		JButton connectbutton = new JButton("Connexion");
		JButton exitbutton = new JButton("Quitter");

		this.add(connectbutton);
		this.add(exitbutton);
		Border blueline = BorderFactory.createLineBorder(Color.blue);
		this.setBorder(blueline);
		ActionListener exitButtonAction = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		};
		
		ActionListener refreshbuttonaction = new ActionListener(){
			public void actionPerformed(ActionEvent e){
			}
		};
		
		exitbutton.addActionListener(exitButtonAction);

	}

}
