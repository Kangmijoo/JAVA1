/* ���� 3���� �Է¹޾� �հ� ����� ����غ���. (��, -2147483648 ~ +2147483647)
 * �Է� : 1 2 3	-> ��� : 6
						2.0	*/
import java.util.Arrays;
import java.util.Scanner;

public class C1046 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] arr = str.split(" ");
		// string�迭 ArraysŬ���� �̿��ؼ� int�迭�� ��ȯ
		int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		
		Double sum = 0.0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		System.out.printf("%.0f\n", sum);
		System.out.printf("%.1f", sum / nums.length);
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Double num1 = sc.nextDouble();
//		Double num2 = sc.nextDouble();
//		Double num3 = sc.nextDouble();
//		sc.close();
//		
//		Double sum = num1 + num2 + num3;
//		System.out.printf("%.0f\n", sum);
//		System.out.println(sum / 3);
//}

}
