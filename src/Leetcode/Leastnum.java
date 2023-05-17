package Leetcode;
public class Leastnum {
    public int numlength(int num){
        int len = 0;
        while(num>0){
            ++len;
            num = num/10;
        }
        return len;
    }
    public int solution(int k){
        int num = 1;
        int cnt = 0;
        while(num/k!=0){
            ++cnt;
            num = num*10 + 1;
            if(cnt==10) return -1;
        }
        return num;
    }

}
