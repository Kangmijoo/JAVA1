// result2.txt���Ͽ��ٰ� hello2�̶�� �ؽ�Ʈ�� java�� �̿��ؼ� �ۼ�
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class instanceApp2 {

	public static void main(String[] args) throws IOException {
		
		// PrintWriterŬ���� ��� 
		// ���� Ŭ�� -> Open Type Hierarchy���� �θ� Ŭ���� Ȯ�� ����
		// Object > Writer > PrintWriter
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("hello2");
		p2.close();
		
		// PrintWriter�� �θ� Ŭ������ Object�� �ִ� �޼ҵ带(toString..)�� ��ӹ޾ұ� ������ ����� �� ����
		p2.toString();	

	}

}
