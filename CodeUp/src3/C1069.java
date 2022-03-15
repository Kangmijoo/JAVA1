/* [조건/선택실행구조] 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자. 
 * (A : best!!!, B : good!!, C : run!, D : slowly~, 나머지 문자들 : what? 
 * 입력 : A	-> 출력 : best!!!		*/
import java.util.Scanner;

public class C1069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		sc.close();
		
		String str = "";
		switch (a) {
			case "A" : 
				str = "best!!!";
				break;
			case "B" : 
				str = "good!!";
				break;
			case "C" : 
				str = "run!";
				break;
			case "D" : 
				str = "slowly~";
				break;
			default : 
				str = "what?";
				break;
		}
		
		System.out.println(str);
		
	}

}
