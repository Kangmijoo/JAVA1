/* ������ 1�� �Է¹޾� 1��ŭ ���� ����غ���. (��, -2147483648 ~ +2147483647 �� ������ �Էµȴ�.)
 * �Է� : 2147483647	-> ��� : 2147483648	*/
import java.util.Scanner;
import java.io.*;
public class C1044 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(num+1));
		bw.flush();
		bw.close();
	}
	
	/* ex2 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long num = sc.nextLong();
//		sc.close();
//		
//		System.out.println(num+1);
//	}

}
