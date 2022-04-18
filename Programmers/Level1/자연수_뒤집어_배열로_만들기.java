/* 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * 입력 : 12345	-> 출력 : [5,4,3,2,1]		*/
public class 자연수_뒤집어_배열로_만들기 {
	
	class Solution {
	    public long[] solution(long n) {
			String a = String.valueOf(n);
			long[] answer = new long[a.length()];
			
			int i = 0;
			while(i < a.length()) {
				answer[i] = n % 10;
				n = n / 10;
				i++;
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
