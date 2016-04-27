package Input;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ScreenPanel2 extends JPanel {
	public ScreenPanel2(){
		super();
		BufferedImage image = null;
		try {
			
			image = ImageIO.read(new File("res/image2.png"));
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
	}
}
