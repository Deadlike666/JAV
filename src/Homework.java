public class Homework {
    public static void main(String[] args){
        int rabit = 5,dog = 2,cat = 3;
        int ans = 0;
        //int i,j,k;
        int summoney = 90;
        for(dog = 0;dog <= 45;dog++){
          for(cat = 0;cat <= 30;cat++){
              for(rabit = 0;rabit <= 18;rabit++){
                  if(rabit*5+dog*2+cat*3==summoney){
                      ans++;
                  }
              }
          }
        }
        System.out.println("The ans is :"+ans);
    }
}
