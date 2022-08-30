public class 신규 아이디 추천 {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z|0-9|\\-|_|.]","");
        answer = answer.replaceAll("[!|@|#|*]","");
        answer = answer.replaceAll("[.]{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$","");
        answer = "".equals(answer)  ? "a" : answer;
        answer = answer.substring(0, answer.length() > 15 ? 15 : answer.length()).replaceAll("[.]$", "");
        
        if(answer.length() <= 2){
            while(answer.length() < 3){
                answer += answer.substring(answer.length()-1);
            }
        }
        
        return answer;
    }
