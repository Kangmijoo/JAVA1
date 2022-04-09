/* 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 함. 
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요. 1.공백은 아무리 밀어도 공백입니다. 
 * 2.s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다. 3.s의 길이는 8000이하입니다. 4.n은 1 이상, 25이하인 자연수입니다.
 * 입력 : AB	1	-> 출력 : BC	/ 입력 : z  1	 -> 출력 : a	/ 입력 : a B z	4	-> 출력 : e F d	*/
public class 시저_암호 {

	class Solution {
	    public String solution(String s, int n) {
	        String answer = "";
	        
	        int a = 0;
	        for(int i = 0; i < s.length(); i++) {
	        	//아스키코드 변환
	        	if(s.charAt(i) == ' ') {
	        		a = 32;     //space 공백이면
	        	} else {
	        		a = (int)s.charAt(i)+n;
	        	}
	            //z나 Z를 넘어갈 때 a나 A로 시작하도록 해줌
	            if(a > 122 || (s.charAt(i) < 91 && a > 90)) { 
	            	a = a - 26;
	            }
	            answer += (char)a;
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
