/* 알파벳 대소문자로 된 단어가 주어지면, 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성. 단, 대문자와 소문자를 구분하지 않음.
 * 주어지는 단어의 길이는 1,000,000을 넘지 않음. 첫째 줄에 가장 많이 사용된 알파벳을 대문자로 출력. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우 ?를 출력.
 * 입력 : Mississipi	-> 출력 : ?	/ 입력 : zZa	-> 출력 : Z	/ 입력 : z	-> 출력 : Z	/ 입력 : baaa	 -> 출력 : A	*/
import java.util.Arrays;
import java.util.Scanner;

public class C05_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 기본으로 모든 자리에 0 넣어줌 -> 0부터 시작해서 반복될 때마다 1씩 추가*/
		int[] arr = new int[26];
		for(int j = 0; j < 26; j++) {
			arr[j] = 0;
		}
		
		/* 대문자로 입력받음 */
		String str = sc.nextLine().toUpperCase();	
		sc.close();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch - 65] += 1;		//입력받은 알파벳을 그에 맞는 배열 위치에 1씩 세줌
		}
		
		/* 가장 큰 값(max) 찾아주기 -> max값 중복이면 ? 출력 */
		int max = -1;		//값끼리 비교하고 가장 큰 값 넣어줄 변수
		char result = '-';	//결과로 출력할 값 넣어줄 변수
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {			//가장 많이 반복된 횟수 위치 char로 변환해서 출력
				max = arr[i];
				result = (char)(i+65);
			} else if(arr[i] == max) {	//반복횟수 겹칠 때
				result = '?';
			}
		}
		
		/* 출력 */
		System.out.println(result);
	}

}
