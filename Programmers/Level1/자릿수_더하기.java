/* 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수. 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 * N의 범위 : 100,000,000 이하의 자연수		입력 : 123	-> 출력 : 6	/ 입력 : 987	-> 출력 : 24	*/
public class 자릿수_더하기 {

	public class Solution {
	    public int solution(int n) {
	        int answer = 0;

	        while(n != 0) {
	            answer += n % 10;
	            n /= 10;
	        }

	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
