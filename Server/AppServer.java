package TP4.Server;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import TP4.Fabrique.*;

public class AppServer {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1903);
        FabriqueInterface factory = new FabImpl();
        registry.rebind("Factory", factory);
        System.out.println("Serveur prêt.");
    }
}

