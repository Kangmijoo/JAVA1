/* �ڿ��� n�� �Ű������� �־����ϴ�. n�� x�� ���� �������� 1�� �ǵ��� �ϴ� ���� ���� �ڿ��� x�� return �ϵ��� solution �Լ��� �ϼ����ּ���. 
 * ���� �׻� �������� ����� �� �ֽ��ϴ�.	 	�Է� : 10	 -> ��� : 3	/ �Է� : 12	-> ��� : 11	*/
public class ��������_1��_�Ǵ�_��_ã�� {

	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        for(int i = 2; i < n; i++) {
	            if(n % i == 1) {
	                answer = i;
	                break;
	            }
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		

	}

}
