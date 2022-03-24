/* n이 입력되면 n×123456789 의 결과를 출력하시오. 정수 n이 입력된다.(0<=n<=100). 금지키워드 : long, double, float
 * 입력 : 1	-> 출력 : 123456789	*/
import java.util.Scanner;

public class C1128 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		//123456789뒤에 접미사 L을 붙여줬기 때문에 long타입이 돼서 출력 가능
		System.out.println(n*123456789L);
	}

}
