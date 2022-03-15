/* [����/���ý��౸��] ���� �Էµ� �� ���� �̸��� ��µǵ��� �غ���.
 * 12, 1, 2 : winter / 3, 4, 5 : spring / 6, 7, 8 : summer / 9, 10, 11 : fall 
 * �Է� : 12	 -> ��� : winter		*/
import java.util.Scanner;

public class C1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		String weather = "";
		switch(a) {
			case 12 : case 1 : case 2 :
				weather = "winter";
				break;
			case 3 : case 4 : case 5 :
				weather = "spring";
				break;
			case 6 : case 7 : case 8 :
				weather = "summer";
				break;
			case 9 : case 10 : case 11 :
				weather = "fall";
				break;
			default : 
				weather = "?";
				break;
		}
		
		System.out.println(weather);

	}

}
