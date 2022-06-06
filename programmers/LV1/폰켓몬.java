import java.util.HashMap;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        int maxChoice = nums.length / 2;
        HashMap<String, String> tmpMap = new HashMap<>();
        
        for(int tmpVal : nums){
            if(answer == maxChoice){
                break;
            }
            if(tmpMap.getOrDefault(tmpVal+"", "F").equals("F")){
                tmpMap.put(tmpVal+"", "T");
                answer++;
            }
        }
        return answer;
    }
}
