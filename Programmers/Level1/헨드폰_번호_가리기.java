/*입력 : 01033334444	-> 출력 : *******4444	*/
public class 헨드폰_번호_가리기 {

	class Solution {
	    public String solution(String phone_number) {
	        String answer = "";
	        
	        char[] star = new char[phone_number.length()];
	        for(int i = 0; i < phone_number.length(); i++) {
	            //뒤에 4자리 전까지는 * 넣어주기
	            if(i < phone_number.length()-4) {
	                star[i] = '*';
	            } 
	            //4자리 되면 숫자 그대로 넣기
	            else {
	                star[i] = phone_number.charAt(i);   
	            }
	            //char형 하나씩 string형에 넣기
	            answer += Character.toString(star[i]);
	        }
	        
	        return answer;
	    }
	}
}
