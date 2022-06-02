
import java.util.*;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		
		for(int i = 0; i < a; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
