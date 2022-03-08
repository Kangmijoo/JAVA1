import java.util.Scanner;

public class C1018 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		
//		System.out.println(str);
//		
//		sc.close();
		
/*		ex2. String[] split 사용		*/
		Scanner sc = new Scanner(System.in);
		String clock = sc.nextLine();			//한 줄 입력 받음
		String[] arr = clock.split(":");		//':'을 기준으로 문자열을 구분
		
		System.out.printf("%s:%s", arr[0], arr[1]);		//분할 문자열 출력
		
		sc.close();
	}

}
