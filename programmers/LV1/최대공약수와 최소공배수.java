/**
 *  유클리드 호제법을 이용하여 풀이(최대공약수) 
 */

public class 최대공약수와 최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2]; 
        answer[0] = getGcd(Math.max(n,m), Math.min(n,m));                    
        answer[1] = getLcm(Math.max(n,m), Math.min(n,m), answer[0]);
        return answer;
    }
    
    // 최대공약수 
    private int getGcd(int max, int min){
        
        if(min == 0){
            return max;
        }
        
        return getGcd(min,  max % min);
    }
    
    // 최소공배수 
    private int getLcm(int max, int min, int gcd){
        return max * min / gcd;
    }
}
