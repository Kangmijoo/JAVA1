/* 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 * 45	-> 3진수 변환 :1200		-> 뒤집기 : 0021	-> 10진수 변환 : 7
 * 입력 : 45	-> 출력 :7	/ 입력 : 125	-> 출력 : 229		*/
public class 삼진법_뒤집기 {

	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        //3진법 변환뒤 앞뒤 반전
	        String a = "";
	        while(n != 0) {     
	            int result = n % 3;     //n=45일때 0, 0, 2, 1
	            a += String.valueOf(result);
	            n = n / 3;      //15, 5, 1, 0
	        }
	        
	        //10진법으로 표현
	        answer = Integer.parseInt(a, 3);
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
