/* ���̰� n�̰�, "���ڼ��ڼ��ڼ�...."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
 * ������� n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� �˴ϴ�. 	�Է� : 3	-> ���ڼ�	/ �Է� : 4	-> ��� : ���ڼ���	*/
public class ���ڼ��ڼ��ڼ��ڼ��ڼ� {
	class Solution {
	    public String solution(int n) {
	        String answer = "";
	        
	        for(int i = 0; i < n/2+1; i++) {
	            answer += "����";
	        }
	        answer = answer.substring(0, n);    //���� n���� ��������
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
