package InnerClass;

public class Try {
    private static String country = "Chinese";
    private String name;
    public Try(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Try t1 = new Try("Alice");
        System.out.println(t1.name);
        System.out.println(country);
    }
}
