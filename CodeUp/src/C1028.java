import java.util.Scanner;

/*정수 1개를 입력받아 그대로 출력해보자. (단, 입력되는 정수의 범위는 0 ~ 4,294,967,295 이다.)
 * 입력 : 2147483648	-> 출력 : 2147483648	*/
public class C1028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long var = sc.nextLong();	//long이 int보다 더 큰 수 할당
		
		System.out.println(var);
		
		sc.close();
	}

}
