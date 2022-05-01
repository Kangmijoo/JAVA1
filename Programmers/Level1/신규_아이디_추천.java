/* 7�ܰ��� �������� ó�� ������ ���� �ű� ������ �Է��� ���̵� īī�� ���̵� ��Ģ�� �´� �� �˻��ϰ� ��Ģ�� ���� ���� ��� ��Ģ�� �´� ���ο� ���̵� ��õ
 * �Է� : ...!@BaT#*..y.abcdefghijklm	- > ��� : "bat.y.abcdefghi" / �Է� : =.=	 -> ��� : aaa	/
 * �Է� : z-+.^.	-> ��� : z--	/ �Է� : 123_.def	-> ��� : 123_.def	/ 
 * �Է� : abcdefghijklmn.p	-> ��� : abcdefghijklmn		*/
public class �ű�_���̵�_��õ {

	class Solution {
	    public String solution(String new_id) {
	        //1. �빮�� -> �ҹ���
			String id = new_id.toLowerCase();
			//2. �ҹ���, ����, (-), (_), (.) ���� ��� �����
			id = id.replaceAll("[^-_.a-z0-9]", "");
			//3. ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ
			id = id.replaceAll("[.]{2,}", ".");
			//4. ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ����
			id = id.replaceAll("^[.]|[.]$", "");
			//5. �� ���ڿ��̶��, new_id�� "a"�� ����
			if(id.equals("")) {
				id += "a";
			}
			//6. 16�� �̻��̸�, ù 15���� ���ڸ� ������ ������ ���� ��� ����. ���� �� ��ħǥ(.)�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� ����
			if(id.length() >= 16) {
				id = id.substring(0, 15);
				id = id.replaceAll("^[.]|[.]$", "");
			}
			//7. ���̰� 2�� ���϶��, ������ ���ڸ� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ����
			if(id.length() <= 2) {
				while(id.length() < 3) {
					id += id.charAt(id.length()-1);				
				}
			}
	        
	        return id;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
