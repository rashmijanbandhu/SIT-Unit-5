
class MyThread21 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("Thread1 running");
        i++;
        }
    }
}
class MyThread22 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("Thread1 22 2222 running");
        i++;
        }

    }
}



public class ThreadMethodsJoin2 {
    public static void main(String[] args) {
        MyThread21 t1=new MyThread21();
        MyThread22 t2=new MyThread22();
       
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
        t2.start();
        

    }
}
