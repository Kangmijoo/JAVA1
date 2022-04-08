/* 대문자와 소문자가 섞여있는 문자열 s. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 입력 : pPoooyY -> 출력 : true	/ 입력 : Pyy -> 출력 : false		*/
public class 문자열_내_p와_y의_개수 {
	
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        s = s.toLowerCase();	//문자열 소문자로 변환
	        
	        int cnt_p = 0;	//p 개수
	        int cnt_y = 0;	//y 개수
	        for(int i = 0; i < s.length(); i++) {
	            if(s.charAt(i) == 'p') {
	                cnt_p++;
	            } 
	            if(s.charAt(i) == 'y') {
	                cnt_y++;
	            } 
	        }
	        
	        if(cnt_p == cnt_y) {
	            answer = true;
	        } else {
	            answer = false;
	        }

	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
