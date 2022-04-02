/* ���̾� ��ȭ��. ���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.
 * ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. ��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ���� ���, UNUCIC�� 868242�� ����.
 * �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. �ܾ��� ���̴� 2���� ũ�ų� ����, 15���� �۰ų� ����.
 * �Է� : WA	-> ��� : 13	/ �Է� : UNUCIC	-> ��� : 36		
 * ps : A~C : 2, D~f : 3, G~I : 4, J~L : 5, M~O : 6, P~S : 7, T~V : 8, W~Z : 9	*/
import java.util.Scanner;

public class C08_5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		int count = 0;		//���ڴ� �ɸ��� �ð� �߰��ؼ� ���� ����
		char[] ch = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);	//���� �ϳ��� ������
			
			switch(ch[i]) {
			case 'A' : case 'B' : case 'C' :
				ch[i] = 3;
				break;
			case 'D' : case 'E' : case 'F' :
				ch[i] = 4;
				break;
			case 'G' : case 'H' : case 'I' :
				ch[i] = 5;
				break;
			case 'J' : case 'K' : case 'L' :
				ch[i] = 6;
				break;
			case 'M' : case 'N' : case 'O' :
				ch[i] = 7;
				break;
			case 'P' : case 'Q' : case 'R' : case 'S' :
				ch[i] = 8;
				break;
			case 'T' : case 'U' : case 'V' :
				ch[i] = 9;
				break;
			case 'W' : case 'X' : case 'Y' : case 'Z' :
				ch[i] = 10;
				break;
			}
			count += ch[i];
			
		}
		
		System.out.println(count);
	}

}
