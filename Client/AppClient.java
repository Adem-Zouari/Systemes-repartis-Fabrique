package TP4.Client;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import TP4.Classe.*;
import TP4.Fabrique.*;

public class AppClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1903);
        FabriqueInterface factory = (FabriqueInterface) registry.lookup("Factory");
        AppInterface app = factory.createAppInstance();
        System.out.println(app.Reverse("hello"));
}
}
