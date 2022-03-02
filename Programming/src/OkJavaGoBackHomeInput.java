//import로 클래스 불러오기.(호출할 파일 + ctrl + space > import 경로 자동 생성)
//import javax.swing.JOptionPane;		//JOptionPane클래스 -> 팝업(입력 창)

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoBackHomeInput {

	// parameter 매개변수, args -> argument 인자, 인자값이 매개변수에 저장, []는 문자열로 이뤄져있는 배열
	public static void main(String[] args) {
		
		//사용자에게 입력값을 받아옴. showInputDialog메소드 사용
//		String id = JOptionPane.showInputDialog("Enter your ID");		
//		String bright = JOptionPane.showInputDialog("Enter the brightness level");
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();

		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));	//string으로 받아온 bright값을 double로 변환
		moodLamp.on();

	}

}
