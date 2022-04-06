/* 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.		*/
public class 문자열_다루기_기본 {

	class Solution {
	    public boolean solution(String s) {
	        boolean answer = true;
	        
	        try {
	            //길이가 4또는 6이며
				if(s.length() == 4 || s.length() == 6) {   
	                 //s를 int형으로 바꾸고 계산이 된다면 true(문자가 들어있다면 오류가 날 것)
		            if(Integer.parseInt(s) / 1 == Integer.parseInt(s)) {    
		                answer = true;
		            } 
		        } else {
	                answer = false;
	            }
			} catch (Exception e){  //위에 조건에 해당되지 않는 모든 값은 false
				answer = false;
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
