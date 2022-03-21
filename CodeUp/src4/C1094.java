/* [1차원배열] 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다. n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
 * 입력 : 10 \ 10 4 2 3 6 6 7 9 8 5	-> 출력 : 5 8 9 7 6 6 3 2 4 10	*/
import java.util.Scanner;

public class C1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());	//번호 부른 횟수(n)을 받아옴
		
		//입력될 크기에 맞게 배열 선언(아직 빈 깡통)
		int[] arr = new int[n];		
		//만들어 둔 arr배열에 값 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();		
		}
		sc.close();
		
		//반대로 입력받을 배열 선언(아직 빔)
		int[] reverseArr = new int[n];	
		//arr배열과 reverse배열과 순서 뒤바뀜
		for(int i=n-1, j=0; i>=0; i--, j++) {
			reverseArr[j] = arr[i];		
		}
		
		//reverse에 들어있는 배열 출력
		for(int i : reverseArr) {		
			System.out.printf(i +" ");
		}
		
	}

}
