/* �Էµ� ������ ��ȣ�� �ٲ� ����غ���. ��, -2147483647 ~ +2147483647 ������ ������ �Էµȴ�.
 * �Է� : -1	-> ��� : 1	*/
import java.util.Scanner;
import java.io.*;
public class C1040 {
	/* ex1 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(-num+ "");
//2.	bw.write(String.valueOf(-num));
//3.	bw.write(new Integer(-num).toString());
		bw.flush();
		bw.close();
	}
	
	/* ex2 */
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int num = sc.nextInt();
//	sc.close();
//	
//	System.out.println(-num);
//
//}

}
