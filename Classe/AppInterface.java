package TP4.Classe;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AppInterface extends Remote {
    // Définissez les méthodes que le client peut appeler à distance
  public String  Reverse(String Str) throws RemoteException;
}
