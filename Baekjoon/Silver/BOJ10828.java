import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;

public class BOJ10828 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Stack stack = new Stack();
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			case "push" :
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop" :
				if(stack.size() == 0) {
					bw.write("-1" + "\n");
					break;
				}
				else {
					bw.write(stack.pop() + "\n");
					break;
				}
			case "size" :
				bw.write(stack.size() + "\n");
				break;
			case "empty":
				if(stack.empty()) {
					bw.write("1" + "\n");
					break;
				}
				else {
					bw.write("0" + "\n");
					break;
				}
			case "top" :
				if(stack.size() == 0) {
					bw.write("-1" + "\n");
					break;
				}
				else {
					bw.write(stack.peek() + "\n");
					break;
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
