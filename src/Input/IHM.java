package Input;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Connect.ServerImpl;
import Connect.ServerInterface;

public class IHM extends JFrame{
	protected JPanel mainpanel;
	protected ScreenPanel screenpanel;
	protected ButtonPanel buttonpanel;
	protected ServerInterface server;
	protected int connecte = 0;
	protected String ipaddress = "127.0.0.1";
	
	public IHM(){
		super("Controle a distance");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainpanel = new JPanel(new GridBagLayout());
		screenpanel = new ScreenPanel(this);
		buttonpanel = new ButtonPanel(this);
		
		this.setExtendedState(MAXIMIZED_BOTH);
//		this.setSize(500, 500);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		Listener listener = new Listener(server);
        screenpanel.addKeyListener(listener);
        screenpanel.addMouseListener(listener);
        screenpanel.addMouseMotionListener(listener);
		mainpanel.add(screenpanel,gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		mainpanel.add(buttonpanel,gbc);
		
		this.add(mainpanel);
		this.setVisible(true);
		
		screenpanel = new ScreenPanel(this);
		screenpanel.requestFocusInWindow();
		this.add(screenpanel);
	}

    public static void main(String[] args) {
    	IHM ihm = new IHM();
    	ihm.setSize(1366, 768);
		ihm.setExtendedState(MAXIMIZED_BOTH);
		ihm.setVisible(true);
    }
}