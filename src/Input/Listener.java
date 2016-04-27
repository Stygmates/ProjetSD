package Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Listener implements KeyListener, MouseListener, MouseMotionListener{


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
    }



    public void mouseClicked(MouseEvent e) {
        System.out.println("Click de souris en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Souris pressee en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Souris relachee en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Souris entree en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Souris sortie en (" + e.getX() + ", " + e.getY() + ")");
    }


    public void mouseDragged(MouseEvent e) {
        System.out.println("Souris draguee en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Souris bougee en (" + e.getX() + ", " + e.getY() + ")");
    }

}