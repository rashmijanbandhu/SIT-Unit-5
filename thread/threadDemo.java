
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("Thread1 running");
        i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("Thread1 22 2222 running");
        i++;
        }

    }
}


public class threadDemo{
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
       
    
        t1.start();
        t2.start();
        

    }
}