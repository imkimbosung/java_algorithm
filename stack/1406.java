/*
baekjoon 1406번 문제

https://www.acmicpc.net/problem/1406
문제가 길어서 url 첨부
*/
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> left_stack = new Stack<>();
		Stack<Character> right_stack = new Stack<>();
		String stringLine = bf.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		// 초기 셋팅 커서가 맨오른쪽
		for(char str : stringLine.toCharArray()) {
			left_stack.push(str);
		}
		
		int t = Integer.parseInt(bf.readLine());
		
		while(t-- > 0) {
			String input = bf.readLine();
	        
	        // 왼쪽으로 한칸 이동
	        if(input.indexOf("L") >= 0 && !left_stack.empty()) {
	        	right_stack.push(left_stack.pop());
        	// 오른쪽으로 한칸 이동
	        }else if(input.indexOf("D") >= 0 && !right_stack.empty()) {
	        	left_stack.push(right_stack.pop());
	        // 커서 왼쪽 문자 삭제	
	        }else if(input.indexOf("B") >= 0 && !left_stack.empty()) {
	        	left_stack.pop();
	        // 문자 커서 왼쪽에 추가	
	        }else if(input.indexOf("P") >= 0) {
	        	left_stack.push(input.charAt(2));
	        }
	       
		}
		
		while(!left_stack.empty()) {
			right_stack.push(left_stack.pop());
		}
		
		while(!right_stack.empty()) {
			sb.append(right_stack.pop());
		}
		
		System.out.println(sb);
		
	}
}

