package Connect;

public class Data {
    
    private int choix;
    private int posX;
    private int posY;
    private int keycode;
    
    public Data () {
		
		choix = 0 ;
		posX = 0;
		posY = 0;
		keycode = 0;
	}
    
    public Data ( int posX,int posY) {
		
		choix = 1 ;
		posX = posX;
		posY = posY;
	}
    
    public Data ( int keycode) {
		
		choix = 2 ;
		keycode = keycode;
	}
    
    public int getChoix ( ) {
		
		return choix ;
	}
	
	public int getPosX ( ) {
		
		return posX ;
	}
	
	public int getPosY ( ) {
		
		return posY ;
	}
	
	public int getKeycode ( ) {
		
		return keycode ;
	}
}

