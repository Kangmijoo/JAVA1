/* [��Ʈ����Ʈ����] ���� 1���� �Է¹޾� 2�� ���� ����غ���. 
 * �Է� : 1024  -> ��� : 2048	*/
import java.io.*;
import java.util.Scanner;

public class C1047 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(num<<1));
		bw.flush();
		bw.close();
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		
//		System.out.printf("%d", num<<1);
//	}

}
