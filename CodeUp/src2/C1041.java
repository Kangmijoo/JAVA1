/* ������ 1���� �Է¹޾� �� ���� ���ڸ� ����غ���. ������ 'A'�� ���� ���ڴ� 'B'�̰�, ������ '0'�� ���� ���ڴ� '1'�̴�.
 * �Է� : a	-> ��� : b	*/
import java.io.*;
import java.util.Scanner;
public class C1041 {
	/* ex1 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		int i = (int)ch+1;
		char ascii = (char)i;
		
		System.out.println(ascii);
		
		sc.close();
	}
	
	/* ex2 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char ch = sc.nextLine().charAt(0);
//		sc.close();
//		System.out.printf("%c", ch+1);
//	}
	
	/* ex3 */
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		char ch = br.readLine().charAt(0);
//		int i = (int)ch+1;
//		char ascii = (char)i;
//		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		bw.write(ascii);
//		bw.flush();
//		bw.close();
//	}

}
