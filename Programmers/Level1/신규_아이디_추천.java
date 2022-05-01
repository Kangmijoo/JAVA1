/* 7단계의 순차적인 처리 과정을 통해 신규 유저가 입력한 아이디가 카카오 아이디 규칙에 맞는 지 검사하고 규칙에 맞지 않은 경우 규칙에 맞는 새로운 아이디를 추천
 * 입력 : ...!@BaT#*..y.abcdefghijklm	- > 출력 : "bat.y.abcdefghi" / 입력 : =.=	 -> 출력 : aaa	/
 * 입력 : z-+.^.	-> 출력 : z--	/ 입력 : 123_.def	-> 출력 : 123_.def	/ 
 * 입력 : abcdefghijklmn.p	-> 출력 : abcdefghijklmn		*/
public class 신규_아이디_추천 {

	class Solution {
	    public String solution(String new_id) {
	        //1. 대문자 -> 소문자
			String id = new_id.toLowerCase();
			//2. 소문자, 숫자, (-), (_), (.) 제외 모두 지우기
			id = id.replaceAll("[^-_.a-z0-9]", "");
			//3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
			id = id.replaceAll("[.]{2,}", ".");
			//4. 마침표(.)가 처음이나 끝에 위치한다면 제거
			id = id.replaceAll("^[.]|[.]$", "");
			//5. 빈 문자열이라면, new_id에 "a"를 대입
			if(id.equals("")) {
				id += "a";
			}
			//6. 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자 모두 제거. 제거 후 마침표(.)가 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
			if(id.length() >= 16) {
				id = id.substring(0, 15);
				id = id.replaceAll("^[.]|[.]$", "");
			}
			//7. 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
			if(id.length() <= 2) {
				while(id.length() < 3) {
					id += id.charAt(id.length()-1);				
				}
			}
	        
	        return id;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
