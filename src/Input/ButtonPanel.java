package Input;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import Connect.ServerImpl;

public class ButtonPanel extends JPanel {
	public String ip = null;
	
	public ButtonPanel(){
		super(new GridLayout(2,2));
		
		JLabel iplabel = new JLabel("Adresse ip:");
		JTextField newip = new JTextField();
		JButton connectbutton = new JButton("Connexion");
		JButton exitbutton = new JButton("Quitter");
		
		connectbutton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ip = newip.getText();
			    try {
			    	ServerImpl server =(ServerImpl) Naming.lookup("//"+ip+"/ServerImpl");
			     }
			     catch (NotBoundException re) { System.out.println(re) ; }
			     catch (RemoteException re) { System.out.println(re) ; }
			     catch (MalformedURLException e) { System.out.println(e) ; }
			}
			
		});
		System.out.println(ip);
		this.add(iplabel);
		this.add(newip);
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
		exitbutton.addActionListener(exitButtonAction);

	}

}
