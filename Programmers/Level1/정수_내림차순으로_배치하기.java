/* �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
 * �Է� : 118372	-> ��� : 873211	*/
import java.util.*;

public class ����_������������_��ġ�ϱ� {

	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        
	        String num = String.valueOf(n);
			String ans = "";
			char[] arr = new char[num.length()];
			//���� �ϳ��� �迭�� �־��ֱ�
			for(int i = 0; i < num.length(); i++) {
				arr[i] = num.charAt(i);
			}
			
			//������������ ����
			Arrays.sort(arr);
			//string�� ������ ���ں��� �־��ֱ� -> ��������
			for(int i = num.length()-1; i >= 0; i--) {
				ans += arr[i];
			}
			
			//string�� long���� ��ȯ
	        answer = Long.parseLong(ans);
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		
	}

}
