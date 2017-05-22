package headfirst.command.undo;

public class DVDOffCommand implements Command{
  DVD dvd; //���ü��̱⶧���� public �̶�� ���� ����
  public DVDOffCommand(DVD dvd){
    this.dvd=dvd;
    
  }
  public void execute(){
    dvd.off();
  }
  public void undo(){
    dvd.on();
    dvd.setDVD();
    dvd.setVolume(11);
  }
}