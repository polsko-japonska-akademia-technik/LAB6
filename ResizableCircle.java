/*
Autor: Adrian Matyszczak 25.05.2019
 */
public class ResizableCircle implements Resizable
{
   private Circle circle;
   public ResizableCircle(double radius)
   {
      this.circle = new Circle(radius);
   }

   @Override
   public double resize(int percent)
   {
      return circle.radius*(1.d-(percent/100.d));
   }
   public String toString()
   {
      return "Radius = "+circle.radius;
   }
}
