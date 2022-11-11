class CCoin extends CCircle
{
 private int value;
 public CCoin()
 {
  System.out.println("CCoin() constructor called");
 }
 public void setValue(int t)
 {
  Value = t;
  System.out.println("value = "+value);
 }
}
public class app10_1
{
  public static void main(String args[])
  {
    CCoin coin = new CCoin();
    coin.setRadius(2.0);
    coin.show();
    coin.setValue(5);
  }
}
    
