import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class instanceApp3 {

	public static void main(String[] args) {
		
		//���� ����
		File file = new File("result3.txt");
		
		//����� �˾�â
		String txt = JOptionPane.showInputDialog("�޸��忡 �ۼ��� ������ �Է��Ͻÿ�.");
		
		try {
			BufferedWriter osw = new BufferedWriter(new FileWriter(file, true));
			
			//osw�� ���� �ֱ�
			osw.write(txt);
			osw.flush();
			
			osw.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
