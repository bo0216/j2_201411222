package headfirst.command.undo;

public class DVDOffCommand implements Command{
  DVD dvd; //가시성이기때문에 public 이라고 쓰지 않음
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