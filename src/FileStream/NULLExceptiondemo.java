package FileStream;

public class NULLExceptiondemo {
    Bike bike = new Bike()
            ;
    public void dirveBike(){
        bike.run();
    }
    public static void main(String[] args){
        try {
            NULLExceptiondemo demo = new NULLExceptiondemo();
            demo.dirveBike();
            System.out.println("Successful1!");
        } catch (NullPointerException E){
            System.out.println("Error!"+E.getMessage());
        }
        System.out.println("runing over");
    }
}
class Bike{
    public void run(){
        System.out.println("running!");
    }
}
