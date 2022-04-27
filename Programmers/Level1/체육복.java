/* 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
 * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
 * 입력 : 5	[2, 4]	[1, 3, 5]	-> 출력 : 5	/ 입력 : 5	[2, 4]	[3]	-> 출력 : 4
 * 입력 : 3	[3]	[1]	-> 출력 : 2	*/
import java.util.*;
public class 체육복 {

	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        int answer = n-lost.length;	//체육복 안잃어버린 사람 수
	        
	        Arrays.sort(lost);
	        Arrays.sort(reserve);
	        
	        //여벌 가져온 학생이 도난 당했을 경우
	        for(int i = 0; i < lost.length; i++) {
	            for(int j = 0; j < reserve.length; j++) {
	                if(lost[i] == reserve[j]) {
	                    reserve[j] = -10;
	                    lost[i] = -10;
	                    answer++;
	                    break;
	                }
	            }
	        }
	        
	        //도난 당한 학생이 여벌 가져온 학생에게 빌릴 경우
	        for(int i = 0; i < lost.length; i++) {
	            for(int j = 0; j < reserve.length; j++) {
	                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
	                    answer++;
	                    reserve[j] = -10;
	                    break;
	                }
	            }
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
