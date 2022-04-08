/* 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 * 입력 : [1,2,3,4,6,7,8,0]	-> 출력 : 14	/ 입력 : [5,8,4,0,6,7,9]	-> 출력 : 6	*/
public class 없는_숫자_더하기 {
	
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = 0;
	        
	        //check배열에 모두 false로 초기화
	        boolean[] check = new boolean[10];
	        for(int i = 0; i < 10; i++) {
	            check[i] = false;
	        }
	        
	        //numbers배열에 존재하는 값은 check배열 위치에 true
	        for(int i = 0; i < numbers.length; i++) {
	            check[numbers[i]] = true;
	        }
	        
	        //false(numbers에서 존재하지 않는 수)이면 더해주기
	        for(int i = 0; i < 10; i ++) {
	            if(check[i] == false) {
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
