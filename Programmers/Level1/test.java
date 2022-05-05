
import java.util.*;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		int[][] land = {{1,2,5,3},{5,6,8,7},{4,3,2,1}};
		int answer = 0;
		
		int k = -1;
        for(int i = 0; i < land.length; i++) {
            int cnt = 0;
            //가장 큰 수 구하기
            for(int j = 0; j < 4; j++) {
            	if(j == k) {
            		continue;
            	}
                if(land[i][j] >= cnt) {
                    cnt = land[i][j];
                }
            }
            //다음번에 제외할 인덱스 번호
            for(k = 0; k < 4; k++) {
            	if(land[i][k] == cnt) {
            		break;
            	}
            }
            answer += cnt;
        }
		
		System.out.println(answer);
	}

}
