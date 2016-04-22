package Input;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IHM extends JFrame {	
	public IHM()
	{
		super();
		this.setTitle("Contrôle a distance");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JButton boutonExit = new JButton("Exit");
		JButton boutonOther = new JButton("Other");
		
		ActionListener actionBoutonExit = new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			};
		};
		
		boutonExit.addActionListener(actionBoutonExit);
		panel.add(boutonExit);
		panel.add(boutonOther);
		
		this.add(panel);
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}
	
	public static void main(String arg[])
	{
		IHM ihm = new IHM();
		Listener l = new Listener(ihm);
	}

}
