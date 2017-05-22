package headfirst.command.undo;

public class LightOnCommand implements Command{
  Light light; //가시성이기때문에 public 이라고 쓰지 않음
  int level;
  public LightOnCommand(Light light){
    this.light=light;
    
  }
  public void execute(){
  
    light.on();
  }
  public void undo(){
    light.off();
  }
}