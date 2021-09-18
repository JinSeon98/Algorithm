import java.util.Scanner;

public class BOJ2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s[] = new int[9];
		for(int i = 0; i < 9; i++) {
			s[i] = sc.nextInt();
		}
		int max = s[0];
		int index = 1;
		for(int i = 0; i < 9; i++) {
			if(s[i] > max) {
				max = s[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
		sc.close();
	}
}
