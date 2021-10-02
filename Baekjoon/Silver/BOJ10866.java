import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ10866 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int val = 0;
		Deque<Integer> dq = new LinkedList<Integer>();
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			case "push_front":
				val = Integer.parseInt(st.nextToken());
				dq.addFirst(val); //dq.push(val)苞 悼老
				break;
			case "push_back":
				val = Integer.parseInt(st.nextToken());
				dq.addLast(val); //dq.add(val)苞 悼老
				break;
			case "pop_front":
				if(dq.size() == 0) {
					bw.write("-1" + "\n");
					break;
				}
				else {
					bw.write(dq.remove() + "\n"); //dq.removeFirst()客 悼老
					break;
				}
			case "pop_back":
				if(dq.size() == 0) {
					bw.write("-1" + "\n");
					break;
				}
				else {
					bw.write(dq.removeLast() + "\n"); //dq.pollLast()客 悼老
					break;
				}
			case "size":
				bw.write(dq.size() + "\n");
				break;
			case "empty":
				if(dq.size() == 0) {
					bw.write("1" + "\n");
					break;
				}
				else {
					bw.write("0" + "\n");
					break;
				}
			case "front":
				if(dq.size() == 0) {
					bw.write("-1" + "\n");
					break;
				}
				else {
					bw.write(dq.peek() + "\n"); 
					break;
				}
			case "back":
				if(dq.size() == 0) {
					bw.write("-1" + "\n");
					break;
				}
				else {
					bw.write(dq.peekLast() + "\n"); 
					break;
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
