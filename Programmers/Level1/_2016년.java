/* 2016년 1월 1일은 금요일. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 구하기. 
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
 * 입력 : 5	24	-> 출력 : "TUE"	*/
public class _2016년 {

	class Solution {
	    public String solution(int a, int b) {
	        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	        
	        int date = 0;
	        //총 날짜 계산
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
