/*�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
 * ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.	x: 2	n :5	��� : [2,4,6,8,10]	*/
public class X��ŭ_������_�ִ�_n����_���� {

	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = {};
	        answer = new long[n];
	        
	        for(int i = 1; i <= n; i++) {
	            answer[i-1] = (long)x*i;
	        }
	        return answer;
	    }
	}
	
}
