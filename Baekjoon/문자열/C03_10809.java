/* 소문자로만 이루어진 단어 S. 각각의 알파벳에 대해서 단어에 포함되어 있는 경우 처음 등장하는 위치를, 포함안돼 있는 경우 -1을 출력하는 프로그램을 작성
 * 입력 : baekjoon	-> 출력 : 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1		*/
import java.util.Scanner;

public class C03_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//배열에 들어갈 값 모두 -1로 초기화
		int[] arr = new int[26];
		for(int i = 0; i < 26; i++) {	
			arr[i] = -1;		
		}

		//단어 S 받아오기
		String S = sc.nextLine();
		
		//단어 알파벳 당 하나씩 비교
		for(int i = 0; i < S.length(); i++) {
			int ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) {	//알파벳 소문자 97부터 시작
				arr[ch - 'a'] = i;
			} 
		}
		sc.close();
		
		//입력 받은 배열 값들 하나씩 출력
		for(int result : arr) {
			System.out.print(result + " ");
		}
				
	}

}
