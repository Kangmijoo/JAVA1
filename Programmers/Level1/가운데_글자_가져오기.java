/* �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
 * �Է� : abcde	-> ��� : c	/ �Է� : qwer	 -> ��� : we		*/
public class ���_����_�������� {
	
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        //str�迭�� ���� �ϳ��� �־��ֱ�
	        String[] str = new String[s.length()];
	        for(int i = 0; i < s.length(); i++) {
	            str[i] = Character.toString(s.charAt(i));
	        }
	        
	        //�߰� ���� ����� ��
	        int turn = s.length()/2;
	        
	        //�߰� ���� ��������
	        if(s.length() % 2 == 0) {	//¦��
	            for(int i = -1; i < 1; i++) {
	                answer += str[turn+i];
	            }
	        } else {	//Ȧ��
	            answer = str[turn];
	        }
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
