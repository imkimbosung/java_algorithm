/*
baekjoon 17298번 
 크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다. 
 Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.

 예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다. A = [9, 5, 4, 8]인 경우에는
 	 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
*/
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		Scanner input = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();
		
		String inputLine = input.nextLine() + "\n";
		boolean findTag = false;
		for(char str : inputLine.toCharArray()) {
			
			if(str == '<') {
				if(!stack.empty()) {
					while(!stack.empty()) {
						bw.write(stack.pop());
					}
				}
				findTag = true;
				bw.write(str);
			}else if(str == '>'){
				findTag = false;
				bw.write(str);
			}else if(findTag) {
				bw.write(str);
			}else if(str == ' ' || str == '\n') {
				while(!stack.empty()) {
					bw.write(stack.pop());
				}
				bw.write(str);
			}else {
				stack.push(str);
			}
		}
		
		bw.flush();
		
	}
}

