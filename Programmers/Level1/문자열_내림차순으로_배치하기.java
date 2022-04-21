/* 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열 출력. s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주.
 * 입력 : "Zbcdefg"	-> 출력 : "gfedcbZ"	*/
import java.util.*;

public class 문자열_내림차순으로_배치하기 {

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        //문자 하나하나 나눠서 아스키코드로 변환
	        int[] asc = new int[s.length()];
			for(int i = 0; i < s.length(); i++) {
				asc[i] = s.charAt(i);
			}
			
	        //아스키코드를 큰것부터 작은 순으로 정렬해서 문자로 변환
			Arrays.sort(asc);
			for(int i = s.length()-1; i >= 0; i--) {
				answer += (char)asc[i];
			}
			
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
