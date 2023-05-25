package rmiS;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class ServerImpl extends UnicastRemoteObject implements ServerInterface {
   
    public ServerImpl() throws RemoteException{
        super();
    }
    public int fact(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
}
