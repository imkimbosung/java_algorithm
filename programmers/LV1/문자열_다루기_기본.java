/*
정리 notion : https://polar-wildcat-d36.notion.site/6ef24ad189f64dc4a4af66a14180d790
*/
class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6){
            try{
                    Integer.parseInt(s) ;
                    answer = true ;
                }
            catch(NumberFormatException e){}
        }
        return answer;
    }
}