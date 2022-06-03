import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String tmp = "";
        
        int length = String.valueOf(n).length();
        Long[] longTmp = new Long[length];
        
        for(int i = 0 ; i < length ; i++){
            longTmp[i] = n%10;
            n = n/10;
        }
        
        Arrays.sort(longTmp, Collections.reverseOrder());
        
        for(long t : longTmp){
            tmp += t;
        }
        
        return Long.parseLong(tmp);
    }
}
