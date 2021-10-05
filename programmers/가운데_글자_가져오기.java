class Solution {
    public String solution(String s) {
        String answer = "";
        int sLength = s.length()/2;

        char[] str = s.toCharArray();
        if(s.length()%2==0){
            answer = str[sLength-1] + "" + str[sLength];
        }else{
           answer = str[sLength] + "";
        }
        return answer;
    }
}