/* [����/���ý��౸��] �򰡸� ����(A, B, C, D, ...)�� �Է¹޾� ������ �ٸ��� ����غ���. 
 * (A : best!!!, B : good!!, C : run!, D : slowly~, ������ ���ڵ� : what? 
 * �Է� : A	-> ��� : best!!!		*/
import java.util.Scanner;

public class C1069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		sc.close();
		
		String str = "";
		switch (a) {
			case "A" : 
				str = "best!!!";
				break;
			case "B" : 
				str = "good!!";
				break;
			case "C" : 
				str = "run!";
				break;
			case "D" : 
				str = "slowly~";
				break;
			default : 
				str = "what?";
				break;
		}
		
		System.out.println(str);
		
	}

}
