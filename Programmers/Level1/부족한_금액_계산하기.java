/* 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다. 
 * 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
 * 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return.단, 금액이 부족하지 않으면 0을 return 하세요.
 * 입력 : price:3, money:20, count:4	-> 출력 :	10		*/
public class 부족한_금액_계산하기 {
	
	class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = 0;
	        
	        for(int i = 1; i <= count; i++) {
	            answer += price*i;
	        }
	        
	        if(answer < money) {	//금액이 부족하지 않으면
	            answer = 0;
	        } else {
	            answer = answer-money;
	        }

	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
