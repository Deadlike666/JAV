package Work;

public class Worker {
    private String name;
    private double wage;
    public void increase(double money){
        this.wage += money;
    }
    public void increase(){
        this.wage += 300;
    }
    public void changeName(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("name:"+this.name+"wage:"+this.wage);
    }
    public Worker(String name,double wage){
        this.wage = wage;
        this.name = name;
    }
}
class Manager extends Worker{
    private double wage;
    private double allowance;
    public Manager(String name,double wage,double allowance){
        super(name,wage);
        this.allowance = allowance;
    }
    public void increase(double wage){
        this.allowance += 300;
    }
}
