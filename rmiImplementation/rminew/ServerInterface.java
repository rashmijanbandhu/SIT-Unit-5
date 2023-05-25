package rminew;
import java.rmi.Remote;
public interface ServerInterface extends Remote{
    public int fact(int i) throws Exception;
} 
