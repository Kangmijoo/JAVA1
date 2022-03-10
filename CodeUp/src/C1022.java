import java.io.*;
import java.util.Scanner;

public class C1022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(str);

		sc.close();
		
	}
	
	/* ex2
	 * Scanner��� BuffereReader, System.out.println��� BuffereWriter (�ӵ��� �� ����)
	 */
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		bw.write(str);
//		bw.flush();
//		bw.close();
//	}

}
