package headfirst.command.simpleremote;

public class LightOnCommand implements Command{
  Light light; //���ü��̱⶧���� public �̶�� ���� ����
  public LightOnCommand(Light light){
    this.light=light;
    
  }
  public void execute(){
    light.on();
  }
}