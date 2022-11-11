class CCoin extends CCircle
{
 private int value;
 public CCoin()
 {
  System.out.println("CCoin() constructor");
  {
  super(r);
  value = v;
  System.out.println("CCoin(double r, int v) constructor called");
  }
 }
  public class app10_2
  {
   public static void main(String arge[])
   {
    CCoin coin1 = new CCoin();
    CCoin coin2 = new CCoin(2.5, 10);
    coin1.show();
    coin2.show();
   }
  }
