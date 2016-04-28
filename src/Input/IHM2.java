package Input;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Connect.ServerInterface;

public class IHM2 extends JFrame{
	protected String ipaddress = "192.168.1.23";
	public ServerInterface server;
	
	public IHM2(){
		super("Controle a distance");
		try {
	    	server =(ServerInterface) Naming.lookup("//"+this.ipaddress+"/ServerImpl");
	    	System.out.println("Connexion effectuee");
	    }
		catch (NotBoundException re) { System.out.println(re) ; }
		catch (RemoteException re) { System.out.println(re) ; }
		catch (MalformedURLException e) { System.out.println(e) ; }
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
	}

    public static void main(String[] args) {
    	IHM2 ihm = new IHM2();
    	JPanel mainpanel = new JPanel();
    	ScreenPanel screenpanel = new ScreenPanel(ihm.server);
    	mainpanel.add(screenpanel);
    	ihm.add(mainpanel);
    	ihm.setVisible(true);
		screenpanel.requestFocusInWindow();
    }
}