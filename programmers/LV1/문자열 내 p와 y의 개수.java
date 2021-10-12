class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] inputS = s.toCharArray();
        int cnt = 0;
        for(char S : inputS){
            if(S == 'P' || S == 'p'){
                cnt++;
            }else if(S == 'Y' || S == 'y'){
                cnt--;
            }   
        }
        return cnt==0;
    }
}