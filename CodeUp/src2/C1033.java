/* 10������ �Է¹޾� 16����(hexadecimal)�� ����غ���. 
 * �Է� : 255  -> ��� : FF		*/
import java.io.*;

public class C1033 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.format("%X", a));
		bw.flush();
		bw.close();
	}

}
