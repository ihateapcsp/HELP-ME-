import java.lang.Math;
public class Dices{
  private int roll;
  private int minroll;
  private int maxroll;
  private void getRoll(){
    roll=Math.round(Math.random(minroll+0.0,maxroll+0.0));
  }
  private int receiveRoll(){
    return roll;
  }
  public int rollDice(){
    this.getRoll();
    return this.receiveRoll();
  }
}
