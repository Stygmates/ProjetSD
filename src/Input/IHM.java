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

public class IHM extends JFrame{
	protected String ipaddress = "192.168.1.23";
	public ServerInterface server;
	
	public IHM(){
		super("Controle a distance");
		try {
	    	server =(ServerInterface) Naming.lookup("//"+this.ipaddress+"/ServerImpl");
	    	System.out.println("Connexion effectuee");
	    }
		catch (NotBoundException re) { System.out.println(re) ; }
		catch (RemoteException re) { System.out.println(re) ; }
		catch (MalformedURLException e) { System.out.println(e) ; }
		
	}

    public static void main(String[] args) throws RemoteException {

        IHM ihm = new IHM();
        ihm.setDefaultCloseOperation(IHM.EXIT_ON_CLOSE);
        
        JPanel mainpanel = new JPanel(new GridBagLayout());
        ScreenPanel screenpanel = null;
        if(args.length==1)
        {
        	screenpanel = new ScreenPanel(ihm,args[0]);
        }
        else if(args.length == 2)
        {
        	screenpanel = new ScreenPanel(ihm, args[0], Integer.parseInt(args[1]));
        }
        else
        {
        	screenpanel = new ScreenPanel(ihm);
        }
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
        mainpanel.add(screenpanel,gbc);
		gbc.gridy = 1;
        ihm.add(mainpanel);
        ihm.setSize(1366,768);
        ihm.setExtendedState(MAXIMIZED_BOTH);
        ihm.setVisible(true);
        screenpanel.requestFocusInWindow();
    }
}