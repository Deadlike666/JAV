public class MakeArray {
    public static void  main(String[] args){
        int[][] arr = {{1,2,3,4,5,6,7,8,9,10},{1,2,3},{4,5,6,7}};
        int i,j;//静态初始化数组
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.println(arr);
            }
        }
        //动态构造数组
        //列数确定1
        int[][] A = new int[2][3];
        //列数确定2
        int[][] B;//先声明一个二维数组
        B = new int[3][2];//分配内存
        //列数不确定
        int[][] C = new int[3][];
        C[0] = new int[5];
        C[1] = new int[6];
        C[2] = new int[7];
    }
}
