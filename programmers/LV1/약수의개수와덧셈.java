public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left ; i <= right; i++){
            int returnInt = getDivisor(i);
            answer += returnInt % 2 == 0 ? i : i * -1;
        }
        return answer;
    }
    
    /**
     * 
     * @param inValue
     * @return int
     * 
     * 약수는 (a<=b) a * b 로 나타낼 수 있다. 이 때 a=b 가 같다면 그 수는 약수가 홀수가 된다.
     * 그래서 약수가 홀수가 되는 경우에만 +1을 한 로직이다.
     */
    private int getDivisor(int inValue){
        int cntDvs = 0;
        for(int i = 1 ; i*i <= inValue ; i++ ){
            if(inValue == i*i){cntDvs++;}
        }
        return cntDvs;
    }
}
