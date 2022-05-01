/* 길이가 같은 배열 A, B 두개. 배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱함. 이러한 과정을 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더함. 
 * 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표. (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없음.)
 * 입력 : [1, 4, 2]	[5, 4, 4]	-> 출력 : 29	/ 입력 : [1,2]	[3,4]	-> 출력 : 10	*/
import java.util.*;

public class 최솟값_만들기 {

	class Solution {
	    public int solution(int []A, int []B) {
	        int answer = 0;

	        //정렬
	        Arrays.sort(A);
	        Arrays.sort(B);
	        
	        for(int i = 0; i < A.length; i++) {
	        	//A는 작은 수부터 B는 큰 수부터 곱해주기
	            answer += A[i]*B[B.length-1-i];
	        }

	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		
	}

}
