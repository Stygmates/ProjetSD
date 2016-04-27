package Connect;

import java.awt.AWTException;

//  ./Serveur

import java.net.* ;
import java.rmi.* ;
import java.rmi.registry.LocateRegistry;
public class Serveur {
   public static void main(String [] args) throws AWTException {
       try {
    	   LocateRegistry.createRegistry(1099);
    	   ServerImpl objLocal = new ServerImpl();
    	   Naming.rebind("rmi://localhost:1099/ServerInterface",objLocal) ;
    	   System.out.println("Serveur pret"); 
       }
    catch (RemoteException re) { System.out.println(re) ; }
    catch (MalformedURLException e) { System.out.println(e) ; }
  }
}

