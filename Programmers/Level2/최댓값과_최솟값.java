/* ���ڿ� s���� �������� ���е� ���ڵ��� ����Ǿ� ����. str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� �̸� "(�ּҰ�) (�ִ밪)"������ ���ڿ��� ��ȯ�ϴ� �Լ� �ϼ�
 * �Է� : 1 2 3 4		-> ��� : 1 4		/ �Է� : -1 -2 -3 -4	-> ��� : -4 -1	/ �Է� : -1 -1	-> ��� : -1 -1 	*/
import java.util.*;
public class �ִ񰪰�_�ּڰ� {

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        String[] n = s.split(" ");
			int[] num = new int[n.length];
			for(int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(n[i]);
			}
			Arrays.sort(num);
			answer = num[0]+" "+num[num.length-1];
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
