/* 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오. 길이가 짧은 것부터, 길이가 같으면 사전 순으로 
 * 입력 : 13 \ but \ i \ wont \ hesitate \ no \ more \ no \ more \ it \ cannot \ wait \ im \ yours
 * 출력 : i \ im \ it \ no \ but \ more \ wait \ wont \ yours \ cannot \ hesitate		*/
import java.util.*;

public class C08_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();		
		String s = "";
		for(int i = 0; i < N; i++) {
			s = sc.nextLine();
			list.add(s.length()+s);
		}
		sc.close();
		
		
		System.out.println(list);
	}

}
