/* �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
 * 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
 * �Է� : pPoooyY -> ��� : true	/ �Է� : Pyy -> ��� : false		*/
public class ���ڿ�_��_p��_y��_���� {
	
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        s = s.toLowerCase();	//���ڿ� �ҹ��ڷ� ��ȯ
	        
	        int cnt_p = 0;	//p ����
	        int cnt_y = 0;	//y ����
	        for(int i = 0; i < s.length(); i++) {
	            if(s.charAt(i) == 'p') {
	                cnt_p++;
	            } 
	            if(s.charAt(i) == 'y') {
	                cnt_y++;
	            } 
	        }
	        
	        if(cnt_p == cnt_y) {
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
