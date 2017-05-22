package headfirst.command.undo;

public class LightOffCommand implements Command{
  Light light; //���ü��̱⶧���� public �̶�� ���� ����
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