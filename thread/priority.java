class priorityDemo extends Thread{
    public priorityDemo(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<400){
        System.out.println("executing :  "+this.getName());
        i++;
        }
    }
}
public class priority {
 public static void main(String[] args) {
    priorityDemo p1=new priorityDemo("thread 1");
    priorityDemo p2=new priorityDemo("thread 2");
    priorityDemo p3=new priorityDemo("thread 3");
    priorityDemo p4=new priorityDemo("thread 4   my important thread");
    p4.setPriority(Thread.MAX_PRIORITY);
    p1.start();
    p2.start();
    p3.start();
    p4.start();
}   
}
