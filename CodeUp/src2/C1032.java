/* 10������ �Է¹޾� 16����(hexadecimal)�� ����غ���. 
 * �Է� : 255	 -> ��� : ff		*/
import java.io.*;
import java.util.Scanner;

public class C1032 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		System.out.printf("%x", a);
//
//		sc.close();
//	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.format("%x", a));
		bw.flush();
		bw.close();
	}
}
