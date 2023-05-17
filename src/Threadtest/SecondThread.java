package Threadtest;

public class SecondThread implements Runnable{
    private String name;
    public SecondThread(String name){
        this.name = name;
        System.out.println(name+"创建成功");
    }
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(name+"第"+i+"此运行");
            Thread.yield();//当前线程让出CPU
        }
    }
    public static void main(String[] args){
        SecondThread r1 = new SecondThread("first thread");
        SecondThread r2 = new SecondThread("second thread");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        System.out.println("Start runing thread t1,t2");
        t1.start();
        t2.start();//st
    }
}
