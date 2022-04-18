/* 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단함. 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 함
 * 입력 : "try hello world"	-> 출력 : "TrY HeLlO WoRlD"	*/
public class 이상한_문자_만들기 {

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        s = s.toLowerCase();    //모두 소문자로 변환
			
			int j = 0;
			for(int i = 0; i < s.length(); i++) {
				//space면 j -1로 초기화
				if(s.charAt(i) == ' ') {    
					j = -1;
				}
				//짝/홀수 인덱스 판단
				if(j % 2 == 0) {    //짝수면 대문자로 변환
					answer += s.toUpperCase().charAt(i);
				} else {    //홀수면 소문자 그대로
					answer += s.charAt(i);
				}
				j++;
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
