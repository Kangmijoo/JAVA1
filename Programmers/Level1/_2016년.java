/* 2016�� 1�� 1���� �ݿ���. 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� ���ϱ�. 
 * ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT
 * �Է� : 5	24	-> ��� : "TUE"	*/
public class _2016�� {

	class Solution {
	    public String solution(int a, int b) {
	        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	        
	        int date = 0;
	        //�� ��¥ ���
	        for(int i = 0; i < a-1; i++) {
	            date += month[i];
	        }
	        date += b - 1;
	        
	        return day[date%7];
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
