/* �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
 * ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�.
 * �Է� : [1, 1, 3, 3, 0, 1, 1] 	-> ��� : [1, 3, 0, 1]	/ �Է� : [4, 4, 4, 3, 3]	 -> ��� : [4, 3] */
import java.util.*;
	
public class ����_���ڴ�_�Ⱦ� {

	public class Solution {
	    public List<Integer[]> solution(int []arr) {
	        //arr�迭 ũ�⸸ŭ ���� ����� �α�
			Integer[] answer = new Integer[arr.length];

			//answer 0��° �ε������� arr 0��° �ε��� �� �ֱ�
	    	answer[0] = arr[0];
	    	
	    	//�ߺ� ���� �����ϰ� �� �������� null�� ����
	    	int j = 1;
	        for(int i = 1; i < arr.length; i++) {
	        	if(arr[i] != arr[i-1]) {
	        		answer[j] = arr[i];
	            	j++;
	            } 
	        }
	        
	        //null�� ���ֱ�
	        List<Integer[]> list = new ArrayList(Arrays.asList(answer));
	        list.removeAll(Collections.singletonList(null));

	        return list;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
