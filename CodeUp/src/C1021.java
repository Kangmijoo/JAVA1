import java.util.Scanner;

public class C1021 {

	public static void main(String[] args) {
		// 50��° ���ķ� �ۼ��Ǵ� �ܾ�� �����ϰ� ���
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
