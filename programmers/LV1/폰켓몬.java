import java.util.HashMap;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        int maxChoice = nums.length / 2;
        HashMap<String, String> tmpMap = new HashMap<>();
        // 중복은 map으로 풀자
        for(int tmpVal : nums){
            if(answer == maxChoice){
                break;
            }
            // 있으면 T 없으면 F
            if(tmpMap.getOrDefault(tmpVal+"", "F").equals("F")){
                tmpMap.put(tmpVal+"", "T");
                answer++;
            }
        }
        return answer;
    }
}
