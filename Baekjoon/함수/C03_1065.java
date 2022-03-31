/* 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * (1<= 한수 <= N) 한수의 개수를 출력하는 프로그램을 작성하시오. (N <= 1000)
 * 입력 : 110	 -> 출력 : 99	 / 입력 : 1	-> 출력 : 1	/ 입력 : 210	-> 출력 : 105	 / 입력 : 1000	-> 출력 : 144	*/
import java.util.Scanner;

public class C03_1065 {
	/* 한수인지 구분하고 한수이면 개수를 세는 함수 */
	public static int CheckHanNum(int num) {
		int CheckHanNum = 0;
		
		//100~num까지의 숫자만 계산
		for(int i = 100; i <= num; i++) {
			int num1 = i/100;
			int num2 = i%100/10;
			int num3 = i%10;
			//한수이면 CheckHanNum에 +1씩 해줌
			if((num3 + num1)*1.0/2 == num2) {
				CheckHanNum++;
			}
		}
		
		return CheckHanNum;
	}
	
	/* 계산해온 한수의 개수를 출력 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		// 입력받은 X값을 CheckHanNum함수에서 계산해와서 result에 넣음
		int result = CheckHanNum(X);	
		if(X > 99) {	//X가 100이상이면 함수에서 계산해온 값 + 99해서 출력 ->1~99값은 함수에서 계산 안했기 때문
			result += 99;
		} else {	//X가 100미만인 수는 입력값 그대로 출력
			result = X;
		}
		
		//출력
		System.out.println(result);
	}

}
