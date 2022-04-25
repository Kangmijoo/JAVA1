/* 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요. 
 * 입력 : ["leo","kiki","eden"]	["eden","kiki"]	-> 출력 :	"leo"
 * 입력 : ["marina","josipa","nikola","vinko","filipa"] ["josipa","filipa","marina","nikola"]	-> 출력 : "vinko"
 * 입력 : ["mislav","stanko","mislav","ana"]	["stanko","ana","mislav"]	-> 출력 : "mislav" */
import java.util.*;

public class 완주하지_못한_선수 {

	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        //두 배열 정렬
	        Arrays.sort(participant);
			Arrays.sort(completion);
			
			//배열에서 없는 선수 인덱스 구하기
			int i = 0; 
			for(i = 0; i < completion.length; i++) {
				if(!participant[i].equals(completion[i])) {
					break; 
				}
			}
			
			answer = participant[i];
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
