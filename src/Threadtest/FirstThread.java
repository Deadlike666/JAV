package Threadtest;

public class FirstThread extends Thread{
    private String name;//线程的1名字
    public FirstThread(String name){
        super(name);
        System.out.println("The"+name+"has been created!");
    }
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+i);
            Thread.yield();
        }
    }
    public static void main(String[] args){
        FirstThread t1 = new FirstThread("The firstthread");
        FirstThread t2 = new FirstThread("The Secondthread");
        System.out.println("Start t1 t2 thread");
        t1.run();//切换为start
        t2.run();//切换为start
        System.out.println("main方法执行完毕");
    }
}
//通过实现Runnable接口的方法来实现线程
class ThreadTargetClass implements Runnable{
    public void run(){
        System.out.println("RUN!");
    }
}