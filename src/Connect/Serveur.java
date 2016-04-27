package Connect;

import java.awt.AWTException;

//  ./Serveur

import java.net.* ;
import java.rmi.* ;
public class Serveur {
   public static void main(String [] args) throws AWTException {
       try {
		     
    	   ServerImpl objLocal = new ServerImpl();
    	   Naming.rebind("rmi://localhost:1099/ServerImpl",objLocal) ;
    	   System.out.println("Serveur pret"); 
       }
    catch (RemoteException re) { System.out.println(re) ; }
    catch (MalformedURLException e) { System.out.println(e) ; }
  }
}

