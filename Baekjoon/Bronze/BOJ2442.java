import java.util.Scanner;

public class BOJ2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			for(int j = 1; j < 2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
