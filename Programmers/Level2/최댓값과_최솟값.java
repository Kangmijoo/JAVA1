/* 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있음. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수 완성
 * 입력 : 1 2 3 4		-> 출력 : 1 4		/ 입력 : -1 -2 -3 -4	-> 출력 : -4 -1	/ 입력 : -1 -1	-> 출력 : -1 -1 	*/
import java.util.*;
public class 최댓값과_최솟값 {

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        String[] n = s.split(" ");
			int[] num = new int[n.length];
			for(int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(n[i]);
			}
			Arrays.sort(num);
			answer = num[0]+" "+num[num.length-1];
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
