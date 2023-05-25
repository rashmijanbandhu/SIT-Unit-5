package rmiC;
import java.rmi.Naming;
//import java.rmi.NotBoundException;

import rmiS.ServerInterface;

public class remoteClient {
    public static void main(String[] args) throws Exception{
        ServerInterface ref;

        ref=(ServerInterface) Naming.lookup("rmi://localhost/tag1");
        System.out.println(ref.fact(5));
    }
}
