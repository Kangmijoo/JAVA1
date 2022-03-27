/* 세 수(년,월,일)가 주어지면,  (년 + 월 + 일)에 100의 자리 숫자가 짝수이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.
 * 입력 : 1502 2 10	-> 출력 : 그럭저럭	*/
import java.util.Scanner;

public class C1163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		//년+월+일 -> 끝에서 3번째 자리 숫자 가져오기 -> 100의 자리 숫자 출력
		String str = String.valueOf(year+month+day);
		int result = Integer.parseInt(str.substring(str.length()-3, str.length()-2));
		
		if(result % 2 == 0) {
			System.out.println("대박");
		} else {
			System.out.println("그럭저럭");
		}
			
	}

}
