
/**
 *  부족한 금액 계산하기 에서 중점적으로 봐야할 부분은 타입이다. 금액의 범위가 최대 1,000,000,000 이기 때문에 계속 곱하면 int의 범위를 넘어선다. 주의! 
 */

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        return calMoney(price, money, count);
    }
    
    private long calMoney(int price, int money, int count){
        long cntM = 0;
        
        for(int i = 1; i <= count; i++){
            cntM += (price * i);
        }
        
        return cntM > money ? cntM - money : 0;
    }
}
