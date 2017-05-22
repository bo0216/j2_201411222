package headfirst.command.undo;

public class DVD{
  int volume;
  String location;
  public DVD(String location){
    this.location=location;
  }
  
  public void on(){
    System.out.println("DVD is on");
  }
  public void off(){
    System.out.println("DVD is off");
  }
  public void setDVD(){
    System.out.println("setDVD");
  }
  public int getVolume(){
    return volume;
  }
  public void setVolume(int volume){
    this.volume=volume;
  }
}