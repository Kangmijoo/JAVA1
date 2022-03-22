/* hello를 20번 연속출력한 다음 한 칸을 띄우고(공백 한칸(줄바꿈 아님)) world를 연속 30번 출력하시오.
 * hellohellohello...hello worldworldworld...world (hello20번 world30번)	*/
public class C1108 {

	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			System.out.print("hello");
		}
		System.out.print(" ");
		for(int i = 0; i < 30; i++) {
			System.out.print("world");
		}
	}

}
