import java.util.Scanner;

public class BOJ2576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[7];
		int sum = 0;
		int min = 1000;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2 != 0) {
				sum += arr[i];
				if(arr[i] < min) {
					min = arr[i];
				}
			}
		}
		if(sum != 0) {
			System.out.print(sum + "\n" + min);
		}
		else {
			System.out.print(-1);
		}
		sc.close();
	}
}
