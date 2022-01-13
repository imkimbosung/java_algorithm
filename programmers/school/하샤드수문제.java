/*
    하샤드수 문제 : int형을 다른 type으로 형변환 하지 않고 푸는 풀이
*/

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int tmp = x;
        while( tmp > 0){
            sum += tmp%10;
            tmp = tmp/10;
        }

        return x % sum == 0;
    }
}
