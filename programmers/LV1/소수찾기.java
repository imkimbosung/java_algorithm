public class 소수찾기 {
    /**
     *  1. 번 풀이
     *      N 숫자 절반까지만 체크하는 로직
     *      예) 12면 12/2 = 6 이므로 2~6 까지만 확인해보면 된다.
     */
    public int solution(int n) {
		int answer = 0;
		for(int i = 2 ; i <= n ; i++){
			if(checkPrimeNum(i)){answer++;}
		}
        return answer;
    }
    
    private boolean checkPrimeNum(int n){
		for(int j = 2 ; j <= n/2 ; j++){
			if(n%j == 0){
				return false;
			}
		}
		return true;
	}
}
