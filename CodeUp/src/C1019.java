import java.util.Scanner;

public class C1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//split(".") -> 정규식에서 (.)마침표는 임의의 한 문자를 의미
		//split("[.]") -> 정규식에서 []는 문자의 집합이나 범위를 나타냄. 문자열을 (.)마침표로 구분	
		//split("\\.") -> 정규식에서 '\.'는 일반문자 마침표를 의미. 문자열을 마침표 단위로 자르도록 함
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
