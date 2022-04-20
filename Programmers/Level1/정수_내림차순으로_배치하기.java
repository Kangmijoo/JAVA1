/* 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 * 입력 : 118372	-> 출력 : 873211	*/
import java.util.*;

public class 정수_내림차순으로_배치하기 {

	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        
	        String num = String.valueOf(n);
			String ans = "";
			char[] arr = new char[num.length()];
			//숫자 하나씩 배열에 넣어주기
			for(int i = 0; i < num.length(); i++) {
				arr[i] = num.charAt(i);
			}
			
			//오름차순으로 정렬
			Arrays.sort(arr);
			//string에 마지막 숫자부터 넣어주기 -> 내림차순
			for(int i = num.length()-1; i >= 0; i--) {
				ans += arr[i];
			}
			
			//string을 long으로 변환
	        answer = Long.parseLong(ans);
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		
	}

}
