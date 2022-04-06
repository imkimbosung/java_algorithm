
/**
 * 다른 풀이 생각해보자
 * 
 */

public class Solution {
    
    class Solution {
        public int solution(int n) {
            int answer = 0;
            
            for(int i = 2 ; i < n ; i++){
                if(n % i == 1){
                    return i;
                }
            }
            
            return answer;
        }
    }
}
