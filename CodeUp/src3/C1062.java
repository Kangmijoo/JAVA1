/* [��Ʈ����������] �Էµ� �� ������ ��Ʈ����(bitwise)�� xor ����� ������ ����� 10������ ����Ѵ�. 
 * �Է� : 3 5	 -> ��� : 6		*/
import java.io.*;
import java.util.Scanner;

public class C1062 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		
		int i = Integer.valueOf(arr[0]) ^ Integer.valueOf(arr[1]);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(i +"");
		bw.flush();
		bw.close();
	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		sc.close();
//		
//		System.out.printf("%d", num1^num2);
//	}

}
