/* �پ��� ���� ũ���� ���Ե��� ��� ������ �� �����鼭, �۾Ƽ� ��� �ٴϱ� ���� ������ ������ �մϴ�.
 * ���� �� ���� ���̿� ���� ���̰� ���� 80, 70�̱� ������ 80(����) x 70(����) ũ���� ������ ����� ��� ���Ե��� ������ �� �ֽ��ϴ�.
 * �Է� : [[60, 50], [30, 70], [60, 30], [80, 40]]	-> ��� : 4000
 * �Է� : [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	-> ��� : 120		*/
public class �ּ����簢�� {

	class Solution {
	    public int solution(int[][] sizes) {
	        int w = 0;
			int h = 0;
			
			for(int i = 0; i < sizes.length; i++) {
				//w, h������	�� ���� w, ª�� ���� h
				if(sizes[i][0] > sizes[i][1]) {	
					if(sizes[i][0]>=w) {	
						w = sizes[i][0];
					} 
					if(sizes[i][1]>=h) {
						h = sizes[i][1];
					}
				} else {
					if(sizes[i][0]>=h) {	
						h = sizes[i][0];
					} 
					if(sizes[i][1]>=w) {
						w = sizes[i][1];
					}
				}
			}
	        
	        return w*h;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
