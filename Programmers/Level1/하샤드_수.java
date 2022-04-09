/* 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 * 입력 : 10	-> 출력 : true	/ 입력 : 12	-> 출력 : true	/ 입력 : 11	-> 출력 : false	*/
public class 하샤드_수 {

	class Solution {
	    public boolean solution(int x) {
	        boolean answer = true;
	        String origin = String.valueOf(x);  //x를 문자열로 변환
	        int sum = 0;    //자릿수의 합
	        
	        //한 자리씩 가져와서 더해주기
	        char[] ch = new char[origin.length()];
	        for(int i = 0; i < origin.length(); i++) {
	            ch[i] = origin.charAt(i);   
	            sum += Integer.parseInt(String.valueOf(ch[i]));
	        }
	        
	        //나누어 떨어지는지 여부
	        if(x % sum == 0) {  
	            answer = true;
	        } else {
	            answer = false;
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
