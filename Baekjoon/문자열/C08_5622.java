/* 다이얼 전화기. 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
 * 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
 * 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
 * 입력 : WA	-> 출력 : 13	/ 입력 : UNUCIC	-> 출력 : 36		
 * ps : A~C : 2, D~f : 3, G~I : 4, J~L : 5, M~O : 6, P~S : 7, T~V : 8, W~Z : 9	*/
import java.util.Scanner;

public class C08_5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		int count = 0;		//문자당 걸리는 시간 추가해서 넣을 변수
		char[] ch = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);	//문자 하나씩 가져옴
			
			switch(ch[i]) {
			case 'A' : case 'B' : case 'C' :
				ch[i] = 3;
				break;
			case 'D' : case 'E' : case 'F' :
				ch[i] = 4;
				break;
			case 'G' : case 'H' : case 'I' :
				ch[i] = 5;
				break;
			case 'J' : case 'K' : case 'L' :
				ch[i] = 6;
				break;
			case 'M' : case 'N' : case 'O' :
				ch[i] = 7;
				break;
			case 'P' : case 'Q' : case 'R' : case 'S' :
				ch[i] = 8;
				break;
			case 'T' : case 'U' : case 'V' :
				ch[i] = 9;
				break;
			case 'W' : case 'X' : case 'Y' : case 'Z' :
				ch[i] = 10;
				break;
			}
			count += ch[i];
			
		}
		
		System.out.println(count);
	}

}
