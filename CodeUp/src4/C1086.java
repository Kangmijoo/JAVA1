/* [종합] 필요한 저장 공간을 MB 단위로 바꾸어 출력한다. 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.
 * w, h, b 가 공백을 두고 입력된다. 단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.
 * 입력 : 1024 768 24	 -> 출력 : 2.25 MB	*/
import java.util.Scanner;

public class C1086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		
		double bit = w * h * b;
		double change = 8 * Math.pow(2, 10) * Math.pow(2, 10);
		double MB = bit / change;
		
		System.out.printf("%.2f MB", MB);
				
	}

}
