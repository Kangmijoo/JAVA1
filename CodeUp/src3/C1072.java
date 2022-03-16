/* [반복실행구조] n개의 정수가 순서대로 입력된다. -2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.
 * n개의 입력된 정수를 순서대로 출력해보자. while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.
 * 입력 : 5			 -> 출력 : 1
		1 2 3 4 5  			 2
							 3
							 4
							 5		*/
import java.util.Scanner;

public class C1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a;
		
		for(int i=0; i<count; i++) {
			a = sc.nextInt();
			System.out.println(a);
		}
		sc.close();
	}

}
