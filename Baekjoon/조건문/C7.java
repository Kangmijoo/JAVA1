/* 1~6 주사위 3개를 던짐. 1.같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
 * 2.같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금. 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금.  
 * 입력 : 3 3 6	-> 출력 : 1300	/ 입력 : 2 2 2	-> 출력 : 12000	/ 입력 : 6 2 5	-> 출력 : 600		*/
import java.util.Scanner;

public class C7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		//1에 해당 (주사위 3개 모두 같은 눈이 나옴)
		if(a == b && b == c) {			
			System.out.println(10000+a*1000);
		} 
		//2에 해당 (주사위 2개가 같은 눈이 나옴)
		else if(a == b || a == c) {		
			System.out.println(1000+a*100);
		} 
		else if(b == c) {
			System.out.println(1000+b*100);
		} 
		//3에 해당 (주사위 모두 다른 눈이 나옴)
		else {							
			if(a > b && a > c) {			//a가 가장 큰 눈이 나왔을 때
				System.out.println(a*100);
			} else if(b > a && b > c) {		//b가 가장 큰 눈이 나왔을 때
				System.out.println(b*100);
			} else {						//c가 가장 큰 눈이 나왔을 때	
				System.out.println(c*100);
			}
		}
	}

}
