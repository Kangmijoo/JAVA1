/* 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수 구하기. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
 * 입력 : 3	12	-> 출력 : [3, 12]		/ 입력 : 2	5	-> 출력 : [1, 10]		*/
public class 최대공약수와_최소공배수 {

	class Solution {
	    public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        int big = Math.max(n, m);
	        int small = Math.min(n, m);
	        
	        answer[0] = gcd(big, small);
	        answer[1] = big*small/answer[0];
	        
	        return answer;
	    }
	    
	    int gcd(int a, int b) {
	        if(a % b == 0) {
	            return b;
	        }
	        return gcd(b, a%b);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
