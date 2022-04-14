/* 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다. 
 * array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면 (1)array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다. 
 * (2)1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다. (3)2에서 나온 배열의 3번째 숫자는 5입니다.
 * 입력 : [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	-> 출력 : [5, 6, 3]	*/
import java.util.Arrays;

public class K번째수 {

	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
			int[] answer = new int[commands.length];
	        
			int[] result = {};
			for(int i = 0; i < commands.length; i++) {	//첫번째 배열부터 계산
				//(1)배열 자르기
				result = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
				//(2)배열 정렬
				Arrays.sort(result);
				//(3)해당 위치 가져오기
				answer[i] = result[commands[i][2]-1];
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
