/* 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다.
 * 가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
 * 입력 : [[60, 50], [30, 70], [60, 30], [80, 40]]	-> 출력 : 4000
 * 입력 : [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	-> 출력 : 120		*/
public class 최소직사각형 {

	class Solution {
	    public int solution(int[][] sizes) {
	        int w = 0;
			int h = 0;
			
			for(int i = 0; i < sizes.length; i++) {
				//w, h나누기	긴 쪽이 w, 짧은 쪽은 h
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
