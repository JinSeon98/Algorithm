import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class BOJ10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int val = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			case "push":
				val = Integer.parseInt(st.nextToken());
				q.add(val);
				break;
			case "pop":
				if(q.size() == 0) {
					bw.write("-1" + "\n");
					break;
				}
				else {
					bw.write(q.poll() + "\n"); //정수를 꺼냄
					break;
				}
			case "empty":
				if(q.size() == 0) {
					bw.write("1" + "\n");
					break;
				}
				else {
					bw.write("0" + "\n");
					break;
				}
			case "size":
				bw.write(q.size() + "\n");
				break;
			case "front":
				if(q.size() == 0) {
					bw.write("-1" + "\n");
					break;
				}
				else {
					bw.write(q.peek() + "\n"); //정수를 꺼내지 않고 확인만
					break;
				}
			case "back":
				if(q.size() == 0) {
					bw.write("-1" + "\n");
					break;
				}
				else {
					bw.write(val + "\n"); //정수를 꺼내지 않고 확인만
					break;
				}
			}
		}
		bw.flush();
		bw.close();
	}

}
