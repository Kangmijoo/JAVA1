/* ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ� ���. s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ ����.
 * �Է� : "Zbcdefg"	-> ��� : "gfedcbZ"	*/
import java.util.*;

public class ���ڿ�_������������_��ġ�ϱ� {

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        //���� �ϳ��ϳ� ������ �ƽ�Ű�ڵ�� ��ȯ
	        int[] asc = new int[s.length()];
			for(int i = 0; i < s.length(); i++) {
				asc[i] = s.charAt(i);
			}
			
	        //�ƽ�Ű�ڵ带 ū�ͺ��� ���� ������ �����ؼ� ���ڷ� ��ȯ
			Arrays.sort(asc);
			for(int i = s.length()-1; i >= 0; i--) {
				answer += (char)asc[i];
			}
			
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
