package headfirst.command.undo;

public class DVDOnCommand implements Command{
  DVD dvd; //���ü��̱⶧���� public �̶�� ���� ����
  public DVDOnCommand(DVD dvd){
    this.dvd=dvd;
    
  }
  public void execute(){
    dvd.on();
    dvd.setDVD();
    dvd.setVolume(11);
  }
  public void undo(){
    dvd.off();
  }
}