import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        List<Integer> lostArr = new ArrayList<>();
        List<Integer> reserveArr = new ArrayList<>();
        
        for(Integer l : lost){lostArr.add(l);}
        for(Integer r : reserve){reserveArr.add(r);}
        
        // 1. 여분이 있으면서 
        for(Integer lo : lostArr){
            for(Integer re : reserveArr){
                if(lo == re){
                    answer++;
                    lostArr.set(lostArr.indexOf(lo), -1);
                    reserveArr.set(reserveArr.indexOf(re), -1);
                    break;
                }
            }
        }
        
        Collections.sort(lostArr);
        Collections.sort(reserveArr);
        
        // 2. 도난만 당함
        for(Integer lo : lostArr){
            if(lo == -1) continue;
            for(Integer re : reserveArr){
                if(lo == (re - 1) || lo == (re + 1)){
                   answer++;
                   reserveArr.set(reserveArr.indexOf(re), -1);
                   break;
               }
            }
        }
        
        return answer;
    }
}
