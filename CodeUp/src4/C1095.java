/* [1차원배열] 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다. n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
 * 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.
 * 입력 : 10 \ 10 4 2 3 6 6 7 9 8 5	-> 출력 : 2	*/
import java.util.Arrays;
import java.util.Scanner;

public class C1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//번호 부른 횟수 입력
		int n = sc.nextInt();
		//n개의 랜덤 번호 arr배열에 입력
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);	//배열을 정렬된 순서로 변경
		System.out.println(arr[0]);		//첫번째 배열(가장 작은 수) 출력
										//마지막 배열(가장 큰 수) -> arr[arr.length-1]  
	}

}
