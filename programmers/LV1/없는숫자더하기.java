/**
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return하세요
 */


public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int result = 45;
        for(int tmp : numbers){
            result -= tmp;
        }
        return result;
    }
}
