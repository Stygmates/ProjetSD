package Input;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Connect.ServerImpl;

public class IHM extends JFrame{
	protected JPanel mainpanel;
	protected ScreenPanel screenpanel;
	protected ButtonPanel buttonpanel;
	protected ServerImpl server = null;
	protected String ipaddress = "127.0.0.1";
	
	public IHM(){
		super("Controle a distance");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		mainpanel = new JPanel(new GridBagLayout());
//		screenpanel = new ScreenPanel();
//		buttonpanel = new ButtonPanel(this);
//		
//		this.setExtendedState(MAXIMIZED_BOTH);
////		this.setSize(500, 500);
//		
//		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.gridx = 0;
//		gbc.gridy = 0;
//		Listener listener = new Listener(server);
//        screenpanel.addKeyListener(listener);
//        screenpanel.addMouseListener(listener);
//        screenpanel.addMouseMotionListener(listener);
//		mainpanel.add(screenpanel,gbc);
//		gbc.gridx = 0;
//		gbc.gridy = 1;
//		mainpanel.add(buttonpanel,gbc);
//		
//		this.add(mainpanel);
//		this.setVisible(true);
		
		screenpanel = new ScreenPanel();
		screenpanel.requestFocusInWindow();
		this.add(screenpanel);
		
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setVisible(true);
	}

    public static void main(String[] args) {
    	IHM ihm = new IHM();
    }
}