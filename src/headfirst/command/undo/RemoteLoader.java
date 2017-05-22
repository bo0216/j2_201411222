package headfirst.command.undo;

public class RemoteLoader {
 
 public static void main(String[] args) {
  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
  Light livingRoomLight = new Light("Living Room");
  DVD livingRoomDVD = new DVD("Living Room");

  LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
  LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
  
  DVDOnCommand dvdCommandOn = new DVDOnCommand(livingRoomDVD);
  DVDOffCommand dvdCommandOff = new DVDOffCommand(livingRoomDVD);

  remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
  remoteControl.setCommand(1, dvdCommandOn, dvdCommandOff);
  
 
  remoteControl.onButtonWasPushed(0);
  remoteControl.offButtonWasPushed(0);
  System.out.println(remoteControl);
  remoteControl.undoButtonWasPushed();
  remoteControl.offButtonWasPushed(0);
  remoteControl.onButtonWasPushed(0);
  System.out.println(remoteControl);
  
  
  remoteControl.onButtonWasPushed(1);
  remoteControl.offButtonWasPushed(1);
  System.out.println(remoteControl);
  remoteControl.undoButtonWasPushed();
  remoteControl.offButtonWasPushed(1);
  remoteControl.onButtonWasPushed(1);
  System.out.println(remoteControl);
 }
}
  