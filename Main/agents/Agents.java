package agents;

public abstract class Agents{
  protected int x;
  protected int y;
  protected State state;

  public int getX(){
    return x;
  }

  public void setX(int i){
    this.x = i;
  }

  public int getY(){
    return y;
  }

  public void setY(int j){
    this.y = j;
  }
}
