/* �����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
 * �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���. 
 * �Է� : ["leo","kiki","eden"]	["eden","kiki"]	-> ��� :	"leo"
 * �Է� : ["marina","josipa","nikola","vinko","filipa"] ["josipa","filipa","marina","nikola"]	-> ��� : "vinko"
 * �Է� : ["mislav","stanko","mislav","ana"]	["stanko","ana","mislav"]	-> ��� : "mislav" */
import java.util.*;

public class ��������_����_���� {

	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        //�� �迭 ����
	        Arrays.sort(participant);
			Arrays.sort(completion);
			
			//�迭���� ���� ���� �ε��� ���ϱ�
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
