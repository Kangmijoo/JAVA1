/* �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * ���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ���. ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� ��
 * �Է� : "try hello world"	-> ��� : "TrY HeLlO WoRlD"	*/
public class �̻���_����_����� {

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        s = s.toLowerCase();    //��� �ҹ��ڷ� ��ȯ
			
			int j = 0;
			for(int i = 0; i < s.length(); i++) {
				//space�� j -1�� �ʱ�ȭ
				if(s.charAt(i) == ' ') {    
					j = -1;
				}
				//¦/Ȧ�� �ε��� �Ǵ�
				if(j % 2 == 0) {    //¦���� �빮�ڷ� ��ȯ
					answer += s.toUpperCase().charAt(i);
				} else {    //Ȧ���� �ҹ��� �״��
					answer += s.charAt(i);
				}
				j++;
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
