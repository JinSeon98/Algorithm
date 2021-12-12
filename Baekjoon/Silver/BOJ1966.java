import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt(); //�׽�Ʈ ���̽� ����
		for(int i = 0; i < n; i++) {
			int N = sc.nextInt(); // ������ ����
			int[] queue = new int[N];
			int M = sc.nextInt(); // �� ��°�� �μ�Ǿ����� �ñ��� ������ ���� Queue���� �� ��°�� ���� �ִ����� ��Ÿ���� ����
			for(int j = 0; j < N; j++) {
				queue[j] = sc.nextInt();
				priorityQueue.add(queue[j]);
			}
			int answer = priQueue(priorityQueue, queue, M);
			sb.append(answer + "\n");
			priorityQueue.clear();
		}
		System.out.print(sb);
		sc.close();
	}
	public static int priQueue(PriorityQueue<Integer> pq, int[] q, int M) {
		int result = 0;
		while (!pq.isEmpty()) {
            for (int i = 0; i < q.length; i++) {
                if (q[i] == pq.peek()) {
                    if (i == M) {
                        result++;
                        return result;
                    }
                    pq.poll();
                    result++;
                }
            }
        }
		return result;
	}
}
