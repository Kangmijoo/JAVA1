import java.util.Arrays;
import java.util.HashSet;

public class ��_��_�̾Ƽ�_���ϱ� {

	class Solution {
	    public Integer[] solution(int[] numbers) {
	        HashSet<Integer> set = new HashSet<Integer>();
			//���Ҹ��� ���� �� �迭�� �ֱ�(�ߺ� ����)
		    for(int i = 0; i < numbers.length; i++) {
		        for(int j = i+1; j < numbers.length; j++) {
		            set.add(numbers[i]+numbers[j]);
		        }
		    }
	        
	        //�迭�� ��ȯ�� �������� ����
	        Integer[] answer = set.toArray(new Integer[0]);
	        Arrays.sort(answer);
		        
		    return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
