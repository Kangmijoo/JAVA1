/* 8������ �Էµ� ���� 1���� 10������ �ٲپ� ����غ���.
 * �Է� : 13 	-> ��� : 11	*/
import java.io.*;
import java.util.Scanner;

public class C1034 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.valueOf(str, 8);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.format("%d", a));
		bw.flush();
		bw.close();
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt(8);	//�����̸� 10����, ���� ������ �ش� �������� ����
//		
//		System.out.printf("%d", num);
//		
//		sc.close();
//	}

}
