/* 16������ �Էµ� ���� 1���� 8������ �ٲپ� ����غ���. 
 * �Է� : f	-> ��� : 17	*/
import java.util.Scanner;
import java.io.*;

public class C1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(16);
		sc.close();
		
		System.out.printf("%o", num);

	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		int num = Integer.valueOf(str, 16);
//		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		bw.write(String.format("%o", num));
//		bw.flush();
//		bw.close();
//	}

}
