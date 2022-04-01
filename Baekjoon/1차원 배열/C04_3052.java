/* 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
 * 수 10개를 입력, 이를 42로 나눈 나머지를 구함. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성. (1,000보다 작거나 같고, 음이 아닌 정수)
 * 입력 : 1 \ 2 \ 3 \ 4 \ 5 \ 6 \ 7 \ 8 \ 9 \ 10	-> 출력 : 10	
 * ps: 배열 중복값 구하기	-> HashSet메소드 사용		*/
import java.util.HashSet;
import java.util.Scanner;

public class C04_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[11];
		int[] remain = new int[11];
		for(int i = 1; i < 11; i++) {	
			x[i] = sc.nextInt();	//x배열에 자연수 입력받음
			remain[i] = x[i] % 42;	//remain배열에 입력받은 자연수를 42로 나눈 나머지 값 넣음
		}
		sc.close();
		
		/* HashSet메소드는 중복을 허용하지 않는다 */
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 1; i < 11; i++) {
			//reamain배열. 즉 10개의 숫자를 42로 나눈 나머지 값들을 넣어줌 -> 중복값은 무시 -> 서로 다른 값의 개수만 결과로 나옴
			set.add(remain[i]);		
		}
		System.out.println(set.size());
		
	}

}
