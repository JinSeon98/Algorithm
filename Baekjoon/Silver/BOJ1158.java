import java.util.LinkedList;
import java.util.Scanner;

public class BOJ1158 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		System.out.print("<");
		while(!list.isEmpty()) {
			for(int j = 0; j < k; j++) {
				if(j == k-1) {
					int a = list.remove();
					//LinkedList 크기가 0이라면 ','없이 출력
					if(list.size() == 0) {
						System.out.print(a + ">");
					}
					else {
						System.out.print(a + ", ");
					}
				}
				//k번이 아니라면 삭제 후 다시 입력
				else {
					list.add(list.remove());
				}
			}
		}
		sc.close();
	}

}
