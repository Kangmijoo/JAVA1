/* �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ�. ������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
 * N�� ���� : 100,000,000 ������ �ڿ���		�Է� : 123	-> ��� : 6	/ �Է� : 987	-> ��� : 24	*/
public class �ڸ���_���ϱ� {

	public class Solution {
	    public int solution(int n) {
	        int answer = 0;

	        while(n != 0) {
	            answer += n % 10;
	            n /= 10;
	        }

	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
