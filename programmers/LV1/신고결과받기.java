import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> reportMap = new HashMap<>();
        Map<String, Integer> idMap = new HashMap<>();
        report = Arrays.stream(report).distinct().toArray(String[]::new);
        
        for(String reportVal : report){
            String splitSt = reportVal.split(" ")[1];
            reportMap.put(splitSt, reportMap.getOrDefault(splitSt, 0) + 1);
        }
        
        for(String reportVal : report){
            String reportId = reportVal.split(" ")[1];
            int reportCnt = reportMap.get(reportId);
            
            if(reportCnt >= k){
                String splitSt = reportVal.split(" ")[0];
                idMap.put(splitSt, idMap.getOrDefault(splitSt, 0) + 1);
            }
        }
        
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = idMap.getOrDefault(id_list[i], 0);
        }
        
        
        return answer;
    }
   
}