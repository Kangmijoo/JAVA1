/* � �������� �ֽ��ϴ�. �� �������� ������ ���ʴ�� ���� ���� �迭 absolutes�� �� �������� ��ȣ�� ���ʴ�� ���� �Ҹ��� �迭 signs�� �Ű������� �־����ϴ�. 
 * ���� �������� ���� ���Ͽ� return �ϵ��� solution �Լ��� �ϼ����ּ���. (true�� +, false�� -)
 * �Է� : [4,7,12] [true,false,true]	-> ��� : 9	/ �Է� : [1,2,3] [false,false,true]	-> ��� : 0	*/
public class ����_���ϱ� {

	class Solution {
	    public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        
	        for(int i = 0; i < absolutes.length; i++) {
	            if(signs[i] == true) {
	                answer += absolutes[i];
	            } else {
	                answer -= absolutes[i];
	            }
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
