/* 1-1. 입력된 수가 짝수라면 2로 나눕니다.  1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 * 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요. 
 * 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
 * 입력 : 6	-> 출력 : 8	/ 입력 : 16	-> 출력 :4	/ 입력 : 626331	-> 출력 : -1	*/
public class 콜라츠_추측 {

	class Solution {
	    public int solution(long num) {
	        int answer = 0;
	        
	     	//1이 될 때 까지 반복
	        while(num != 1) {   
	            if(num % 2 == 0) {  //짝수일 때
	                num /= 2;
	                answer++;
	            } else {            //홀수일 때
	                num = num*3+1;
	                answer++;
	            }
	            //500번 이상 넘어가면 -1출력
	            if(answer > 499) {
	                answer = -1;
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
