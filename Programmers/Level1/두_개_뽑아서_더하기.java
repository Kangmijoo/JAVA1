import java.util.Arrays;
import java.util.HashSet;

public class 두_개_뽑아서_더하기 {

	class Solution {
	    public Integer[] solution(int[] numbers) {
	        HashSet<Integer> set = new HashSet<Integer>();
			//원소마다 더한 수 배열에 넣기(중복 제거)
		    for(int i = 0; i < numbers.length; i++) {
		        for(int j = i+1; j < numbers.length; j++) {
		            set.add(numbers[i]+numbers[j]);
		        }
		    }
	        
	        //배열로 변환후 오름차순 정렬
	        Integer[] answer = set.toArray(new Integer[0]);
	        Arrays.sort(answer);
		        
		    return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
