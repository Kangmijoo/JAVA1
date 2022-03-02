// import로 클래스 불러오기.(호출할 파일 + ctrl + space > import 경로 자동 생성)
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoBackHome {

	public static void main(String[] args) {
		
		//반복되는 내용 변수로 만들어두면 내용 수정 시 하나하나 바꾸지 않아도 됨.
		String id = "JAVA APT 507";		
		
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

	}

}
