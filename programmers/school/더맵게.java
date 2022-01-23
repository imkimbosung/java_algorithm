import java.util.*;

public class 더맵게 {
    
    public int solution(int[] scoville, int K){
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int tmpValue : scoville){
            pq.offer(tmpValue);
        }
        int tmp = 0;
        // peak : 우선순위가 가장 높음
        while(pq.peek() < K){
            if(pq.size() < 2){
                return -1;
            }
            answer++;

            tmp = pq.poll() + (pq.poll() * 2);
            pq.offer(tmp);
        }
        return answer;
    }
}
