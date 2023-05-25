import java.net.*;  
public class DatagramSender{  
  public static void main(String[] args) throws Exception {  
    DatagramSocket ds = new DatagramSocket();  
    
    InetAddress ip = InetAddress.getByName("127.0.0.1");  
    String str = "hey i am a packet";   
    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 777);  
    ds.send(dp);  
    ds.close();  
  }  
}  