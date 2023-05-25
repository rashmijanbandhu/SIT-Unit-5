package rmiS;
import java.rmi.Remote;
public interface ServerInterface extends Remote{
    public int fact(int a) throws Exception;
}
