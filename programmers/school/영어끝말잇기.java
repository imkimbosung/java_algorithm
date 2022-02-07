/*
95점 받은 코드 .. 나머지 5점을 위해 수정 시작
100점 받은 코드 .. "중복"이라는 단어가 나오면 set자료구조를 떠올리자.
*/
import java.util.*;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        String tmpString = words[0];
        int per = 0;
        int num = 0;
        HashMap<String,Integer> tmpMap = new HashMap<>();
        tmpMap.put(tmpString, 1);
        for(int i = 1 ; i < words.length; i++){
            if(tmpMap.getOrDefault(words[i], -1) == -1 && words[i].charAt(0) == tmpString.charAt(tmpString.length()-1)){
                tmpMap.put(words[i], 1);
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


