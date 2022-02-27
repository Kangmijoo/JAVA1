//Casting
public class Casting {

	public static void main(String[] args) {

		double a = 1.1;
		double b = 1;	//손실이 없기 때문에 자동으로 casting (1이나 1.0이나 손실이 없음)
		double b2 = (double) 1;
		System.out.println(b);

//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;	//double형을 int로 바꾸면 손실이 있기 때문에 명시적으로 형 변환을 해야 함. (1.1->1.0이 되려면 0.1이 날아감)
		System.out.println(e);
		
		// 1 to String 더이상 숫자가 아니라 문자열
		String f = Integer.toString(1);
		System.out.println(f.getClass());	//.getClass() -> 앞에 갖고 있는 데이터 값(f)이 어떤 타입인지 알려 줌.
		
	}

}
