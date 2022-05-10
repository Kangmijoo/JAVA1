/* 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 * 입력 : 2143	-> 출력 : 4321	/ 입력 : 999998999	-> 출력 : 999999998 */
import java.util.Arrays;
import java.util.Scanner;

public class C05_1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();

		//자리수 별로 배열에 넣어주기
		int[] num = new int[a.length()];
		for(int i = 0; i < a.length(); i++) {
			num[i] = a.charAt(i) - '0';
		}
		
		//오름차순 정렬 후 뒷자리부터 출력 -> 내림차순
		Arrays.sort(num);
		for(int i = a.length()-1; i >= 0; i--) {
			System.out.print(num[i]);
		}
	}

}
