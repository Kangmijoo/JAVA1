/* [��Ʈ����������] �Էµ� �� ������ ��Ʈ����(bitwise)�� or ����� ������ ����� 10������ ����Ѵ�.
 * �Է� : 3 5	 -> ��� : 7		*/
import java.io.*;

public class C1061 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		
		int i = Integer.parseInt(arr[0]) | Integer.parseInt(arr[1]);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(i+ "");
		bw.flush();
		bw.close();
	}

}
