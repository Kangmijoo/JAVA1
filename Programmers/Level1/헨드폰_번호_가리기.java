/*�Է� : 01033334444	-> ��� : *******4444	*/
public class �����_��ȣ_������ {

	class Solution {
	    public String solution(String phone_number) {
	        String answer = "";
	        
	        char[] star = new char[phone_number.length()];
	        for(int i = 0; i < phone_number.length(); i++) {
	            //�ڿ� 4�ڸ� �������� * �־��ֱ�
	            if(i < phone_number.length()-4) {
	                star[i] = '*';
	            } 
	            //4�ڸ� �Ǹ� ���� �״�� �ֱ�
	            else {
	                star[i] = phone_number.charAt(i);   
	            }
	            //char�� �ϳ��� string���� �ֱ�
	            answer += Character.toString(star[i]);
	        }
	        
	        return answer;
	    }
	}
}
