/* 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열 만들기. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됨. 
 * 입력 : 3people unFollowed me	-> 출력 : 3people Unfollowed Me
 * 입력 : for the last week	-> 출력 : For The Last Week	*/
public class JadenCase_문자열_만들기 {

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        //모두 소문자로 변환
	        s = s.toLowerCase();
	        
			for(int i = 0; i < s.length(); i++) {
				//첫번째 알파벳 혹은 전에 띄어쓰기가 있던 알바펫을 대문자로 변환
				if(i == 0 || s.charAt(i-1) == ' ') {
					answer += s.toUpperCase().charAt(i);
				} 
				//그 외에는 모두 그대로 출력
				else {	
					answer += s.charAt(i);				
				}
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
