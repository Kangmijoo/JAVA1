/*������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.*/
public class ���_���ϱ� {
 
	class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
	        
	        for(int i = 0; i < arr.length; i++) {
	            answer += arr[i];
	        }
	        
	        answer = answer/arr.length;
	        return answer;
	    }
	}
}
