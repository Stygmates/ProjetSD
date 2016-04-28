package Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.rmi.RemoteException;

import Connect.ServerImpl;
import Connect.ServerInterface;

public class Listener implements KeyListener, MouseListener, MouseMotionListener{
	public ServerInterface serv;
	public Listener (ServerInterface serv1)
	{
		serv =  serv1;
	}


    public void keyTyped(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            System.out.println("Touche tapee : Droite");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            System.out.println("Touche tapee: Gauche");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_UP ) {
            System.out.println("Touche tapee: Haut");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            System.out.println("Touche tapee: Bas");
        }
        else{
            System.out.println("Touche tapee: " + e.getKeyChar());
        }
    }

    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            System.out.println("Touche pressee: Droite");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            System.out.println("Touche pressee: Gauche");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_UP ) {
            System.out.println("Touche pressee: Haut");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            System.out.println("Touche pressee: Bas");
        }
        else{
            System.out.println("Touche pressee: " + e.getKeyChar());
        }
        try {
			serv.keyPress(e.getKeyCode());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }

    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            System.out.println("Touche droite relachee");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            System.out.println("Touche gauche relachee");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_UP ) {
            System.out.println("Touche haut relachee");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            System.out.println("Touche bas relachee");
        }
        else{
            System.out.println("Touche relachee: " + e.getKeyChar());
        }
        try {
			serv.keyRelease(e.getKeyCode());
		} catch (RemoteException e1) {
			e1.printStackTrace();
		}
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Click de souris " + e.getButton() + " en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Souris pressee en (" + e.getX() + ", " + e.getY() + ")");
        try {
			serv.mousePress(e.getButton());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Souris relachee en (" + e.getX() + ", " + e.getY() + ")");
        try {
			serv.mouseRelease(e.getButton());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Souris entree en (" + e.getX() + ", " + e.getY() + ")");
        try {
			serv.mouseMove(e.getX(), e.getY());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Souris sortie en (" + e.getX() + ", " + e.getY() + ")");
        try {
			serv.mouseMove(e.getX(), e.getY());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }


    public void mouseDragged(MouseEvent e) {
        System.out.println("Souris draguee en (" + e.getX() + ", " + e.getY() + ")");
        try {
			serv.mouseMove(e.getX(), e.getY());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Souris bougee en (" + e.getX() + ", " + e.getY() + ")");
        try {
			serv.mouseMove(e.getX(), e.getY());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }

}