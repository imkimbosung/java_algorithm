/*
  이진 수가 나오면 비트 연산을 꼭 생각하자.
  이진수로 변환하는 함수 Integer.toBinaryString()를 사용
*/

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];
        
      for(int i = 0 ; i < n ; i++){
          answer[i] = getMapValue(Integer.toBinaryString(arr1[i] | arr2[i]), n);
      }
        
      return answer;
    }
    
    private String getMapValue(String input, int n){
		  String result = "";
      input = String.format("%" +n+ "s", input );
      for(char c : input.toCharArray()){
			  result = result + (c == '1' ? "#" : " ");
		  }
        
      return result;
    }
}
