/* �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ� ���ϱ�. �迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
 * �Է� : 3	12	-> ��� : [3, 12]		/ �Է� : 2	5	-> ��� : [1, 10]		*/
public class �ִ�������_�ּҰ���� {

	class Solution {
	    public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        int big = Math.max(n, m);
	        int small = Math.min(n, m);
	        
	        answer[0] = gcd(big, small);
	        answer[1] = big*small/answer[0];
	        
	        return answer;
	    }
	    
	    int gcd(int a, int b) {
	        if(a % b == 0) {
	            return b;
	        }
	        return gcd(b, a%b);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
