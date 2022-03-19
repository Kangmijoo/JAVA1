/* [종합] 1부터 n까지 정수를 계속 더한다고 할 때, 어디까지 더해야 입력한 수보다 같거나 커지는지 알아보자. 
 * 1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우, 그때까지의 합을 출력한다.
 * 입력 : 57	-> 출력 : 66		*/
import java.util.Scanner;

public class C1087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i = 1; i <= 100000000; i++) {
			sum += i;
			if(sum >= num) {
				System.out.println(sum);
				break;
			}
		}
		
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		
//		int sum = 0;
//		int i = 0;
//		while(sum < num) {
//			i++;
//			sum += i;
//		}
//		System.out.println(sum);
//		
//	}

}
