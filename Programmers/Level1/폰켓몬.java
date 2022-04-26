/* 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다. 홍 박사님 연구실의 폰켓몬은 종류에 따라 번호를 붙여 구분합니다. 
 * 따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다. 예를 들어 연구실에 총 4마리의 폰켓몬이 있고, 
 * 각 폰켓몬의 종류 번호가 [3번, 1번, 2번, 3번]이라면 이는 3번 폰켓몬 두 마리, 1번 폰켓몬 한 마리, 2번 폰켓몬 한 마리가 있음을 나타냅니다. 
 * 이때, 4마리의 폰켓몬 중 2마리를 고르는 방법은 다음과 같이 6가지가 있습니다.
 * 입력 : [3,1,2,3]	-> 출력 : 2	/ 입력 : [3,3,3,2,2,4]	-> 출력 : 3	/ 입력 : [3,3,3,2,2,2]	-> 출력 : 2	*/
import java.util.*;
public class 폰켓몬 {

	class Solution {
	    public int solution(int[] nums) {
	        int answer = 0;
	        
	        //중복 제거해서 값 넣기
	        HashSet<Integer> h = new HashSet<>();
			for(int i = 0; i < nums.length; i++) {
				h.add(nums[i]);
			}
			
			//값 출력
			if(h.size() >= nums.length/2) {
				answer = nums.length/2;
			} else {
				answer = h.size();
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
