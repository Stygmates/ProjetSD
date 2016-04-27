package Connect;

//  ./Client 127.0.0.1 

import java.rmi.* ;
import java.net.MalformedURLException ;

public class Client {
    public static void main(String [] args) {
    try {
    	ServerInterface server =(ServerInterface) Naming.lookup("//127.0.0.1/ServerImpl");
		System.out.println("Le client recoit : "+server.messageDistant()); 
     }
     catch (NotBoundException re) { System.out.println(re) ; }
     catch (RemoteException re) { System.out.println(re) ; }
     catch (MalformedURLException e) { System.out.println(e) ; }
 }
}

