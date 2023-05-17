package Lab5;

public class Student {
    private String Name;
    private int Age;
    private double Score;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) throws ScoreException{
        if(score>200||score<0) throw new ScoreException();
        this.Score = score;
    }
    public void print(){
        System.out.println("Name:"+this.Name+"Age:"+this.Age+"Score:"+this.Score);
    }
    public Student(String name,int age,double score) throws ScoreException{
        if(score>200||score<0){
            throw new ScoreException();
        }
        this.Name = name;
        this.Age = age;
        this.Score = score;
    }

}
