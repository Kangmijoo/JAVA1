/* 0���� 9������ ���� �� �Ϻΰ� ����ִ� ���� �迭 numbers�� �Ű������� �־����ϴ�. 
 * numbers���� ã�� �� ���� 0���� 9������ ���ڸ� ��� ã�� ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 * �Է� : [1,2,3,4,6,7,8,0]	-> ��� : 14	/ �Է� : [5,8,4,0,6,7,9]	-> ��� : 6	*/
public class ����_����_���ϱ� {
	
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = 0;
	        
	        //check�迭�� ��� false�� �ʱ�ȭ
	        boolean[] check = new boolean[10];
	        for(int i = 0; i < 10; i++) {
	            check[i] = false;
	        }
	        
	        //numbers�迭�� �����ϴ� ���� check�迭 ��ġ�� true
	        for(int i = 0; i < numbers.length; i++) {
	            check[numbers[i]] = true;
	        }
	        
	        //false(numbers���� �������� �ʴ� ��)�̸� �����ֱ�
	        for(int i = 0; i < 10; i ++) {
	            if(check[i] == false) {
	                answer += i;
	            }
	        }
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
