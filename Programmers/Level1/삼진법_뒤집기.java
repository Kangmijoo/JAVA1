/* �ڿ��� n�� �Ű������� �־����ϴ�. n�� 3���� �󿡼� �յڷ� ������ ��, �̸� �ٽ� 10�������� ǥ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 * 45	-> 3���� ��ȯ :1200		-> ������ : 0021	-> 10���� ��ȯ : 7
 * �Է� : 45	-> ��� :7	/ �Է� : 125	-> ��� : 229		*/
public class ������_������ {

	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        //3���� ��ȯ�� �յ� ����
	        String a = "";
	        while(n != 0) {     
	            int result = n % 3;     //n=45�϶� 0, 0, 2, 1
	            a += String.valueOf(result);
	            n = n / 3;      //15, 5, 1, 0
	        }
	        
	        //10�������� ǥ��
	        answer = Integer.parseInt(a, 3);
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
