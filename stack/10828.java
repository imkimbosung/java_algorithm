/*
백준 10828번 문제
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/ 
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		Scanner input = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = input.nextInt();

		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < size; i++) {
			String tmp = input.next();

			if(tmp.indexOf("push")>=0) {
				stack.push(Integer.parseInt(input.next()));
			}else if(tmp.indexOf("pop")>=0) {
				bw.write((stack.empty() == true ? -1 : stack.pop())+"\n");
			}else if(tmp.indexOf("size")>=0) {
				bw.write(stack.size()+"\n");
			}else if(tmp.indexOf("empty")>=0) {
				bw.write((stack.empty() == true ? 1 : 0)+"\n");
			}else if(tmp.indexOf("top")>=0) {
				bw.write((stack.empty() == true ? -1 : stack.peek())+"\n");
			}
		}
		
		bw.flush();
	}
}