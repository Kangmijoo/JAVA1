/* [비트시프트연산] 정수 1개를 입력받아 2배 곱해 출력해보자. 
 * 입력 : 1024  -> 출력 : 2048	*/
import java.io.*;
import java.util.Scanner;

public class C1047 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(num<<1));
		bw.flush();
		bw.close();
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		
//		System.out.printf("%d", num<<1);
//	}

}
