/* ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�. n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
 * n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���. 
 * �Է� : 121	 -> ��� : 144	/ �Է� : 3	-> ��� : -1	*/
public class ����_������_�Ǻ� {

	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        
	        for(long i = 1; i*i <= n; i++) {
	            if(i*i == n) {
	                answer = (i+1)*(i+1);
	                break;
	            } else {
	                answer = -1;
	            }
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
