/* �� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * ���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.*/
public class ��_����_������_�� {

	class Solution {
	    public long solution(int a, int b) {
	        long answer = 0;
	        
	        if(a > b) {
	            for(int i = b; i <= a; i++) {
	                answer += i;
	            }
	        } else if(b > a) {
	            for(int i = a; i <= b; i++) {
	                answer += i;
	            }
	        } else {
	            answer = a;
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
