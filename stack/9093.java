/*
백준 9093번 문제
문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 
 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
*/
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		Scanner input = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> stack = new Stack<String>();
		
		int testSize = input.nextInt();
		input.nextLine();
		for(int i = 0; i < testSize ; i++) {
			String inputText = input.nextLine();
			for(int j = 0; j <= inputText.length(); j++) {
				if(j == inputText.length() || inputText.charAt(j) == ' ') {
					while(!stack.empty()) {
						bw.write(stack.pop());
					}
					bw.write(" ");
				}else {
					stack.push(Character.toString(inputText.charAt(j)));
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
	}
}