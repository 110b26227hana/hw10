class CCircle
{
 private static double pi = 3.14;
 private double radius;
 public CCircle()
 {
  System.out.println("CCircle() constructor called");
  }
  public void setRadius(double r)
  {
   radius = r;
   System.out.println("radius = "+radius);
  }
  public void show()
  {
  System.out.println("area="+pi*radius*radius);
  }
 }
