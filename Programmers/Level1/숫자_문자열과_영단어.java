/* ������ �Ϻ� �ڸ����� ���ܾ�� �ٲ�����ų�, Ȥ�� �ٲ��� �ʰ� �״���� ���ڿ� s�� �־���. s�� �ǹ��ϴ� ���� ���ڸ� return �ϵ��� solution �Լ��� �ϼ�.
 * �Է� : "one4seveneight"	-> ��� : 1478	/ �Է� : "23four5six7"	-> ��� : 234567
 * �Է�  : "2three45sixseven"	-> ��� : 234567	/ �Է� : "123"	-> ��� : 123		*/
public class ����_���ڿ���_���ܾ� {

	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        String[] n = {"0","1","2","3","4","5","6","7","8","9"};
	        String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	        
	        for(int i = 0; i < 10; i++) {
	            s = s.replace(word[i], n[i]);
	        }
	        
	        answer = Integer.parseInt(s);
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
