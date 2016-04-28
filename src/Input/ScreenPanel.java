package Input;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

import Connect.ServerInterface;

public class ScreenPanel extends JPanel{
	BufferedImage image = null;
	public ScreenPanel(IHM ihm) throws RemoteException{
		super(new GridBagLayout());
		/*
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
		labelscreen.setSize(1366, 768);
		this.add(labelscreen);
		*/
        Listener listener = new Listener(ihm.server);
        Rectangle rectangle = new Rectangle(1366,768);
        image = listener.serv.createScreenCapture();
		JLabel label = new JLabel(new ImageIcon(image));
//		Timer SimpleTimer = new Timer(1, new ActionListener(){
//		    @Override
//		    public void actionPerformed(ActionEvent e) {
//		    	try {
//					image = listener.serv.createScreenCapture(rectangle);
//				} catch (RemoteException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//		    	label.setIcon(new ImageIcon(image));
//		    }
//		});
//		SimpleTimer.start();
		this.add(label);
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
        Listener listener = new Listener(ihm.server);
        this.addKeyListener(listener);
        this.addMouseListener(listener);
        this.addMouseMotionListener(listener);
	}
}
