import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class instanceApp3 {

	public static void main(String[] args) {
		
		//파일 생성
		File file = new File("result3.txt");
		
		//사용자 팝업창
		String txt = JOptionPane.showInputDialog("메모장에 작성할 내용을 입력하시오.");
		
		try {
			BufferedWriter osw = new BufferedWriter(new FileWriter(file, true));
			
			//osw에 내용 넣기
			osw.write(txt);
			osw.flush();
			
			osw.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
