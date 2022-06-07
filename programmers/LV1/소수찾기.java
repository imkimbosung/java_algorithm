public class 소수찾기 {
    
    public int solution(int n) {
		int answer = 0;
		for(int i = 2 ; i <= n ; i++){
			if(checkPrimeNum2(i)){answer++;}
		}
        return answer;
    }
    
    /**
     *  1. 번 풀이
     *      N 숫자 절반까지만 체크하는 로직
     *      예) 12면 12/2 = 6 이므로 2~6 까지만 확인해보면 된다.
     */
    private boolean checkPrimeNum1(int n){
		for(int j = 2 ; j <= n/2 ; j++){
			if(n%j == 0){
				return false;
			}
		}
		return true;
	}

    /**
     *  2. 번 풀이
     *      소수는 결론적으로 특정N값의 약수값들이 1과 자기 자신을 제외하면 없어야 한다. 그 중앙값인 루트 N으로 비교해보면 된다. 
     *      예) 12면 루트12 이므로 2~3.5 까지만(자연수만 비교하므로 3까지) 확인해보면 된다. 
     */
    private boolean checkPrimeNum2(int n){
		for(int j = 2 ; j*j <= n; j++){
			if(n%j == 0){
				return false;
			}
		}
		return true;
	}
    
}
