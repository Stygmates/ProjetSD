package Input;

import javax.swing.JFrame;

public class Frame extends JFrame {
	public ScreenPanel2 screenpanel;
	public Frame(){
		super();
		this.screenpanel = new ScreenPanel2();
		Listener listener = new Listener();
		this.screenpanel.addKeyListener(listener);
		this.screenpanel.addMouseListener(listener);
		this.screenpanel.addMouseMotionListener(listener);
		this.add(screenpanel);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		Frame frame = new Frame();
		frame.screenpanel.requestFocusInWindow();
	}

}
