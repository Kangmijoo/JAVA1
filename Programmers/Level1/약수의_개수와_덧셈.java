/* �� ���� left�� right�� �Ű������� �־����ϴ�. left���� right������ ��� ���� �߿���, ����� ������ ¦���� ���� ���ϰ�, 
 * ����� ������ Ȧ���� ���� �� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 * �Է� : 13 17	-> ��� : 43	/ �Է� : 24 27  -> ��� : 52	*/
public class �����_������_���� {

	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;
	        int cnt = 0;
	        //left���� right����
	        for(int i = left; i <= right; i++) { 
	            for(int j = 1; j <= i; j++) { 
	                //����� ���� ���ֱ�
	                if(i % j == 0) {
	                    cnt++;  
	                }
	            }
	            //����� ������ ¦���̸� +
	            if(cnt % 2 == 0) {  
	                answer += i;
	            } 
	            //����� ������ Ȧ���̸� -
	            else {    
	                answer -= i;
	            }
	            //cnt �ʱ�ȭ�ϰ� �ٽ� ī��Ʈ �� �غ�
	            cnt = 0;    
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
