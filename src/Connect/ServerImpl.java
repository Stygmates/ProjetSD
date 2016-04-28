 package Connect;
//  ./ServeurImpl 

import java.rmi.server.UnicastRemoteObject ;

import javax.swing.ImageIcon;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.rmi.RemoteException ;

public class ServerImpl extends UnicastRemoteObject implements ServerInterface  {
	public Robot robot;
	public ServerImpl () throws RemoteException, AWTException {
		super();
		robot = new Robot();
	};

	@Override
	public ImageIcon createScreenCapture() throws RemoteException {
		Rectangle rectangle = new Rectangle((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		BufferedImage image = this.robot.createScreenCapture(rectangle);
		ImageIcon img = new ImageIcon(image);
		return img;
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
		if(buttons == 1){
			this.robot.mousePress(InputEvent.BUTTON1_MASK);
		}
		else if(buttons == 2){
			this.robot.mousePress(InputEvent.BUTTON2_MASK);
		}
		else if(buttons == 3)
		{
			this.robot.mousePress(InputEvent.BUTTON3_MASK);
		}
	}

	@Override
	public void mouseRelease(int buttons) throws RemoteException {
		if(buttons == 1){
			this.robot.mouseRelease(InputEvent.BUTTON1_MASK);
		}
		else if(buttons == 2){
			this.robot.mouseRelease(InputEvent.BUTTON2_MASK);
		}
		else if(buttons == 3){
			this.robot.mouseRelease(InputEvent.BUTTON3_MASK);
		}
	}

	@Override
	public String test() throws RemoteException {
		return "Coucou toi :3";
	}
}
