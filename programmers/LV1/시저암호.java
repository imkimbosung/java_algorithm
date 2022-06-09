public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        for(char tmp : s.toCharArray()){
            answer += getNextChar(tmp+0, n);
        }
        return answer;
    }
    
    // 65 ~ 90 A ~ Z
    // 97 ~ 122 a ~ z
    private String getNextChar(int inASCII, int nextIdx){
        String result = "";
        
        if(inASCII == 32){
            result = " ";
        }else{
            if(inASCII > 90){
                // 소문자
                inASCII += nextIdx;
                inASCII = inASCII > 122 ? inASCII - 26 : inASCII;
            }else{
                // 대문자
                inASCII += nextIdx;
                inASCII = inASCII > 90 ? inASCII - 26 : inASCII;
            }
            result = Character.toString((char)inASCII);
        }
        return result;
    }
}
