/* [삼항연산] 입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자. (단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.)
 * 입력 : 123 456	 -> 출력 : 456	*/
import java.io.*;
import java.util.Scanner;

public class C1063 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		
		int arr0 = Integer.parseInt(arr[0]);
		int arr1 = Integer.parseInt(arr[1]);
		int i = arr0>arr1 ? arr0:arr1;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(i));
		bw.flush();
		bw.close();
	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		sc.close();
//		
//		System.out.printf("%d", num1>num2 ? num1:num2);
//	}

}
