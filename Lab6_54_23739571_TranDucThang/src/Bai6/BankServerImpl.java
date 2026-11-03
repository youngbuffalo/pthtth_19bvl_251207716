package Bai6;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BankServerImpl extends UnicastRemoteObject implements BankInterface {
    private double balance;

    public BankServerImpl(double initialBalance) throws RemoteException {
        super();
        balance = initialBalance;
    }

   
    public synchronized double getBalance() throws RemoteException {
        return balance;
    }

   
    public synchronized void deposit(double amount) throws RemoteException {
        if (amount <= 0) {
            throw new RemoteException("So tien gui phai lon hon 0.");
        }
        balance += amount;
    }

  
    public synchronized boolean withdraw(double amount) throws RemoteException {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
