import java.util.Scanner;

public class C1021 {

	public static void main(String[] args) {
		// 50번째 이후로 작성되는 단어는 삭제하고 출력
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("");
		
		if(arr.length > 50) {
			for(int i=0; i < 50; i++) {
				System.out.print(arr[i]);
			}
		} else {
			System.out.println(str);
		}

		sc.close();
		
		//ex2.
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println(str);
	}

}
