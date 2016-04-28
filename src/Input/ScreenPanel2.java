package Input;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	}
	public static void main(String [] arg) throws AWTException{
		Robot robot = new Robot();
		Rectangle rectangle = new Rectangle((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		JFrame frame = new JFrame();
		JLabel labelscreen = new JLabel();
		BufferedImage image = robot.createScreenCapture(rectangle);
		ActionListener actiontimer = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				labelscreen.setIcon(new ImageIcon(image));
				labelscreen.revalidate();
				labelscreen.repaint();
				labelscreen.update(labelscreen.getGraphics());
				frame.add(labelscreen);
			}
		};
		Timer t = new Timer(1, actiontimer);
		frame.add(labelscreen);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
