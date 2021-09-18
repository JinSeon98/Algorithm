import java.util.Scanner;

public class BOJ3460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int deci[] = new int[T];
		String binary[] = new String[T];
		
		for(int i = 0; i < T; i++) {
			deci[i] = sc.nextInt();
			binary[i] = Integer.toBinaryString(deci[i]);
		}
		for(int i = 0; i < T; i++) {
			char arr[] = binary[i].toCharArray();
			int loc = 0;
			for(int j = arr.length-1; j >= 0 ; j--) {
				if(arr[j] == '1') {
					System.out.print(loc + " ");
				}
				loc++;
			}
			System.out.println();
		}
		/*
		 for(int i=0; i<t; i++) {
	         for(int j = n[i], k=0; j>0; j/=2, k++) {
	            if(j%2==1) {
	               System.out.print(k + " ");
	            }
	         }
        System.out.println();
     	}
		 */
		sc.close();
	}
}
