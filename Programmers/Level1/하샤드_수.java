/* ���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
 * �ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.
 * �Է� : 10	-> ��� : true	/ �Է� : 12	-> ��� : true	/ �Է� : 11	-> ��� : false	*/
public class �ϻ���_�� {

	class Solution {
	    public boolean solution(int x) {
	        boolean answer = true;
	        String origin = String.valueOf(x);  //x�� ���ڿ��� ��ȯ
	        int sum = 0;    //�ڸ����� ��
	        
	        //�� �ڸ��� �����ͼ� �����ֱ�
	        char[] ch = new char[origin.length()];
	        for(int i = 0; i < origin.length(); i++) {
	            ch[i] = origin.charAt(i);   
	            sum += Integer.parseInt(String.valueOf(ch[i]));
	        }
	        
	        //������ ���������� ����
	        if(x % sum == 0) {  
	            answer = true;
	        } else {
	            answer = false;
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
