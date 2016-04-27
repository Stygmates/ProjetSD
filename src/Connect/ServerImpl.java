 package Connect;
//  ./ServeurImpl 

import java.rmi.server.UnicastRemoteObject ;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.rmi.RemoteException ;

public class ServerImpl extends UnicastRemoteObject implements ServerInterface  {
	public Robot robot;
	public ServerImpl () throws RemoteException, AWTException {
		super();
		robot = new Robot();
	};
	
    public String messageDistant() throws RemoteException { 
    	
    	return("Message : Salut !!!") ;
    
    }

	@Override
	public BufferedImage createScreenCapture(Rectangle screenRect) throws RemoteException {
		return this.robot.createScreenCapture(screenRect);
	}

	@Override
	public void keyPress(int keycode) throws RemoteException {
		this.robot.keyPress(keycode);
	}

	@Override
	public void keyRelease(int keycode) throws RemoteException {
		this.robot.keyRelease(keycode);
	}

	@Override
	public void mouseMove(int x, int y) throws RemoteException {
		this.robot.mouseMove(x, y);
	}

	@Override
	public void mousePress(int buttons) throws RemoteException {
		this.robot.mousePress(buttons);
	}

	@Override
	public void mouseRelease(int buttons) throws RemoteException {
		this.robot.mouseRelease(buttons);
	}
}
