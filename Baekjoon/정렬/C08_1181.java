/* ���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���̰� ª�� �ͺ���, ���̰� ������ ���� ������ 
 * �Է� : 13 \ but \ i \ wont \ hesitate \ no \ more \ no \ more \ it \ cannot \ wait \ im \ yours
 * ��� : i \ im \ it \ no \ but \ more \ wait \ wont \ yours \ cannot \ hesitate		*/
import java.util.*;

public class C08_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();		
		String s = "";
		for(int i = 0; i < N; i++) {
			s = sc.nextLine();
			list.add(s.length()+s);
		}
		sc.close();
		
		
		System.out.println(list);
	}

}
