/* array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
 * divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
 * �Է� : [5, 9, 7, 10]	5	-> ��� : [5, 10]	/ �Է� : [2, 36, 1, 3] 1	-> ��� : [1, 2, 3, 36]	*/
import java.util.*;

public class ������_��������_����_�迭 {

	class Solution {
	    public List<Integer> solution(int[] arr, int divisor) {
	        ArrayList<Integer> answer = new ArrayList<>(); 
			//����
			Arrays.sort(arr);
			
			//������ �������� list�� �� �ֱ�
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % divisor == 0) {
					answer.add(arr[i]);
				}
			}
	        
	        //������ �������� ���� ������ -1
			if(answer.isEmpty()) {
				answer.add(-1);
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
