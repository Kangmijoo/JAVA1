/* ��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost, ������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��, 
 * ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * �Է� : 5	[2, 4]	[1, 3, 5]	-> ��� : 5	/ �Է� : 5	[2, 4]	[3]	-> ��� : 4
 * �Է� : 3	[3]	[1]	-> ��� : 2	*/
import java.util.*;
public class ü���� {

	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        int answer = n-lost.length;	//ü���� ���Ҿ���� ��� ��
	        
	        Arrays.sort(lost);
	        Arrays.sort(reserve);
	        
	        //���� ������ �л��� ���� ������ ���
	        for(int i = 0; i < lost.length; i++) {
	            for(int j = 0; j < reserve.length; j++) {
	                if(lost[i] == reserve[j]) {
	                    reserve[j] = -10;
	                    lost[i] = -10;
	                    answer++;
	                    break;
	                }
	            }
	        }
	        
	        //���� ���� �л��� ���� ������ �л����� ���� ���
	        for(int i = 0; i < lost.length; i++) {
	            for(int j = 0; j < reserve.length; j++) {
	                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
	                    answer++;
	                    reserve[j] = -10;
	                    break;
	                }
	            }
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
