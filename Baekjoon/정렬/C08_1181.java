/* 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오. 길이가 짧은 것부터, 길이가 같으면 사전 순으로 
 * 입력 : 13 \ but \ i \ wont \ hesitate \ no \ more \ no \ more \ it \ cannot \ wait \ im \ yours
 * 출력 : i \ im \ it \ no \ but \ more \ wait \ wont \ yours \ cannot \ hesitate		*/
import java.util.*;

public class C08_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		sc.nextLine();	//개행 버림
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextLine();
		}
		sc.close();
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {	//단어 길이 같을 때
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});		
		
		System.out.println(arr[0]);
		
		for(int i = 1; i < N; i++) {
			//중복되지 않는 단어만 출력
			if(!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	}

}
