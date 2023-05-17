package Lab5;

public class Start {
    public static void main(String[] args) {
        try {
            Student zhangsan = new Student("张三",20,220);
            zhangsan.print();
        } catch (ScoreException ex){
            System.out.println(ex.getMessage()+"t1");
        }
        try{
            Student lisi = new Student("李四",30,120);
            lisi.setScore(230);
        } catch (ScoreException e){
            System.out.println(e.getMessage()+"t2");
        }
    }
}
