/* 2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
 * 입력 : [[1, 4], [3, 2], [4, 1]] [[3, 3], [3, 3]]	-> 출력 : [[15, 15], [15, 15], [15, 15]]
 * 입력 : [[2, 3, 2], [4, 2, 4], [3, 1, 4]]	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	
 * -> 출력 : [[22, 22, 11], [36, 28, 18], [29, 20, 14]]	*/
public class 행렬의_곱셈 {

	class Solution {
	    public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr2[0].length];
			
			for(int i = 0; i < arr1.length; i++) {
				for(int j = 0; j < arr2[0].length; j++) {
					for(int k = 0; k < arr1[0].length; k++) {
						answer[i][j] += arr1[i][k]*arr2[k][j];					
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
