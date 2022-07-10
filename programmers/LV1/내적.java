public class 내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int arrayLength = a.length;

        for(int i = 0 ; i < arrayLength ; i++){
            answer += a[i]*b[i];
        }

        return answer;
    }
}
