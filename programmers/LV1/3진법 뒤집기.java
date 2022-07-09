public class 3진법 뒤집기 {
    public int solution(int n) {
        int x = 0;
        int y = 0;
        if(n == 1){
            return 1;
        }
        String calResult = "";
        
        while(true){
            x = n/3;
            y = n%3;
            if(x < 3){
                calResult += y + "" + x;
                break;
            }
            calResult += y + "";
            n = x;
        }
        
        int length = calResult.length();
        int result = 0;
        int j = 0;
        for(int i = length-1 ; i >= 0 ; i--){
            result = (int) (result + (Character.getNumericValue(calResult.charAt(i)) * Math.pow(3, j++)));
        }
        return result;
    }
}
