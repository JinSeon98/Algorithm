import java.util.Scanner;

public class BOJ10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print(str.indexOf(i) + " ");
		}
		sc.close();
	}
}
