import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class BOJ4949 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		
		while(!str.equals(".")) {
			boolean flag = false;
			str = str.replaceAll("[a-z]", "");
			str = str.replaceAll("[A-Z]", "");
			str = str.replaceAll(" ", "");
			char[] c = str.toCharArray();
			
			for(int i = 0; i < c.length; i++) {
				if(c[i] == '(' || c[i] == '[') // ¿©´Â °ýÈ£ÀÌ¸é ½ºÅÃ¿¡ push
				{
					stack.push(c[i]);
				}
				else if(c[i] == ')') // ´Ý´Â ¼Ò°ýÈ£ÀÏ¶§
				{
					if(stack.empty()) {
						flag = true;
						break;
					}
					else if(stack.peek() != '(') {
						flag = true;
						break;
					}
					else {
						stack.pop();
					}
				}
				else if(c[i] == ']') // ´Ý´Â ´ë°ýÈ£ÀÏ¶§
				{
					if(stack.empty()) {
						flag = true;
						break;
					}
					else if(stack.peek() != '[') {
						flag = true;
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			if(flag == false && stack.empty()) {
				sb.append("yes\n");
			}	
			else {
				sb.append("no\n");
			}
			stack.clear();
			str = sc.nextLine();
		}
		System.out.print(sb);
		sc.close();
	}
}