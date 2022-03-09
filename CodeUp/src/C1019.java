import java.util.Scanner;

public class C1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//split(".") -> ���ԽĿ��� (.)��ħǥ�� ������ �� ���ڸ� �ǹ�
		//split("[.]") -> ���ԽĿ��� []�� ������ �����̳� ������ ��Ÿ��. ���ڿ��� (.)��ħǥ�� ����	
		//split("\\.") -> ���ԽĿ��� '\.'�� �Ϲݹ��� ��ħǥ�� �ǹ�. ���ڿ��� ��ħǥ ������ �ڸ����� ��
		String[] arr = str.split("[.]");	
		
		String arr0 = arr[0];
		String arr1 = arr[1];
		String arr2 = arr[2];
		
		if(arr0.length() == 1) {
			arr0 = ("000"+ arr0);
		} else if(arr0.length() == 2) {
			arr0 = ("00"+ arr0);
		} else if(arr0.length() == 3) {
			arr0 = ("0"+ arr0);
		} else {
			arr0 = arr0;
		}
		
		while(arr1.length() == 1) {
			arr1 = ("0"+ arr1);
		} 

		while(arr2.length() == 1) {
			arr2 = ("0"+ arr2);
		} 
		
		System.out.printf("%s.%s.%s", arr0, arr1, arr2);
		
		sc.close();
	}

}
