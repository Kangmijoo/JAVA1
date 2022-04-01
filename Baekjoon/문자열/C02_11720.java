/* N개의 숫자가 공백 없이 쓰여있고 이 숫자를 모두 합해서 출력하는 프로그램을 작성. 첫째 줄에 숫자의 개수 N(1 ≤ N ≤ 100). 둘째 줄에 숫자 N개가 공백없이 주어짐.
 * 입력 : 1 \ 1	-> 출력 : 1	-> 입력 : 5 \ 54321	-> 출력 : 15	/ 입력 : 11 \ 10987654321	-> 출력 : 46	
 * ps: 입력 받을 값이 100자가 될 수 있기 때문에 자료형 선언할 때 주의 / char to int -> Character.getNumericValue()사용	*/
import java.util.Scanner;

public class C02_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String a = sc.nextLine();
		sc.close();
		
		int sum = 0;		//한자리씩 구한 값 더해줄 변수
		char result = 0;	//계산 값 넣을 변수
		
		while(N > 0) {
			result = a.charAt(a.length() - 1);	//마지막 문자만 추출
			//추출한 마지막 문자 sum에다가 반복될 때마다 더해줌
			sum += Character.getNumericValue(result);
			a = a.substring(0, a.length()-1);	//마지막 문자 제거
			N--;
		}
		
		//출력
		System.out.println(sum);
	}

}
