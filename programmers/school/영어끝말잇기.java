/*
95점 받은 코드 .. 나머지 5점을 위해 수정 시작
*/

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        String tmpString = words[0];
        int per = 0;
        int num = 0;
        for(int i = 1 ; i < words.length; i++){
            if(tmpString.indexOf(words[i]) < 0 
                && tmpString.charAt(tmpString.length()-1) == words[i].charAt(0)){
                tmpString += " " + words[i];
                continue;
            }
            per = (i%n) + 1;
            num = (i/n) + 1;
            break;
        }
        
        return new int[] {per, num};
    }
}
