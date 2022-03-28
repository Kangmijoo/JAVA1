/* 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
 * 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. (단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.)
 * 입력 : 12 \ 5	-> 출력 : 1	*/
import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if(x > 0) {		//x가 양수 -> 1사분면 or 4사분면
			if(y > 0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {		//x가 양수 -> 2사분면 or 3사분면
			if(y > 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
	}

}
