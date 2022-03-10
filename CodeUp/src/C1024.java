/*단어를 1개 입력받는다. 입력받은 단어(영어)의 각 문자를 한줄에 한 문자씩 분리해 출력한다. 입력 : Boy
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
