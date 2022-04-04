/* ���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.
 * Java -> Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ���. 
 * BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
 * ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000. ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. A�� B�� 1 �̻�, 1,000 �����̴�.
 * �Է� : 5 \ 1 1 \ 12 34 \ 5 500 \ 40 60 \ 1000 1000	-> ��� : 2 \ 46 \ 505 \ 100 \ 2000	*/
import java.io.*;
import java.util.StringTokenizer;

public class C04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		bw.flush();
		bw.close();
	}

}
