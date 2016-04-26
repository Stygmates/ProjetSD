package Connect;

import java.rmi.Remote; 
import java.rmi.RemoteException;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public interface ServerInterface extends Remote {
    public String messageDistant() throws RemoteException;
    public BufferedImage createScreenCapture(Rectangle screenRect) throws RemoteException;
    public void keyPress(int keycode) throws RemoteException;
    public void keyRelease(int keycode) throws RemoteException;
    public void mouseMove(int x, int y) throws RemoteException;
    public void mousePress(int buttons) throws RemoteException;
    public void mouseRelease(int buttons) throws RemoteException;
}