/* [���׿���] �Էµ� �� ���� a, b, c �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��غ���. (��, ���ǹ��� ������� �ʰ� 3�� ������ ? �� ����Ѵ�.)
 * �Է� : 3 -1 5	-> ��� : -1		 */
import java.io.*;
import java.util.Scanner;

public class C1064 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		sc.close();
//		
//		System.out.printf("%d", (a<b ? a:b)<c ? (a<b ? a:b):c);
//
//	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int i = (a<b ? a:b)<c ? (a<b ? a:b):c;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(i +"");
		bw.flush();
		bw.close();
	}
	
}
