import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int[] math1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] math2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] math3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        int index = 0;
        for(int ans : answers){
            if(ans == math1[index % 10]){
                cnt1++;
            }
            if(ans == math2[index % 8]){
                cnt2++;
            }
            if(ans == math3[index % 10]){
                cnt3++;
            }
            index++;
        }

        answer = getTopMath(cnt1, cnt2, cnt3);

        return answer;
    }

    private List<Integer> getTopMath(int cnt1, int cnt2, int cnt3){
        List<Integer> returnArray = new ArrayList<>();
        int maxVal = Math.max(Math.max(cnt1, cnt2), cnt3);

        if(maxVal == cnt1){
            returnArray.add(1);
        }
        if(maxVal == cnt2){
            returnArray.add(2);
        }
        if(maxVal == cnt3){
            returnArray.add(3);
        }            
        return returnArray;
    }
}
