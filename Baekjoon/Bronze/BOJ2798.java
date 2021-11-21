import java.util.Arrays;
import java.util.Scanner;

public class BOJ2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = 0;
		for(int i = 0; i < n; i++) {
			int sum = 0;
			if(arr[i] <= m) {
				sum += arr[i];
				for(int j = i+1; j < n; j++) {
					if(sum + arr[j] <= m) {
						sum += arr[j];
						for(int k = j+1; k < n; k++) {
							if(sum + arr[k] <= m) {
								sum += arr[k];
								if(max < sum) {
									max = sum;
								}
							}
							else if(sum + arr[k] > m) {
								break;
							}
							sum -= arr[k];
							continue;
						}
						sum -= arr[j];
						continue;}
					else {
						continue;
						}
				}	
			}
		}
		System.out.print(max);
		sc.close();
	}
}
