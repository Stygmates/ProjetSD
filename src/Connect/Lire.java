package Connect;

import java.awt.Robot;

public class Lire {
    public static void main(String [] args) throws Exception {
	
	System.out.println(args[0]);
	
    Robot r = new Robot();
    
    int choix = 1;
    
    if(choix == 1)
    {
		r.mouseMove(35,35);
    }
    
    if(choix == 2 )
    {
    
     	r.keyPress(25);
     	r.keyRelease(25);
    }
    
  }
}
      
