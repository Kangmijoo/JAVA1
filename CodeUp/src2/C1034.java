/* 8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
 * 입력 : 13 	-> 출력 : 11	*/
import java.io.*;
import java.util.Scanner;

public class C1034 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.valueOf(str, 8);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.format("%d", a));
		bw.flush();
		bw.close();
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt(8);	//공백이면 10진수, 숫자 넣으면 해당 진법으로 연산
//		
//		System.out.printf("%d", num);
//		
//		sc.close();
//	}

}
