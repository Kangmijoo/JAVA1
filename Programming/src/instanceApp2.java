//result2.txt파일에다가 hello2이라는 텍스트를 java를 이용해서 작성
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class instanceApp2 {

	public static void main(String[] args) throws IOException {
		
		//PrintWriter클래스 사용
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("hello2");
		p2.close();

	}

}
