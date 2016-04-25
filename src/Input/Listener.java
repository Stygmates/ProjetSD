package Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Listener implements KeyListener, MouseListener, MouseMotionListener{


    public void keyTyped(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            System.out.println("Touche tapée : Droite");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            System.out.println("Touche tapée: Gauche");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_UP ) {
            System.out.println("Touche tapée: Haut");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            System.out.println("Touche tapée: Bas");
        }
        else{
            System.out.println("Touche tapée: " + e.getKeyChar());
        }
    }

    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            System.out.println("Touche pressée: Droite");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            System.out.println("Touche pressée: Gauche");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_UP ) {
            System.out.println("Touche pressée: Haut");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            System.out.println("Touche pressée: Bas");
        }
        else{
            System.out.println("Touche pressée: " + e.getKeyChar());
        }
    }

    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            System.out.println("Touche droite relâchée");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            System.out.println("Touche gauche relâchée");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_UP ) {
            System.out.println("Touche haut relâchée");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            System.out.println("Touche bas relâchée");
        }
        else{
            System.out.println("Touche relâchée: " + e.getKeyChar());
        }
    }



    public void mouseClicked(MouseEvent e) {
        System.out.println("Click de souris en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Souris pressée en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Souris relâchée en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Souris entrée en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Souris sortie en (" + e.getX() + ", " + e.getY() + ")");
    }


    public void mouseDragged(MouseEvent e) {
        System.out.println("Souris draguée en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Souris bougée en (" + e.getX() + ", " + e.getY() + ")");
    }

}