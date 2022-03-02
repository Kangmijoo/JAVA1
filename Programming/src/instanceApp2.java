// result2.txt파일에다가 hello2이라는 텍스트를 java를 이용해서 작성
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class instanceApp2 {

	public static void main(String[] args) throws IOException {
		
		// PrintWriter클래스 사용 
		// 왼쪽 클릭 -> Open Type Hierarchy에서 부모 클래스 확인 가능
		// Object > Writer > PrintWriter
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("hello2");
		p2.close();
		
		// PrintWriter의 부모 클래스인 Object에 있는 메소드를(toString..)를 상속받았기 때문에 사용할 수 있음
		p2.toString();	

	}

}
