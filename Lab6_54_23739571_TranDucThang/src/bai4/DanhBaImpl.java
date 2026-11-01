
package bai4;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class DanhBaImpl extends UnicastRemoteObject
        implements DanhBa {

    private HashMap<String, String> contacts;

    public DanhBaImpl() throws RemoteException {
        super();
        contacts = new HashMap<String, String>();
    }

   
    public synchronized void addContact(String name, String phone)
            throws RemoteException {
        contacts.put(name, phone);
    }


    public synchronized String findContact(String name)
            throws RemoteException {
        return contacts.get(name);
    }

    
    public synchronized boolean deleteContact(String name)
            throws RemoteException {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            return true;
        }
        return false;
    }

   
    public synchronized boolean updateContact(String name, String newPhone)
            throws RemoteException {
        if (contacts.containsKey(name)) {
            contacts.put(name, newPhone);
            return true;
        }
        return false;
    }
}