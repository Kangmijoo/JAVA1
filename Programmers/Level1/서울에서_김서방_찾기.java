/* String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. 
 * seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�. 
 * �Է� : ["Jane", "Kim"]		-> ��� : "�輭���� 1�� �ִ�"		*/
public class ���￡��_�輭��_ã�� {

	class Solution {
	    public String solution(String[] seoul) {
	        String answer = "";
	        
	        for(int i = 0; i < seoul.length; i++) {
	            if(seoul[i].equals("Kim")) {
	                answer = "�輭���� "+i+"�� �ִ�";
	                break;
	            }
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
