/*�ܾ 1�� �Է¹޴´�. �Է¹��� �ܾ�(����)�� �� ���ڸ� ���ٿ� �� ���ھ� �и��� ����Ѵ�. �Է� : Boy
 * 'B'
 * 'o'
 * 'y'
 */
import java.io.*;

public class C1024 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split("");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < arr.length; i++) {
			String s = arr[i];
			bw.write("'" +s+ "'" + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
