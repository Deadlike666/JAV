import java.util.Scanner;

public class lab {
    public static void main(String[] args){
        Ychong yu = new Ychong();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the food");
        String food = sc.nextLine();
        yu.Eat(food);
    }
}
class Ychong{
    private double weight,height;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double Weight){
        this.weight = Weight;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getWeight(){
        return weight;
    }
    private String food;
    public void Eat(String food){
        System.out.println("YuChong eat "+food);
    }
}