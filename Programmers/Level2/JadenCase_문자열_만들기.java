/* ��� �ܾ��� ù ���ڰ� �빮���̰�, �� ���� ���ĺ��� �ҹ����� ���ڿ� �����. ��, ù ���ڰ� ���ĺ��� �ƴ� ������ �̾����� ���ĺ��� �ҹ��ڷ� ���� ��. 
 * �Է� : 3people unFollowed me	-> ��� : 3people Unfollowed Me
 * �Է� : for the last week	-> ��� : For The Last Week	*/
public class JadenCase_���ڿ�_����� {

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        //��� �ҹ��ڷ� ��ȯ
	        s = s.toLowerCase();
	        
			for(int i = 0; i < s.length(); i++) {
				//ù��° ���ĺ� Ȥ�� ���� ���Ⱑ �ִ� �˹����� �빮�ڷ� ��ȯ
				if(i == 0 || s.charAt(i-1) == ' ') {
					answer += s.toUpperCase().charAt(i);
				} 
				//�� �ܿ��� ��� �״�� ���
				else {	
					answer += s.charAt(i);				
				}
			}
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
