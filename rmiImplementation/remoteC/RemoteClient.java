package remoteC;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import rminew.ServerInterface;
public class RemoteClient {
    public static void main(String[] args) throws Exception {
        ServerInterface ref;
        ref=(ServerInterface) Naming.lookup("rmi://localhost/tag");
        System.out.println(ref.fact(5));
        

    }
}
