class MyThread31 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("Thread1 running");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
           System.out.println(e);
        }
        i++;
        }
    }
}
class MyThread32 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("Thread1 22 2222 running");
        i++;
        }

    }
}
public class ThreadMethodsSleep {
    public static void main(String[] args) {
        MyThread31 t1=new MyThread31();
        MyThread32 t2=new MyThread32();
        t1.start();
        t2.start();
    }
}
