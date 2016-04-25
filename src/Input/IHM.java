package Input;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class IHM extends JFrame {

	public IHM()
	{
//		super();
//		JPanel mainpanel = new JPanel();
//		JPanel panelScreen = new ScreenPanel();
//		JPanel panelBoutons = new JPanel();
//		
//		JButton boutonExit = new JButton("Quitter");
//		JButton boutonRefresh = new JButton("Actualiser");
//		
//		panelBoutons.add(boutonExit);
//		panelBoutons.add(boutonRefresh);
//		
//		
//		ActionListener actionBoutonExit = new ActionListener(){
//			public void actionPerformed(ActionEvent e)
//			{
//				System.exit(0);
//			};
//		};
//		
//		boutonExit.addActionListener(actionBoutonExit);
//		mainpanel.add(panelScreen);
//		mainpanel.add(panelBoutons);
//		mainpanel.setLayout(new GridLayout(2,1));
//		
//		this.add(mainpanel);
		
		GridBagLayout grid = new GridBagLayout();
		JPanel mainpanel = new JPanel(new GridBagLayout());
		
		ScreenPanel screenpanel = new ScreenPanel();
		JPanel buttonpanel = new JPanel(new GridBagLayout());
		
		JButton exitbutton = new JButton("Quitter");
		JButton refreshbutton = new JButton("Rafraichir");
		
		
		ActionListener exitButtonAction = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		};
		
		ActionListener refreshbuttonaction = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			}
		};
		exitbutton.addActionListener(exitButtonAction);
		refreshbutton.addActionListener(refreshbuttonaction);
		buttonpanel.add(exitbutton);
		buttonpanel.add(refreshbutton);
		
		mainpanel.add(screenpanel);
		mainpanel.add(buttonpanel);
		this.add(mainpanel);
		
		this.setTitle("Contrôle a distance"); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setVisible(true);
	}

	public static void main(String arg[])
	{
		IHM ihm = new IHM();
	}

}
