package Input;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class IHM extends JFrame{
	protected JPanel mainpanel;
	protected ScreenPanel screenpanel;
	protected ButtonPanel buttonpanel;
	
	public IHM(){
		super("Contrôle a distance");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		mainpanel = new JPanel(new GridBagLayout());
		screenpanel = new ScreenPanel();
		buttonpanel = new ButtonPanel();
		
		Listener listener = new Listener();
		
		this.setSize(500, 500);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		mainpanel.add(screenpanel,gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		mainpanel.add(buttonpanel,gbc);
		
		this.add(mainpanel);
	}

    public static void main(String[] args) {
    	IHM ihm = new IHM();
		ihm.screenpanel.requestFocusInWindow();
    }
}