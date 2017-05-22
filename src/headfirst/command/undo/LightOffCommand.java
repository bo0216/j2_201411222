package headfirst.command.undo;

public class LightOffCommand implements Command{
  Light light; //가시성이기때문에 public 이라고 쓰지 않음
  public LightOffCommand(Light light){
    this.light=light;
    
  }
  public void execute(){
    light.off();
  }
  public void undo(){
    light.on();
  }
}