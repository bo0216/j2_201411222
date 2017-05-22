package headfirst.command.undo;

public class DVDOnCommand implements Command{
  DVD dvd; //가시성이기때문에 public 이라고 쓰지 않음
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