package Input;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class IHM extends JFrame {
	JPanel mainPanel = new JPanel();
	JPanel panelScreen = initPanelScreen();
	JPanel panelBoutons = new JPanel();
	
	JButton boutonExit = new JButton("Exit");
	JButton boutonOther = new JButton("Other");
	
	public IHM()
	{
		super();
		
		this.addListeners();
		
		panelBoutons.add(boutonExit);
		panelBoutons.add(boutonOther);
		
		this.mainPanel.add(this.panelScreen);
		this.mainPanel.add(this.panelBoutons);
		
		this.add(this.mainPanel);
		
		this.setTitle("Contrôle a distance");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}
	
	public JPanel initPanelScreen()
	{
		JPanel panelScreen = new JPanel();
		panelScreen.setSize(800, 600);
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("res/image.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel labelScreen = null;
		if(image!=null)
		{
			labelScreen = new JLabel(new ImageIcon(image));
		}
		else
		{
			labelScreen = new JLabel("Impossible d'afficher l'image");
		}
		panelScreen.add(labelScreen);
		return panelScreen;
	}
	
	public void addListeners(){
		ActionListener actionBoutonExit = new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			};
		};
		this.boutonExit.addActionListener(actionBoutonExit);
	}
	
	public static void main(String arg[])
	{
		IHM ihm = new IHM();
		Listener l = new Listener(ihm);
	}

}
