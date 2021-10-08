class Solution {
    public int[] solution(long n) {
       
        char[] tmp = String.valueOf(n).toCharArray();
        int[] answer = new int[tmp.length];
        int x = 0;
        for(int i = tmp.length-1 ; i > -1 ; i--){
            answer[x++] = Character.getNumericValue(tmp[i]);
        }
        return answer;
    }
}