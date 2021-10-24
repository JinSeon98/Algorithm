import java.util.Scanner;

public class BOJ9093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			String s = sc.nextLine();
			String word[] = s.split(" ");
			
			for(String words : word) {
				for(int j = words.length()-1; j >= 0; j--) {
					sb.append(words.charAt(j));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
