/* 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 입력 : abcde	-> 출력 : c	/ 입력 : qwer	 -> 출력 : we		*/
public class 가운데_글자_가져오기 {
	
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        //str배열에 문자 하나씩 넣어주기
	        String[] str = new String[s.length()];
	        for(int i = 0; i < s.length(); i++) {
	            str[i] = Character.toString(s.charAt(i));
	        }
	        
	        //중간 글자 계산할 값
	        int turn = s.length()/2;
	        
	        //중간 글자 가져오기
	        if(s.length() % 2 == 0) {	//짝수
	            for(int i = -1; i < 1; i++) {
	                answer += str[turn+i];
	            }
	        } else {	//홀수
	            answer = str[turn];
	        }
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
