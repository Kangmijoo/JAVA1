/* ���̰� ���� �迭 A, B �ΰ�. �迭 A, B���� ���� �� ���� ���ڸ� �̾� �� ���� ����. �̷��� ������ �迭�� ���̸�ŭ �ݺ��ϸ�, �� ���� ���� ���� �����Ͽ� ����. 
 * �̶� ���������� ������ ���� �ּҰ� �ǵ��� ����� ���� ��ǥ. (��, �� �迭���� k��° ���ڸ� �̾Ҵٸ� ������ k��° ���ڴ� �ٽ� ���� �� ����.)
 * �Է� : [1, 4, 2]	[5, 4, 4]	-> ��� : 29	/ �Է� : [1,2]	[3,4]	-> ��� : 10	*/
import java.util.*;

public class �ּڰ�_����� {

	class Solution {
	    public int solution(int []A, int []B) {
	        int answer = 0;

	        //����
	        Arrays.sort(A);
	        Arrays.sort(B);
	        
	        for(int i = 0; i < A.length; i++) {
	        	//A�� ���� ������ B�� ū ������ �����ֱ�
	            answer += A[i]*B[B.length-1-i];
	        }

	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		
	}

}
