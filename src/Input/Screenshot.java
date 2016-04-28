package Input;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.*;

import Connect.ServerInterface;

public class Screenshot extends JPanel {
	public static void main(String []arg){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
	    try {
	    	ServerInterface server =(ServerInterface) Naming.lookup("//192.168.1.23/ServerImpl");
		    JLabel label = new JLabel();
		    BufferedImage image = server.createScreenCapture();
		    label.setIcon(new ImageIcon(image));
		    panel.add(label);
	     }
	     catch (NotBoundException re) { System.out.println(re) ; }
	     catch (RemoteException re) { System.out.println(re) ; }
	     catch (MalformedURLException e) { System.out.println(e) ; }
	    frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
