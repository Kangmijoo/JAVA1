/* [종합] 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자. 
 * 입력 : 5	-> 출력 : 6	*/
import java.util.Scanner;

public class C1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i = 0; i <= a; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			} else {
				sum = sum;
			}
		}
		System.out.println(sum);
	}

}
