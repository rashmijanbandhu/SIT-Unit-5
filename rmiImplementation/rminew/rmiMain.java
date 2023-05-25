package rminew;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;


public class rmiMain {
    public static void main(String[] args) throws Exception {
        serverImpl ser=new serverImpl();
        Registry re=java.rmi.registry.LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        re.rebind("tag", ser);
        System.out.println("ServerImpl class is binded with registry");
      
        
        
    }
}
