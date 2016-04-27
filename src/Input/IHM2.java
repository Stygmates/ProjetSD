package Input;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class IHM2 extends JFrame{
	protected String ipaddress = "127.0.0.1";
	
	public IHM2(){
		super("Controle a distance");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
	}

    public static void main(String[] args) {
    	IHM2 ihm = new IHM2();
    	JPanel mainpanel = new JPanel();
    	ScreenPanel screenpanel = new ScreenPanel();
    	mainpanel.add(screenpanel);
    	ihm.add(mainpanel);
    	ihm.setVisible(true);
		screenpanel.requestFocusInWindow();
    }
}