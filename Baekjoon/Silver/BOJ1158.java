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
					//LinkedList ũ�Ⱑ 0�̶�� ','���� ���
					if(list.size() == 0) {
						System.out.print(a + ">");
					}
					else {
						System.out.print(a + ", ");
					}
				}
				//k���� �ƴ϶�� ���� �� �ٽ� �Է�
				else {
					list.add(list.remove());
				}
			}
		}
		sc.close();
	}

}
