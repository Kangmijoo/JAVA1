import java.util.Arrays;
import java.util.Scanner;

public class C09_10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] age = new int[N];
		String[] name = new String[N];
		String[] a = new String[N];
		for(int i = 0; i < N; i++) {
			age[i] = sc.nextInt();
			name[i] = sc.nextLine();
		}
		sc.close();
		
		Arrays.sort(age);

	}

}
