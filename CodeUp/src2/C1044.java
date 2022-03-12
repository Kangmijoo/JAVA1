/* 정수를 1개 입력받아 1만큼 더해 출력해보자. (단, -2147483648 ~ +2147483647 의 범위로 입력된다.)
 * 입력 : 2147483647	-> 출력 : 2147483648	*/
import java.util.Scanner;
import java.io.*;
public class C1044 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(num+1));
		bw.flush();
		bw.close();
	}
	
	/* ex2 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long num = sc.nextLong();
//		sc.close();
//		
//		System.out.println(num+1);
//	}

}
