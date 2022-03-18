/* [종합] A, B, C, D, E, F 중 하나가 입력될 때, 1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자. (단, A ~ F 까지만 입력된다.)
 * 입력 : B  -> 출력 : B*1=B \ B*2=16 \ B*3=21 \ B*4=2C \ B*5=37 \ B*6=42 \ B*7=4D
					B*8=58 \ B*9=63 \ B*A=6E \ B*B=79 \ B*C=84 \ B*D=8F \ B*E=9A \ B*F=A5	*/
import java.util.Scanner;

public class C1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(16);		// 16진수 입력
		sc.close();
		
		for(int i = 1; i <= 15; i++) {
			System.out.printf("%X*%X=%X\n", num, i, num*i);
		}
			
	}

}
