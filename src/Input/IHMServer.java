package Input;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Connect.ServerImpl;

public class IHMServer extends JFrame{
	public IHMServer(){
		super();
		JPanel mainPanel = new JPanel();
		JButton connectbutton = new JButton("Connexion");
		JButton exitbutton = new JButton("Quitter");
		
		ActionListener connectbuttonaction = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			       try {
			    	   LocateRegistry.createRegistry(1099);
			    	   ServerImpl objLocal = new ServerImpl();
			    	   Naming.rebind("rmi://localhost:1099/ServerImpl",objLocal) ;
			    	   System.out.println("Serveur pret");
			       }
			    catch (RemoteException re) { System.out.println(re) ; }
			    catch (MalformedURLException e2) { System.out.println(e2) ; }
			    catch(AWTException e3){System.out.println(e3);}
			}
		};
		connectbutton.addActionListener(connectbuttonaction);
		
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
