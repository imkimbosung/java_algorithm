/*
백준 1874번 문제
스택 (stack)은 기본적인 자료구조

1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 
    이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 임의의 수열이 주어졌을 때 스택을 이용해 
    그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 
    이를 계산하는 프로그램을 작성하라.
*/
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int t = Integer.parseInt(bf.readLine());
		int i = 1;
		
		StringBuilder sb = new StringBuilder();
		while(t-- > 0) {
			int inputInt = Integer.parseInt(bf.readLine());
	        
	        if(stack.empty() || stack.peek() < inputInt) {
	        	for(;i<= inputInt; i++) {
	        		stack.push(i);
	        		sb.append("+\n");
	        	}
	        	stack.pop();
	        	sb.append("-\n");
	        }else if(stack.peek() == inputInt) {
	        	stack.pop();
	        	sb.append("-\n");
	        }else {
	        	System.out.println("NO");
	        	break;
	        }
	        
	        if(t == 0) {
	        	System.out.println(sb);
	        }
	       
		}
	}
}

