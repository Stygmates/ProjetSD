package Input;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.*;
import javax.swing.border.Border;

import Connect.ServerImpl;

public class ButtonPanel extends JPanel {
	public String ipaddress = "127.0.0.1";
	
	public ButtonPanel(IHM ihm){
		super(new GridLayout(1,3));
		
		JButton ipbutton = new JButton("Modifier l'adresse ip");
		JButton connectbutton = new JButton("Connexion");
		JButton exitbutton = new JButton("Quitter");
		
		
		ipbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ipaddress = JOptionPane.showInputDialog("Nouvelle adresse ip");
			}
		});
		connectbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    try {
			    	ServerImpl server =(ServerImpl) Naming.lookup("//"+ipaddress+"/ServerImpl");
			    	System.out.println("Connexion effectuée");
			     }
			     catch (NotBoundException re) { System.out.println(re) ; }
			     catch (RemoteException re) { System.out.println(re) ; }
			     catch (MalformedURLException e) { System.out.println(e) ; }
			}
			
		});
		
		this.add(ipbutton);
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
