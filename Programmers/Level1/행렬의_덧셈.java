/* ����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�. 
 * 2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ� �����. ��� arr1, arr2�� ��� ���� ���̴� 500�� ���� ����.
 * �Է� : [[1,2],[2,3]]  [[3,4],[5,6]]	 -> ��� : [[4,6],[7,9]]
 * �Է� : [[1],[2]]  [[3],[4]]	 -> ��� : [[4],[6]]		*/
public class �����_���� {

	class Solution {
	    public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr2[0].length];
			
			for(int i = 0; i < arr1.length; i++) {
				for(int j = 0; j < arr2[0].length; j++) {
					answer[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
