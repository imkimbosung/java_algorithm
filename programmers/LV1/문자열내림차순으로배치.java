import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        Integer tmp[] = new Integer[s.length()];
        
        for(int i = 0 ; i < s.length(); i++){
            tmp[i] = Integer.valueOf(s.charAt(i));
        }
        
        // 내림차순, Collections.reverseOrder 
        Arrays.sort(tmp, Collections.reverseOrder());
        
        for(int i : tmp){
            answer += (char)i;
        }
        
        return answer;
    }
}
