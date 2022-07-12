import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> reportCntMap = new HashMap<>();
        Map<String, String> reportUsrMap = new HashMap<>();
        
        String checkValue = "";
        
        for(String reportValue : report){
            
            // 한 유저가 같은 유저를 2회 이상 신고하지 못하도록 검증 로직
            if(checkValue.indexOf(reportValue) < 0){
                String key = reportValue.split(" ")[0];
                String value = reportValue.split(" ")[1];
                // 유저가 리폿 당한 횟수
                reportCntMap.put(value, reportCntMap.getOrDefault(value, 0)+1);
                // 신고한 유저    
                reportUsrMap.put(value, reportUsrMap.getOrDefault(value, "")+key);
                
                checkValue += reportValue + " ";
            }
        }
        
        Map<String, Integer> finalCntMap = getReportCntMap(id_list, reportCntMap, reportUsrMap, k);
        
        
        for(int i = 0 ; i < id_list.length ; i++){
           answer[i] = finalCntMap.getOrDefault(id_list[i], 0);
        }
        
        
        return answer;
    }
    
    private Map<String, Integer> getReportCntMap(String[] id_list, Map<String, Integer> reportCntMap, Map<String, String> reportUsrMap, int k){
        Map<String, Integer> returnCntMap = new HashMap<>();
        
        for(String tmpUsr : id_list){
            if(reportCntMap.getOrDefault(tmpUsr, 0) >= k){
                for(String findUsr : id_list){
                    int reportCnt = returnCntMap.getOrDefault(findUsr, 0);
                    reportCnt = reportUsrMap.get(tmpUsr).indexOf(findUsr) >= 0 ? ++reportCnt : reportCnt;
                    returnCntMap.put(findUsr, reportCnt);
                }
            }
        }
        
        return returnCntMap;
    }
}