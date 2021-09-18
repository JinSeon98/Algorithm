import java.util.Arrays;
import java.util.Scanner;

public class BOJ1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int subject[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			subject[i] = sc.nextInt();
		}
		Arrays.sort(subject);
		
		int M = subject[n-1];
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += (double) subject[i]/M*100;
		}
		System.out.print(sum/n);
		sc.close();
	}
}
