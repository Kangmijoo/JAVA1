/* [���׿���] �Էµ� �� ���� a, b �� ū ���� ����ϴ� ���α׷��� �ۼ��غ���. (��, ���ǹ��� ������� �ʰ� 3�� ������ ? �� ����Ѵ�.)
 * �Է� : 123 456	 -> ��� : 456	*/
import java.io.*;
import java.util.Scanner;

public class C1063 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		
		int arr0 = Integer.parseInt(arr[0]);
		int arr1 = Integer.parseInt(arr[1]);
		int i = arr0>arr1 ? arr0:arr1;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(i));
		bw.flush();
		bw.close();
	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		sc.close();
//		
//		System.out.printf("%d", num1>num2 ? num1:num2);
//	}

}
