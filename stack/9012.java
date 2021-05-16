/*
백준 9012번 문제
괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열
그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 
  한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다.
예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 

입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.   
*/
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(bf.readLine());
		while(t-- > 0) {
			String str = bf.readLine() + "\n";
	        Stack<Character> stack = new Stack<>();
	        
	        for (char ch : str.toCharArray()) {.  // toCharArray / split() 속도 차이가 많이남
	        	// 왼쪽 괄오일 경우 push
	            if (ch == '(') {
	            	stack.push(ch);
	            // 오른쪽 괄호이면서 stack이 빈 상태가 아니면 pop	
	            }else if(ch == ')' && !stack.empty()){
	                stack.pop();
	            }else if(stack.empty() && ch == '\n'){
	            	bw.write("YES");
	            }else {
	            	bw.write("NO");
	            	break;
	            }
	        }
	        bw.write("\n");
		}
		bw.flush();
	}
}