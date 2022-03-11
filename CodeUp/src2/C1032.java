/* 10진수를 입력받아 16진수(hexadecimal)로 출력해보자. 
 * 입력 : 255	 -> 출력 : ff		*/
import java.io.*;
import java.util.Scanner;

public class C1032 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		System.out.printf("%x", a);
//
//		sc.close();
//	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.format("%x", a));
		bw.flush();
		bw.close();
	}
}
