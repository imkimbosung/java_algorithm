/*
notion 정리 : https://polar-wildcat-d36.notion.site/x-n-5563a9b5ebb04f9196126b6e53890bd2
*/

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long cnt = 1;
        for(int i = 0; i < n ; i++){
            answer[i] = x * cnt++;
        }
        return answer;
    }
}