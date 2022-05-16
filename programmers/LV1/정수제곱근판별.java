public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = getSquareDistincVal(n);
        
        if(answer > 0){
            answer = calSquarePlus(answer);
        }
        return answer;
    }
    
    /**
     * 제곱근인지 판별(제곱근이 아니면 -1)
     */
    private long getSquareDistincVal(long val){
        long returnVal = -1;

        Double sqrt = Math.sqrt(val);
        if(sqrt == sqrt.intValue()){
            returnVal = sqrt.longValue();
        }

        return returnVal;
    }
    
    /**
     * 제곱근이면 +1 해서 제곱 계산
     */
    private long calSquarePlus(long val){
        return (long)Math.pow(val + 1, 2);
    }
}
