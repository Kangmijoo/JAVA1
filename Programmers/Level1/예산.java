/* �μ����� ��û�� �ݾ��� ����ִ� �迭 d�� ���� budget�� �Ű������� �־��� ��, �ִ� �� ���� �μ��� ��ǰ�� ������ �� �ִ��� �Լ��� �ϼ����ּ���.
 * d�� �μ����� ��û�� �ݾ��� ����ִ� �迭�̸�, ����(��ü �μ��� ����)�� 1 �̻� 100 �����Դϴ�.
 * d�� �� ���Ҵ� �μ����� ��û�� �ݾ��� ��Ÿ����, �μ��� ��û �ݾ��� 1 �̻� 100,000 ������ �ڿ����Դϴ�.
 * budget�� ������ ��Ÿ����, 1 �̻� 10,000,000 ������ �ڿ����Դϴ�.
 * �Է� : [1,3,2,5,4]	9	-> ��� : 3	/ �Է� : [2,2,3,3] 10	 -> ��� : 4	*/
import java.util.Arrays;

public class ���� {

	class Solution {
	    public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        
	        int cnt = 0;
	        for(int i = 0; i < d.length; i++) {
	        	answer += d[i];
	        	if(answer > budget) {
	        		break;
	        	}
	        	cnt++;
	        }
	        return cnt;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
