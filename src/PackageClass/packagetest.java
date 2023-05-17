package PackageClass;

public class packagetest {
    //JAVA中的数据类型可以分为基本数据类型和引用数据类型，基本数据类型的数据不是对象，
    public static void main(String[] args){
        Double hh = new Double(4545);
        System.out.println(hh.toString());
        String str = new String("1234");
        Integer in = new Integer(123);
        Integer sec = new Integer(str);
        System.out.println("The firstdata:"+in);
        System.out.println("The secondData"+sec);
        //装箱和拆箱
        Integer T = 100;//自动装箱数值转化为类
        int k = T;//自动拆箱，类转化为数值
        System.out.println(T+k);
    }

}
