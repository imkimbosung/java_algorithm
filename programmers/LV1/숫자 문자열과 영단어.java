public class 숫자 문자열과 영단어 {
    public int solution(String s) {
        int answer = 0;
        
        String alphabetArray[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0 ; i < 10 ; i++){
            s = s.replaceAll(alphabetArray[i], String.valueOf(i));
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
