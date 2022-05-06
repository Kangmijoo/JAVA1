/* 2���� ��� arr1�� arr2�� �Է¹޾�, arr1�� arr2�� ���� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
 * �Է� : [[1, 4], [3, 2], [4, 1]] [[3, 3], [3, 3]]	-> ��� : [[15, 15], [15, 15], [15, 15]]
 * �Է� : [[2, 3, 2], [4, 2, 4], [3, 1, 4]]	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	
 * -> ��� : [[22, 22, 11], [36, 28, 18], [29, 20, 14]]	*/
public class �����_���� {

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
