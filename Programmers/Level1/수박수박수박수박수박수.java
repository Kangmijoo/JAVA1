/* 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다. 	입력 : 3	-> 수박수	/ 입력 : 4	-> 출력 : 수박수박	*/
public class 수박수박수박수박수박수 {
	class Solution {
	    public String solution(int n) {
	        String answer = "";
	        
	        for(int i = 0; i < n/2+1; i++) {
	            answer += "수박";
	        }
	        answer = answer.substring(0, n);    //글자 n개만 가져오기
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
