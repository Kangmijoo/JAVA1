//result1.txt파일에다가 hello1이라는 텍스트를 java를 이용해서 작성
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class instanceApp {

	public static void main(String[] args) {

		//result1.txt파일 생성
		File fileName = new File("result1.txt");
		
		//넣어 줄 텍스트 내용
		String txt = "hello1";
		
		try {	//에러가 발생할 수 있는 코드
			/* 기록하고자 하는 파일의 크기가 100K가 넘는다면 FileWriter 단독 사용보다는 
			   BufferedWriter + FileWriter를 혼합하여 사용하는 것이 파일 기록할 때 속도가 더 빠름 
			      문자열도 String보다는 StringBuilder나 StringBuffer 사용 */
			BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
			
			//파일 안에 문자열 쓰기
			fw.write(txt);
			fw.flush();
			
			//객체 닫기
			fw.close();
			
		}catch(Exception e) {	//에러 시 수행
			e.printStackTrace();	//오류 출력
		}

	}

}
