package bai1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject
        implements HelloInterface {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public HelloImpl() throws RemoteException {
        super();
    }

    
    public String sayHello() throws RemoteException {
        return "Hello, World!";
    }
}