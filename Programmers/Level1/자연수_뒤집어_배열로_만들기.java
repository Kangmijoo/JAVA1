/* �ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.
 * �Է� : 12345	-> ��� : [5,4,3,2,1]		*/
public class �ڿ���_������_�迭��_����� {
	
	class Solution {
	    public long[] solution(long n) {
			String a = String.valueOf(n);
			long[] answer = new long[a.length()];
			
			int i = 0;
			while(i < a.length()) {
				answer[i] = n % 10;
				n = n / 10;
				i++;
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
