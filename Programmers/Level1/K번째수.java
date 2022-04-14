/* �迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�. 
 * array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶�� (1)array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�. 
 * (2)1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�. (3)2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
 * �Է� : [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	-> ��� : [5, 6, 3]	*/
import java.util.Arrays;

public class K��°�� {

	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
			int[] answer = new int[commands.length];
	        
			int[] result = {};
			for(int i = 0; i < commands.length; i++) {	//ù��° �迭���� ���
				//(1)�迭 �ڸ���
				result = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
				//(2)�迭 ����
				Arrays.sort(result);
				//(3)�ش� ��ġ ��������
				answer[i] = result[commands[i][2]-1];
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
