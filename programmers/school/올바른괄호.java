/*
    s의 문자가 '('와 ')'가 대칭을 이루면 true 아니면 false를 return 하는 문제
*/

import java.util.*;

/*
    Stack과 유사하게 int형 변수를 선언해 counting으로 풀어냄
*/
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        for(char inputV : s.toCharArray()){
            if(inputV == '('){
                count++;
            }else if(count > 0 && inputV == ')'){
                count--;
            }else{
                return !answer;
            }
        }

        return count == 0 ? answer : !answer;
    }
}

/*
Stack을 이용한 풀이
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
*/