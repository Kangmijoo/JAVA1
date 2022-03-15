/* [조건/선택실행구조] 세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자. (짝수만 순서대로 줄을 바꿔 출력)
 * 입력 : 1 2 4	->  출력 : 2
 * 						 4	*/
import java.io.*;
import java.util.Scanner;

public class C1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a % 2 == 0) {
			System.out.println(a);
		}
		if(b % 2 == 0) {
			System.out.println(b);
		}
		if(c % 2 == 0) {
			System.out.println(c);
		}
		
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		String[] arr = str.split(" ");
//		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		if(Integer.parseInt(arr[0]) % 2 == 0) {
//			bw.write(String.valueOf(arr[0])+ "\n");
//		}
//		if(Integer.parseInt(arr[1]) % 2 == 0) {
//			bw.write(String.valueOf(arr[1])+ "\n");
//		}
//		if(Integer.parseInt(arr[2]) % 2 == 0) {
//			bw.write(String.valueOf(arr[2])+ "\n");
//		}
//		bw.flush();
//		bw.close();
//		
//	}

}
