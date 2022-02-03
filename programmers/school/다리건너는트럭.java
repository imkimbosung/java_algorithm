

import java.util.*;

public class 다리건너는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 초를 세는 변수
        int checkWeight = 0;
        Queue<Integer> bridgeQu = new LinkedList<>();
        int i = 0;
        while(i < truck_weights.length){
            answer++;

            // 큐 들어갈 수 있는 개수 제한(다리 길이)
            if(bridgeQu.size() == bridge_length){
                // 다리가 꽉차면 1개 빼고, 다시 1개 넣는다.
                checkWeight -= bridgeQu.poll();
            }
            // 무게 제한
            // 1. 작으면 offer
            if((checkWeight + truck_weights[i]) <= weight){
                checkWeight += truck_weights[i];
                bridgeQu.offer(truck_weights[i++]); // 입력 후 1 증가
            }else{
                // 무게보다 크면 쓰레기값 0 입력
                bridgeQu.offer(0);
            }
        }
        // 마지막 에 들어가고 끝나서 남은 개수만큼(다리길이) 더해주면 끝
        answer += bridge_length;
        return answer;
    }   
}
