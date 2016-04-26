package Connect;

//  ./Client 127.0.0.1 

import java.rmi.* ;
import java.net.MalformedURLException ;

public class Client {
    public static void main(String [] args) {
    try {
    	ServerImpl server =(ServerImpl) Naming.lookup("//"+args[0]+"/ServerImpl");
		System.out.println("Le client recoit : "+server.messageDistant()); 
     }
     catch (NotBoundException re) { System.out.println(re) ; }
     catch (RemoteException re) { System.out.println(re) ; }
     catch (MalformedURLException e) { System.out.println(e) ; }
 }
}

