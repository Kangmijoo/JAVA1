/* 화학식은 CxHy의 꼴로 입력된다. C의 원자량은 12, H의 원자량은 1로 한다. 분자량을 출력한다.
 * 입력 : C3H8	-> 출력 : 44	*/
import java.util.Scanner;
import java.util.regex.*;

public class C1124 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
			
		//C와 H사이 값 구함 -> C원자량
		Pattern pattern = Pattern.compile("[C](.*?)[H]");
		Matcher matcher = pattern.matcher(str);
				
		int C = 0;
		while (matcher.find()) {  // 일치하는 게 있다면  
		    C = Integer.parseInt(matcher.group(1));
		    if(matcher.group(1) ==  null)
		    	break;
		}
		
		//특정문자 이후의 문자열 -> H뒤에 값 -> H원자량
		int H = Integer.valueOf(str.substring(str.lastIndexOf("H")+1));
		
		System.out.println(C*12+H*1);
	}

}
