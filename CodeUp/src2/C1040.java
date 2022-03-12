/* 입력된 정수의 부호를 바꿔 출력해보자. 단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
 * 입력 : -1	-> 출력 : 1	*/
import java.util.Scanner;
import java.io.*;
public class C1040 {
	/* ex1 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(-num+ "");
//2.	bw.write(String.valueOf(-num));
//3.	bw.write(new Integer(-num).toString());
		bw.flush();
		bw.close();
	}
	
	/* ex2 */
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int num = sc.nextInt();
//	sc.close();
//	
//	System.out.println(-num);
//
//}

}
