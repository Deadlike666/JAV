import java.util.HashSet;
import java.util.Set;

public class Solution{
    public int small(int k){
        int resid  = 1%k,len = 1;
        Set<Integer> set = new HashSet<Integer>();
        set.add(resid);
        while(resid!=0){
            resid = (resid*10+1)%k;
            ++len;
            if(set.contains(resid)){
                return -1;
            }
        }
        return len;
    }
}