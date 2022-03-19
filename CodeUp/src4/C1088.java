/* [종합] 1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되, 3의 배수인 경우는 출력하지 않도록 만들어보자.
 * 입력 : 10	 -> 출력 : 1 2 4 5 7 8 10		*/
import java.util.Scanner;

public class C1088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				System.out.print("");
			} else {
				System.out.print(i+ " ");				
			}
		}
		
	}

}
