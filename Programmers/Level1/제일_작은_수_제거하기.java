/* ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ� �����. ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
 * �Է� : [4,3,2,1]	-> ��� : [4,3,2]	 / �Է� : [10]  -> ��� : [-1]		*/
import java.util.*;

public class ����_����_��_�����ϱ� {

	class Solution {
	    public List<Integer> solution(int[] arr) {        
	        //�迭 ũ�Ⱑ 1�̶�� -1 ���
			if(arr.length == 1) {
				ArrayList<Integer> list = new ArrayList<Integer>();
	            list.add(-1);
	            return list;
			}
			
	        //���� ���� �� ���ϱ�
			int min = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			
			//���� �� �� list
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == min) {
					continue;
				} 
				list.add(arr[i]);
			}
	        
	        return list;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
