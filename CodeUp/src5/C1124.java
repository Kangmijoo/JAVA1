/* ȭ�н��� CxHy�� �÷� �Էµȴ�. C�� ���ڷ��� 12, H�� ���ڷ��� 1�� �Ѵ�. ���ڷ��� ����Ѵ�.
 * �Է� : C3H8	-> ��� : 44	*/
import java.util.Scanner;
import java.util.regex.*;

public class C1124 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
			
		//C�� H���� �� ���� -> C���ڷ�
		Pattern pattern = Pattern.compile("[C](.*?)[H]");
		Matcher matcher = pattern.matcher(str);
				
		int C = 0;
		while (matcher.find()) {  // ��ġ�ϴ� �� �ִٸ�  
		    C = Integer.parseInt(matcher.group(1));
		    if(matcher.group(1) ==  null)
		    	break;
		}
		
		//Ư������ ������ ���ڿ� -> H�ڿ� �� -> H���ڷ�
		int H = Integer.valueOf(str.substring(str.lastIndexOf("H")+1));
		
		System.out.println(C*12+H*1);
	}

}
