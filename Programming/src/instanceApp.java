//result1.txt���Ͽ��ٰ� hello1�̶�� �ؽ�Ʈ�� java�� �̿��ؼ� �ۼ�
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class instanceApp {

	public static void main(String[] args) {

		//result1.txt���� ����
		File fileName = new File("result1.txt");
		
		//�־� �� �ؽ�Ʈ ����
		String txt = "hello1";
		
		try {	//������ �߻��� �� �ִ� �ڵ�
			/* ����ϰ��� �ϴ� ������ ũ�Ⱑ 100K�� �Ѵ´ٸ� FileWriter �ܵ� ��뺸�ٴ� 
			   BufferedWriter + FileWriter�� ȥ���Ͽ� ����ϴ� ���� ���� ����� �� �ӵ��� �� ���� 
			      ���ڿ��� String���ٴ� StringBuilder�� StringBuffer ��� */
			BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
			
			//���� �ȿ� ���ڿ� ����
			fw.write(txt);
			fw.flush();
			
			//��ü �ݱ�
			fw.close();
			
		}catch(Exception e) {	//���� �� ����
			e.printStackTrace();	//���� ���
		}

	}

}
