package rmiS;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;

public class rmiMain{
    public static void main(String[] args) throws RemoteException{
        ServerImpl ser=new ServerImpl();
        Registry re=java.rmi.registry.LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        re.rebind("tag1", ser);
        System.out.println("ServerImpl binded with registry");
    }
}