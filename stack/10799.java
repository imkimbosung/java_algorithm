/*
baekjoon 10799번 
쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 주어졌을 때, 잘려진 쇠막대기 조각의 총 개수를 구하는 프로그램을 작성하시오
    자세한 문제 url : https://www.acmicpc.net/problem/10799
*/
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		
		String inputLine = br.readLine();
		int cnt = 0;
		boolean flag = false;
		for(char str : inputLine.toCharArray()) {
			
			if(str == '(') {
				stack.push(str);
				flag = false;
			}else if(str == ')' && !flag){
				stack.pop(); // 레이저 발사
				flag = true;
				// 레이저를 쏜 후 잘라진 개수
				if(!stack.empty()) {
					cnt = cnt + stack.size();
				}
			}else if(str == ')' && flag){
				stack.pop(); // 레이저 발사
				// 막대기 마감?
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
