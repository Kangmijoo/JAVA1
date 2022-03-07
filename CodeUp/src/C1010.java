// Scanner : 사용자로부터 입력을 받기 위한 클래스
import java.util.Scanner;

public class C1010 {

	public static void main(String[] args) {
		// Scanner의 객체(sc) 생성
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();	//사용자로부터 입력값 받기. nextInt -> int형 입력받는 메소드
		
		System.out.println(i); //입력값 출력
		
		sc.close();	//Scanner 종료
	}

}
