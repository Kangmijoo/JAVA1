/* ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� ����. 
 * ���� ��� strings�� ["sun", "bed", "car"]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� "u", "e", "a"�� strings�� �����մϴ�.
 * �Է� : ["sun", "bed", "car"]	1	-> ��� : ["car", "bed", "sun"]
 * �Է� : ["abce", "abcd", "cdx"]	2	-> ��� : ["abcd", "abce", "cdx"] */
import java.util.*;

public class ���ڿ�_��_�������_�����ϱ� {

	class Solution {
	    public String[] solution(String[] strings, int n) {
	        String[] answer = new String[strings.length];
	        
	        //������ ���� list �������(���Ƿ� �� �տ� n��° ���ĺ� �ٿ���)
	        ArrayList<String> list = new ArrayList<>();
	        for(int i = 0; i < strings.length; i++) {
	            list.add(strings[i].charAt(n) + strings[i]);
	        }
	        
	        //����
	        Collections.sort(list);
	        
	        //���Ƿ� �ٿ���� ���ĺ� ���ְ� ���
	        for(int i = 0; i < strings.length; i++) {
	            answer[i] = list.get(i).substring(1, list.get(i).length());
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
