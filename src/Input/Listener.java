package Input;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Listener extends JFrame implements MouseListener, KeyListener{
	private Frame frame;
	private Robot robot;
	
	public Listener(Frame f)
	{
		super();
		this.frame = f;
		try {
			robot = new Robot();
		} catch (java.awt.AWTException e){};
		int j;
		for(j=0;j<f.getComponentCount();j++){
			f.getComponent(j).addMouseListener(this);
			f.getComponent(j).addKeyListener(this);
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Click de souris " + arg0.getButton());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Souris entrée");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Souris sortie");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Souris pressée " + arg0.getButton());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Bouton souris relachée " + arg0.getButton());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Touche pressée : " + e.getKeyChar());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Touche relachée : " + e.getKeyChar());
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Touche tapée : " + e.getKeyChar());
		// TODO Auto-generated method stub
		
	}
}