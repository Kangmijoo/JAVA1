/* 영문자 1개를 입력받아 그 다음 문자를 출력해보자. 영문자 'A'의 다음 문자는 'B'이고, 영문자 '0'의 다음 문자는 '1'이다.
 * 입력 : a	-> 출력 : b	*/
import java.io.*;
import java.util.Scanner;
public class C1041 {
	/* ex1 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		int i = (int)ch+1;
		char ascii = (char)i;
		
		System.out.println(ascii);
		
		sc.close();
	}
	
	/* ex2 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char ch = sc.nextLine().charAt(0);
//		sc.close();
//		System.out.printf("%c", ch+1);
//	}
	
	/* ex3 */
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		char ch = br.readLine().charAt(0);
//		int i = (int)ch+1;
//		char ascii = (char)i;
//		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		bw.write(ascii);
//		bw.flush();
//		bw.close();
//	}

}
