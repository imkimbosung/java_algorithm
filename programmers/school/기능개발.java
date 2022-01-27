/**
 * 배포 되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 : progresses
 * 각 작업 개발 속도 가 담긴 정수 배열 : speeds
 *  배포는 하루에 한번, 하루에 같이 배포되는 기능의 수를 구하여라
 */

import java.util.*;

public class 기능개발 {
    
    public int[] solution(int[] progresses, int[] speeds){
        int[] dateArray = new int[progresses.length];
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < progresses.length ; i++){
            // 남은 날짜 계산
            dateArray[i] = getDeployDate(progresses[i], speeds[i]);
        }

        int count = 1;
        int std = dateArray[0];
        for(int i = 1 ; i < dateArray.length; i++) {

            if (std < dateArray[i]) {
                answer.add(count);
                count = 1;
                std = dateArray[i];
            } else {
                count++;
            }

            if (i == dateArray.length - 1) {
                answer.add(count);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }

    private int getDeployDate(int pro, int speed){
        int rePro = 100 - pro;
        return rePro % speed > 0 ? rePro / speed + 1 : rePro / speed;
    }
}
