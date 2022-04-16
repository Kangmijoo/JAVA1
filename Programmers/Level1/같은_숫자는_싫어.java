/* 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
 * 입력 : [1, 1, 3, 3, 0, 1, 1] 	-> 출력 : [1, 3, 0, 1]	/ 입력 : [4, 4, 4, 3, 3]	 -> 출력 : [4, 3] */
import java.util.*;
	
public class 같은_숫자는_싫어 {

	public class Solution {
	    public List<Integer[]> solution(int []arr) {
	        //arr배열 크기만큼 공간 만들어 두기
			Integer[] answer = new Integer[arr.length];

			//answer 0번째 인덱스에는 arr 0번째 인덱스 값 넣기
	    	answer[0] = arr[0];
	    	
	    	//중복 값은 제거하고 빈 공간에는 null값 들어가기
	    	int j = 1;
	        for(int i = 1; i < arr.length; i++) {
	        	if(arr[i] != arr[i-1]) {
	        		answer[j] = arr[i];
	            	j++;
	            } 
	        }
	        
	        //null값 없애기
	        List<Integer[]> list = new ArrayList(Arrays.asList(answer));
	        list.removeAll(Collections.singletonList(null));

	        return list;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
