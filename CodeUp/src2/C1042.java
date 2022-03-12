/* 정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자. 단, -2147483648 <= a <= b <= +2147483647, b는 0이 아니다. 
 * 입력 : 1 3	  -> 출력 : 0		*/
import java.util.Scanner;
public class C1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.println(num1 / num2);
	}

}
