//import�� Ŭ���� �ҷ�����.(ȣ���� ���� + ctrl + space > import ��� �ڵ� ����)
//import javax.swing.JOptionPane;		//JOptionPaneŬ���� -> �˾�(�Է� â)

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoBackHomeInput {

	// parameter �Ű�����, args -> argument ����, ���ڰ��� �Ű������� ����, []�� ���ڿ��� �̷����ִ� �迭
	public static void main(String[] args) {
		
		//����ڿ��� �Է°��� �޾ƿ�. showInputDialog�޼ҵ� ���
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
		moodLamp.setBright(Double.parseDouble(bright));	//string���� �޾ƿ� bright���� double�� ��ȯ
		moodLamp.on();

	}

}
