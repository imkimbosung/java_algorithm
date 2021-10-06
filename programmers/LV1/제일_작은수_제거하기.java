class Solution {
    public int[] solution(int[] arr) {
        int arrLength = arr.length; 
        int[] answer = new int[arrLength-1];
        
        if(arrLength == 1){
            return new int[]{-1};    
        }else{
            int min = arr[0];
            for(int i=1; i < arrLength; i++){
                min = Math.min(min, arr[i]);
            }
            
            int p = 0;
            for(int i=0; i < arrLength; i++){
                if(min == arr[i]){continue;}
                answer[p++] = arr[i];
            }
            
            return answer;
        }
        
        
    }
}