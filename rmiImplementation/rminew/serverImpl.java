package rminew;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class serverImpl extends UnicastRemoteObject implements ServerInterface {
    public serverImpl() throws RemoteException{
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
