
/**
 * 틀린 부분이 많아 다시 풀어봐야함
 * 
 */

public class Solution {
    
class solution {
    public int solution(int n) {
        int answer = 0;
        double tmp = Math.sqrt(n-1);
        
        if(tmp == (int)tmp){
            answer = (int)tmp;    
        }else{
            answer = n-1;
        }
        
        return answer;
    }
}
}
