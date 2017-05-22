package headfirst.command.undo;

public class LightOnCommand implements Command{
  Light light; //���ü��̱⶧���� public �̶�� ���� ����
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