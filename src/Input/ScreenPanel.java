package Input;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

import Connect.ServerInterface;

public class ScreenPanel extends JPanel{
	public ScreenPanel(IHM ihm) throws RemoteException{
		super(new GridBagLayout());
//		BufferedImage image = null;
//		try {
//			image = ImageIO.read(new File("res/image.png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		JLabel labelscreen = null;
//		if(image!=null)
//		{
//			labelscreen = new JLabel(new ImageIcon(image));
//		}
//		else
//		{
//			labelscreen = new JLabel("Impossible d'afficher l'image");
//		}
        BufferedImage image = ihm.server.createScreenCapture();
		JLabel labelscreen = new JLabel(new ImageIcon(image));
		this.add(labelscreen);
        Listener listener = new Listener(ihm.server);
		Border blueline = BorderFactory.createLineBorder(Color.red);
		this.setBorder(blueline);
        this.addKeyListener(listener);
        this.addMouseListener(listener);
        this.addMouseMotionListener(listener);
	}
	
	public ScreenPanel(IHM2 ihm){
		super(new GridBagLayout());
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("res/image.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel labelscreen = null;
		if(image!=null)
		{
			labelscreen = new JLabel(new ImageIcon(image));
		}
		else
		{
			labelscreen = new JLabel("Impossible d'afficher l'image");
		}
		this.add(labelscreen);
		Border blueline = BorderFactory.createLineBorder(Color.red);
		this.setBorder(blueline);
		this.setPreferredSize(labelscreen.getPreferredSize());
        Listener listener = new Listener(ihm.server);
        this.addKeyListener(listener);
        this.addMouseListener(listener);
        this.addMouseMotionListener(listener);
	}
}
