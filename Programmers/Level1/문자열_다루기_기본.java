/* ���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. 
 * ���� ��� s�� "a234"�̸� False�� �����ϰ� "1234"��� True�� �����ϸ� �˴ϴ�.		*/
public class ���ڿ�_�ٷ��_�⺻ {

	class Solution {
	    public boolean solution(String s) {
	        boolean answer = true;
	        
	        try {
	            //���̰� 4�Ǵ� 6�̸�
				if(s.length() == 4 || s.length() == 6) {   
	                 //s�� int������ �ٲٰ� ����� �ȴٸ� true(���ڰ� ����ִٸ� ������ �� ��)
		            if(Integer.parseInt(s) / 1 == Integer.parseInt(s)) {    
		                answer = true;
		            } 
		        } else {
	                answer = false;
	            }
			} catch (Exception e){  //���� ���ǿ� �ش���� �ʴ� ��� ���� false
				answer = false;
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
