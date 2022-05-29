
import java.util.*;

public class enum 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int db : d){
            if(budget - db >= 0){
                answer++;
                budget = budget - db;
            }
        }
        
        return answer;
    }
}
