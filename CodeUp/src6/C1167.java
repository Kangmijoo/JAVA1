/* 세 개의 숫자가 주어질 때 작은 순서로 나열 했을 때, 두번째 수를 출력해보자. 
 * 예를 들어, 5 9 2 가 있다면, 작은 순서로 나열하면 2 5 9이고 두번째 수는 5이다.
 * 입력 : 201 20 3	-> 출력 : 20	*/
import java.util.Arrays;
import java.util.Scanner;

public class C1167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		
		//배열을 오름차순으로 정렬
		Arrays.sort(arr);
		//배열의 두번째 수를 출력
		int result = arr[1];
		
		System.out.println(result);
	}

}
