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
		
	}

    public static void main(String[] args) {

        IHM2 ihm = new IHM2();
        ihm.setDefaultCloseOperation(IHM2.EXIT_ON_CLOSE);

        ScreenPanel panel = new ScreenPanel(ihm);
        ihm.add(panel);
        ihm.setSize(1366,768);
        ihm.setExtendedState(MAXIMIZED_BOTH);
        ihm.setVisible(true);

        //make sure the JPanel has the focus
        panel.requestFocusInWindow();
    }
}