/* [��Ʈ����������] �Է� �� ������ ��Ʈ������ ��/������ �ٲ� �� ������ ����غ���. ��Ʈ ������ 1 -> 0, 0 -> 1�� �ٲ� �� �� ���� 10������ ����Ѵ�.
 * �Է� : 2	-> ��� : -3		*/
import java.io.*;
import java.util.Scanner;

public class C1059 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(~a));
		bw.flush();
		bw.close();
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		System.out.printf("%d", ~a);
//		
//	}

	
}
