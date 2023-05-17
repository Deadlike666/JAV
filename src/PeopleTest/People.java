package PeopleTest;

public class People {
    public static int Peoplenum = 0;
    public int age;
    public double weight ,height;
    public People(int age,double weight,double height){
        this.age = age;
        this.height = height;
        this.weight = weight;
        Peoplenum++;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
}

