/* 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 주어짐. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성.
 * 입력 : "one4seveneight"	-> 출력 : 1478	/ 입력 : "23four5six7"	-> 출력 : 234567
 * 입력  : "2three45sixseven"	-> 출력 : 234567	/ 입력 : "123"	-> 출력 : 123		*/
public class 숫자_문자열과_영단어 {

	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        String[] n = {"0","1","2","3","4","5","6","7","8","9"};
	        String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	        
	        for(int i = 0; i < 10; i++) {
	            s = s.replace(word[i], n[i]);
	        }
	        
	        answer = Integer.parseInt(s);
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
