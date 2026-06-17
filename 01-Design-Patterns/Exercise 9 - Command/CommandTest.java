package DesignPatterns.Exercise09;
public class CommandTest {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        RemoteControl remote = new RemoteControl();
        System.out.println("Testing Remote: Setting Light ON Command...");
        remote.setCommand(lightOn);
        remote.pressButton();
        System.out.println("Testing Remote: Setting Light OFF Command...");
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
