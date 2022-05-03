/* 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있음. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수 완성
 * 입력 : 1 2 3 4		-> 출력 : 1 4		/ 입력 : -1 -2 -3 -4	-> 출력 : -4 -1	/ 입력 : -1 -1	-> 출력 : -1 -1 	*/
import java.util.*;
public class 최댓값과_최솟값 {

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        //공백 기준으로 나눠주기
	        String[] n = s.split(" ");
	        //string에서 int형으로 변환
			int[] num = new int[n.length];
			for(int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(n[i]);
			}
			//정렬
			Arrays.sort(num);
			//작은 수와 큰 수 공백으로 나눔
			answer = num[0]+" "+num[num.length-1];
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
