/* ���̱ⱸ�� ���� �̿��� price�� �ε�, ���̱ⱸ�� N �� ° �̿��Ѵٸ� ���� �̿���� N�踦 �ޱ�� �Ͽ����ϴ�. 
 * ��, ó�� �̿�ᰡ 100�̾��ٸ� 2��°���� 200, 3��°���� 300���� ����� �λ�˴ϴ�.
 * ���̱ⱸ�� count�� Ÿ�� �Ǹ� ���� �ڽ��� ������ �ִ� �ݾ׿��� �󸶰� ���ڶ������ return.��, �ݾ��� �������� ������ 0�� return �ϼ���.
 * �Է� : price:3, money:20, count:4	-> ��� :	10		*/
public class ������_�ݾ�_����ϱ� {
	
	class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = 0;
	        
	        for(int i = 1; i <= count; i++) {
	            answer += price*i;
	        }
	        
	        if(answer < money) {	//�ݾ��� �������� ������
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
