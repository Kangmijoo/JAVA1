/* ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� ��. 
 * ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������. 1.������ �ƹ��� �о �����Դϴ�. 
 * 2.s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�. 3.s�� ���̴� 8000�����Դϴ�. 4.n�� 1 �̻�, 25������ �ڿ����Դϴ�.
 * �Է� : AB	1	-> ��� : BC	/ �Է� : z  1	 -> ��� : a	/ �Է� : a B z	4	-> ��� : e F d	*/
public class ����_��ȣ {

	class Solution {
	    public String solution(String s, int n) {
	        String answer = "";
	        
	        int a = 0;
	        for(int i = 0; i < s.length(); i++) {
	        	//�ƽ�Ű�ڵ� ��ȯ
	        	if(s.charAt(i) == ' ') {
	        		a = 32;     //space �����̸�
	        	} else {
	        		a = (int)s.charAt(i)+n;
	        	}
	            //z�� Z�� �Ѿ �� a�� A�� �����ϵ��� ����
	            if(a > 122 || (s.charAt(i) < 91 && a > 90)) { 
	            	a = a - 26;
	            }
	            answer += (char)a;
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
