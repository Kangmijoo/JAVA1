/* [비트단위논리연산] 입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자. 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.
 * 입력 : 2	-> 출력 : -3		*/
import java.io.*;
import java.util.Scanner;

public class C1059 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(~a));
		bw.flush();
		bw.close();
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		System.out.printf("%d", ~a);
//		
//	}

	
}
