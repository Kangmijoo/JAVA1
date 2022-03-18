/* [종합] 빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때, (빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)
 * 주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과 총 가짓 수를 계산해보자.
 * 입력 : 2 2 2	-> 출력 : 0 0 0 \ 0 0 1 \ 0 1 0 \ 0 1 1 \ 1 0 0 \ 1 0 1 \ 1 1 0 \ 1 1 1 \ 8	*/
import java.io.*;
import java.util.Scanner;

public class C1084 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		
		int r = Integer.parseInt(arr[0]);
		int g = Integer.parseInt(arr[1]);
		int b = Integer.parseInt(arr[2]);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int num1 = 0; num1 < r; num1++) {
			for(int num2 = 0; num2 < g; num2++) {
				for(int num3 = 0; num3 < b; num3++) {
					String st = num1 +" "+ num2 +" "+ num3 +"\n";
					bw.write(st);
				}
			}
		}
		bw.write(String.valueOf(r*g*b));
		bw.flush();
		bw.close();
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int r = sc.nextInt();
//		int g = sc.nextInt();
//		int b = sc.nextInt();
//		sc.close();
//		
//		for(int num1 = 0; num1 < r; num1++) {
//			for(int num2 = 0; num2 < g; num2++) {
//				for(int num3 = 0; num3 < b; num3++) {
//					System.out.printf("%d %d %d\n", num1, num2, num3);
//				}
//			}
//		}
//		System.out.println(r*g*b);
//
//	}

}
