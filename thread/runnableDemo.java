

class MythreadRunnable implements Runnable{
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("My thread runnable 1");
        i++;
        }
        
    }
}
class MythreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("My thread runnable 2222222");
        i++;
        }
        
    }
}
public class runnableDemo {
    public static void main(String[] args) {
        MythreadRunnable tr1=new MythreadRunnable();
        Thread th1=new Thread(tr1);

        MythreadRunnable2 tr2=new MythreadRunnable2();
        Thread th2=new Thread(tr2);

        th1.start();
        th2.start();
    }
}
