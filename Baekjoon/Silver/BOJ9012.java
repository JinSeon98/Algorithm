import java.util.Scanner;
import java.util.Stack;

public class BOJ9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < T; i++) {
			String s = sc.nextLine();
			char c[] = s.toCharArray();
			
			for(int j = 0; j < c.length; j++) {
				if(c[j] == '(') {
					stack.push("(");
				}
				else {
					if(stack.empty()) {
						sb.append("NO");
						sb.append("\n");
						break;
					}
					else if(!stack.empty()) {
						stack.pop();
						if(stack.empty() && j == c.length-1) {
							sb.append("YES");
							sb.append("\n");
						}
					}
				}
			}
			if(!stack.empty()) {
				sb.append("NO");
				sb.append("\n");
			}
			stack.clear();
		}
		System.out.println(sb);

	}

}
