/* 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 최대 몇 개의 부서에 물품을 지원할 수 있는지 함수를 완성해주세요.
 * d는 부서별로 신청한 금액이 들어있는 배열이며, 길이(전체 부서의 개수)는 1 이상 100 이하입니다.
 * d의 각 원소는 부서별로 신청한 금액을 나타내며, 부서별 신청 금액은 1 이상 100,000 이하의 자연수입니다.
 * budget은 예산을 나타내며, 1 이상 10,000,000 이하의 자연수입니다.
 * 입력 : [1,3,2,5,4]	9	-> 출력 : 3	/ 입력 : [2,2,3,3] 10	 -> 출력 : 4	*/
import java.util.Arrays;

public class 예산 {

	class Solution {
	    public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        
	        int cnt = 0;
	        for(int i = 0; i < d.length; i++) {
	        	answer += d[i];
	        	if(answer > budget) {
	        		break;
	        	}
	        	cnt++;
	        }
	        return cnt;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
