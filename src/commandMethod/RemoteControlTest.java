package commandMethod;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		//接收者 (接收命令)
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		//調派者  = remote
		LightOnCommand lightOn = new LightOnCommand(light);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		GarageDoorOpenCommand garageDoorOpen =
				new GarageDoorOpenCommand (garageDoor); 
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();
		
		
	}

}
