class MyThread11 extends Thread{
    public void run(){
        System.out.println("Thread1 running");
    }
}
class MyThread12 extends Thread{
    public void run(){
        System.out.println("Thread1 22 2222 running");
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        MyThread11 t1=new MyThread11();
        MyThread12 t2=new MyThread12();
        t1.setName("thread1");
        System.out.println(t1.getName());
        t1.start();
        t2.start();
    }
}
