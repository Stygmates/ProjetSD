package Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Listener implements KeyListener, MouseListener, MouseMotionListener{


    public void keyTyped(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            System.out.println("Touche tap�e : Droite");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            System.out.println("Touche tap�e: Gauche");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_UP ) {
            System.out.println("Touche tap�e: Haut");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            System.out.println("Touche tap�e: Bas");
        }
        else{
            System.out.println("Touche tap�e: " + e.getKeyChar());
        }
    }

    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            System.out.println("Touche press�e: Droite");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            System.out.println("Touche press�e: Gauche");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_UP ) {
            System.out.println("Touche press�e: Haut");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            System.out.println("Touche press�e: Bas");
        }
        else{
            System.out.println("Touche press�e: " + e.getKeyChar());
        }
    }

    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            System.out.println("Touche droite rel�ch�e");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            System.out.println("Touche gauche rel�ch�e");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_UP ) {
            System.out.println("Touche haut rel�ch�e");
        } 
        else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            System.out.println("Touche bas rel�ch�e");
        }
        else{
            System.out.println("Touche rel�ch�e: " + e.getKeyChar());
        }
    }



    public void mouseClicked(MouseEvent e) {
        System.out.println("Click de souris en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Souris press�e en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Souris rel�ch�e en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Souris entr�e en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Souris sortie en (" + e.getX() + ", " + e.getY() + ")");
    }


    public void mouseDragged(MouseEvent e) {
        System.out.println("Souris dragu�e en (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Souris boug�e en (" + e.getX() + ", " + e.getY() + ")");
    }

}