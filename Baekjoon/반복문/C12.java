/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. 
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)입력의 마지막에는 0 두 개가 들어온다.
 * 입력 : 1 1 \ 2 3 \ 3 4 \ 9 8 \ 5 2 \ 0 0	-> 출력 : 2 \ 5 \ 7 \ 17 \ 7		
 * ps : 모두 입력 받은 다음 한번에 결과가 나와야 하는 줄 알았는데, 0 0이 나오기 전까지는 입력하고 결과받는 방식을 반복해도 되나보다.	*/
import java.util.Scanner;

public class C12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int[] A = new int[100];
		int[] B = new int[100];
		//A와 B가 모두 0이 나올 때 까지 입력받음
		while(true) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			if(A[i] == 0 && B[i] == 0) {
				break;
			}
			i++;			
		}
		sc.close();
		
		//입력 받은 배열을 계산
		for(int j = 0; j < i; j++) {
			System.out.println(A[j]+B[j]);
		}
		
		/*ex2 - 0 0이 나오기 전까지 입력과 출력을 반복하는 방법*/
//		while(true) {
//			int A = sc.nextInt();
//			int B = sc.nextInt();
//			if(A == 0 && B == 0) {
//				sc.close();
//				break;
//			}
//			System.out.println(A+B);
//		}
	}

}
