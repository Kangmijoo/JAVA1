/* 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 * 입력 : 12	-> 출력 : 28	*/
public class 약수의_합 {

	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        for(int i = 1; i <= n; i++) {
	            if(n % i == 0) {
	                answer += i;
	            }
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
