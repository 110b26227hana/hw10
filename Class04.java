class CCircle
{
  private double pi = 3.14;
  private double radius;
  public CCircle()
  {
  }
  public CCircle(double r)
  {
    radius = r;
  }
  public void setRadius(double r)
  {
    radius = r;
    System.out.println("radius="+radius);
  }
}
