/* [��Ʈ����������] �Էµ� �� ������ ��Ʈ����(bitwise)�� and ����� ������ ����� 10������ ����Ѵ�.
 * �Է� : 3 5	 -> ��� : 1		*/
import java.io.*;
import java.util.Scanner;

public class C1060 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		
		int i = Integer.parseInt(arr[0]) & Integer.parseInt(arr[1]);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(i));
		bw.flush();
		bw.close();
	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		System.out.printf("%d", num1&num2);
//
//	}

}
