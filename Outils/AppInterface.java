package Outils;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AppInterface extends Remote {
    String reverseString(String input) throws RemoteException;
}
