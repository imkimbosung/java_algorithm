public class 문자열 내 마음대로 정렬하기 {
    public String[] solution(String[] strings, int n) {

        for(int i = 0 ; i < strings.length-1 ; i++){
            String tmp = "";
            for(int j = i +1 ; j < strings.length; j++){
                if(strings[i].charAt(n) > strings[j].charAt(n)){
                    tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
                
                // 해당 인덱스 값이 같을 때
                if(strings[i].charAt(n) == strings[j].charAt(n) && strings[i].compareTo(strings[j]) > 0){
                    tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
            }
        }
        
        return strings;
    }
}
