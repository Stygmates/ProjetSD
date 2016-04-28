package Input;

import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import Connect.ServerInterface;

public class ScreenPanel extends JPanel{
	public ScreenPanel(IHM ihm){
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
		labelscreen.setSize(1366, 768);
		this.add(labelscreen);
        Listener listener = new Listener(ihm.server);

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
        Listener2 listener = new Listener2(ihm.server);

        this.addKeyListener(listener);
        this.addMouseListener(listener);
        this.addMouseMotionListener(listener);
	}
}
