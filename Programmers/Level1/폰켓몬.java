/* �� N ������ ���ϸ� �߿��� N/2������ �������� ���ٰ� �߽��ϴ�. ȫ �ڻ�� �������� ���ϸ��� ������ ���� ��ȣ�� �ٿ� �����մϴ�. 
 * ���� ���� ������ ���ϸ��� ���� ��ȣ�� ������ �ֽ��ϴ�. ���� ��� �����ǿ� �� 4������ ���ϸ��� �ְ�, 
 * �� ���ϸ��� ���� ��ȣ�� [3��, 1��, 2��, 3��]�̶�� �̴� 3�� ���ϸ� �� ����, 1�� ���ϸ� �� ����, 2�� ���ϸ� �� ������ ������ ��Ÿ���ϴ�. 
 * �̶�, 4������ ���ϸ� �� 2������ ���� ����� ������ ���� 6������ �ֽ��ϴ�.
 * �Է� : [3,1,2,3]	-> ��� : 2	/ �Է� : [3,3,3,2,2,4]	-> ��� : 3	/ �Է� : [3,3,3,2,2,2]	-> ��� : 2	*/
import java.util.*;
public class ���ϸ� {

	class Solution {
	    public int solution(int[] nums) {
	        int answer = 0;
	        
	        //�ߺ� �����ؼ� �� �ֱ�
	        HashSet<Integer> h = new HashSet<>();
			for(int i = 0; i < nums.length; i++) {
				h.add(nums[i]);
			}
			
			//�� ���
			if(h.size() >= nums.length/2) {
				answer = nums.length/2;
			} else {
				answer = h.size();
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
