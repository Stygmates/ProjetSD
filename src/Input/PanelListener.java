package Input;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class PanelListener extends JPanel implements MouseListener, KeyListener{
	private JPanel panel;
	private Robot robot;
	
	public PanelListener(JPanel p)
	{
		super();
		this.panel = p;
		this.panel.addMouseListener(this);
		this.panel.addKeyListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Click de souris " + arg0.getButton());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Souris entr�e");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Souris sortie");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Souris press�e " + arg0.getButton());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Bouton souris relach�e " + arg0.getButton());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Touche press�e : " + e.getKeyChar());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Touche relach�e : " + e.getKeyChar());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Touche tap�e : " + e.getKeyChar());
		// TODO Auto-generated method stub
		
	}
}