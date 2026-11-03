package Bai5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatServerImpl extends UnicastRemoteObject implements ChatInterface {
    private String response = "";

    public ChatServerImpl() throws RemoteException {
        super();
    }

   
    public synchronized void sendMessage(String message) throws RemoteException {
        System.out.println("Client: " + message);
        response = "Server : " + message;
    }

    
    public synchronized String getResponse() throws RemoteException {
        return response;
    }
}
