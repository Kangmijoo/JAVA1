/* 대소문자와 공백으로 이루어진 문자열. 문자열에는 몇 개의 단어가 있을지 구하는 프로그램을 작성하시오. 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 함.
 * 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 * 입력 : The Curious Case of Benjamin Button	 -> 출력 : 6
 * 입력 :  The first character is a blank  -> 출력 : 6	  / 입력 : The last character is a blank 	-> 출력 : 6		
 * ps : 공백 입력후 바로 출력할 때 오류 주의		*/
import java.util.Scanner;

public class C06_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		sc.close();
		
		if (arr.length == 0) {	//공백만 입력하고 바로 출력할 경우
			System.out.println(0);
			System.exit(0); 	//프로그램 강제 종료
		}
		
		if(arr[0].isEmpty()) {	//공백으로 시작할 경우
			System.out.println(arr.length-1);
		} else {		//문자로 시작하는 경우 || 끝에 공백이 들어가는 경우
			System.out.println(arr.length);
		}
		
	}

}
