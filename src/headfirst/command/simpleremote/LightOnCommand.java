package headfirst.command.simpleremote;

public class LightOnCommand implements Command{
  Light light; //가시성이기때문에 public 이라고 쓰지 않음
  public LightOnCommand(Light light){
    this.light=light;
    
  }
  public void execute(){
    light.on();
  }
}