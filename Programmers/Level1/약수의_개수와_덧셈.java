/* 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 * 입력 : 13 17	-> 출력 : 43	/ 입력 : 24 27  -> 출력 : 52	*/
public class 약수의_개수와_덧셈 {

	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;
	        int cnt = 0;
	        //left부터 right까지
	        for(int i = left; i <= right; i++) { 
	            for(int j = 1; j <= i; j++) { 
	                //약수의 개수 세주기
	                if(i % j == 0) {
	                    cnt++;  
	                }
	            }
	            //약수의 개수가 짝수이면 +
	            if(cnt % 2 == 0) {  
	                answer += i;
	            } 
	            //약수의 개수가 홀수이면 -
	            else {    
	                answer -= i;
	            }
	            //cnt 초기화하고 다시 카운트 할 준비
	            cnt = 0;    
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
