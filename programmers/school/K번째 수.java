import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length ; i++){
            // 자르고
            List<Integer> tmpList = getCuttingList(array, commands[i][0], commands[i][1]);
            // 정렬하고
            Collections.sort(tmpList);
            // 해당 숫자 뽑고
            answer[i] = tmpList.get(commands[i][2]-1);
        }
        
        return answer;
    }
    
    private List<Integer> getCuttingList(int[] getArray, int start, int end){
        List<Integer> cuttingList = new ArrayList<>();
        
        for(int i = start; i <= end; i++){
            cuttingList.add(getArray[i-1]);
        }
        
        return cuttingList;
    }
}
