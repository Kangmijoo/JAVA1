/* 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오. (첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.)
 * 입력 : 5	-> 출력 : 1 \ 2 \ 3 \ 4 \ 5	*/
import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}

}
