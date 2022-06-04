/**
 * 75점.... ㅠ 다시 풀어볼 것
 */

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        
        int maxChoice = nums.length / 2;
        String checkString = "";
        for(int tmpVal : nums){
            
            if(answer >= maxChoice){
                break;
            }
            
            if(checkString.indexOf(String.valueOf(tmpVal)) < 0){
                checkString += tmpVal + " ";
                answer++;
            }
            
        }
        return answer;
    }
}
