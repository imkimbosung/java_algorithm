/*
    s의 문자가 '('와 ')'가 대칭을 이루면 true 아니면 false를 return 하는 문제
*/

import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<Character>();
        for(char inputV : s.toCharArray()){
            if(inputV == '('){
                stack.push(inputV);
            }else if(!stack.isEmpty() && inputV == ')'){
                stack.pop();
            }else{
                return !answer;
            }
        }

        return stack.isEmpty() ? answer : !answer;
    }
}