import java.util.Scanner;

public class BOJ5598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char s[] = str.toCharArray();
		char output[] = new char[s.length];
		
		for(int i = 0; i < s.length; i++) {
			if((s[i] - 3) < 65) {
				output[i] = (char)(s[i] + 23);
			}
			else {
			output[i] = (char)(s[i] - 3);
			}
			System.out.print(output[i]);
		}
		sc.close();
	}
}
