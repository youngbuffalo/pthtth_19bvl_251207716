package bai2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TinhTonhImpl extends UnicastRemoteObject
        implements TinhTong {

    public TinhTonhImpl() throws RemoteException {
        super();
    }


    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}