package Input;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IHMServer extends JFrame{
	public IHMServer(){
		super();
		JPanel mainPanel = new JPanel();
		JButton connectbutton = new JButton("Connexion");
		JButton exitbutton = new JButton("Quitter");
		
		ActionListener exitButtonAction = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		};
		exitbutton.addActionListener(exitButtonAction);
		mainPanel.add(connectbutton);
		mainPanel.add(exitbutton);
		this.setLayout(new BorderLayout());
		this.add(mainPanel, BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] arg){
		IHMServer ihmserver = new IHMServer();
	}
}
