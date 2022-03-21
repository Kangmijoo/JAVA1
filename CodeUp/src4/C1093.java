/* [1차원배열] 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. 
 * (1 ~ 10000) 두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.
 * 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
 * 입력 : 10 \ 1 3 2 2 5 6 7 4 5 9	-> 출력 : 1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0	*/
import java.util.*;

public class C1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//arr배열에 무작위로 부른 번호 넣기
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		//count배열 초기화	
		int[] count = new int[23];
		for(int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		
		//count배열에 불린 횟수만큼 값 추가
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j <= count.length; j++) {
				if(arr[i] == j) {
					count[j-1]++;	//배열 첫 시작 0이니 j-1
				}
			}
		}
		
		//배열 출력
		for(int i : count) {
			System.out.print(i +" ");
		}
		
	}

}
