/* 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수 만들기. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 * 입력 : [4,3,2,1]	-> 출력 : [4,3,2]	 / 입력 : [10]  -> 출력 : [-1]		*/
import java.util.*;

public class 제일_작은_수_제거하기 {

	class Solution {
	    public List<Integer> solution(int[] arr) {        
	        //배열 크기가 1이라면 -1 출력
			if(arr.length == 1) {
				ArrayList<Integer> list = new ArrayList<Integer>();
	            list.add(-1);
	            return list;
			}
			
	        //가장 작은 수 구하기
			int min = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			
			//작은 수 뺀 list
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == min) {
					continue;
				} 
				list.add(arr[i]);
			}
	        
	        return list;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
