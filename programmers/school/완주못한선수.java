import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String value : participant){
            map.put(value, map.getOrDefault(value, 0)+1);
        }
        
        for(String value : completion){
            map.put(value, map.get(value)-1);
        }
        
        for(String keyValue : map.keySet()){
            if(map.get(keyValue) != 0){
                answer = keyValue; 
                break;  
            } 
        }
        
        return answer;
    }
}