import java.io.*;    
import java.net.*;    
public class URLConDemo {    
public static void main(String[] args){    
try{    
URL url=new URL("https://docs.oracle.com/en/database/oracle/oracle-database/19/jjdbc/data-sources-and-URLs.html");    
URLConnection urlcon=url.openConnection();    
InputStream stream=urlcon.getInputStream();    
int i;    
while((i=stream.read())!=-1){    
System.out.print((char)i);    
}    
}catch(Exception e){System.out.println(e);}    
}    
} 