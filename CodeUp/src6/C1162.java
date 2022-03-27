/* 세 수(년,월,일)가 주어지면,  (년 - 월 + 일)에 마지막 숫자가 0이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.
 * 입력 : 1902 2 10	-> 출력 : 대박		*/
import java.util.Scanner;

public class C1162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		int result = year-month+day;
		if(result % 10 == 0) {
			System.out.println("대박");
		} else {
			System.out.println("그럭저럭");
		}
	}

}
