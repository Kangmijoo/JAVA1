/* array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 * 입력 : [5, 9, 7, 10]	5	-> 출력 : [5, 10]	/ 입력 : [2, 36, 1, 3] 1	-> 출력 : [1, 2, 3, 36]	*/
import java.util.*;

public class 나누어_떨어지는_숫자_배열 {

	class Solution {
	    public List<Integer> solution(int[] arr, int divisor) {
	        ArrayList<Integer> answer = new ArrayList<>(); 
			//정렬
			Arrays.sort(arr);
			
			//나누어 떨어지면 list에 값 넣기
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % divisor == 0) {
					answer.add(arr[i]);
				}
			}
	        
	        //나누어 떨어지는 값이 없으면 -1
			if(answer.isEmpty()) {
				answer.add(-1);
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
