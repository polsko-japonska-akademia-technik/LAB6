/*
Autor: Adrian Matyszczak 25.05.2019
 */
public class Circle implements GeometricObject
{
    protected double radius = 1.0d;
    public Circle(double radius)

    {
        this.radius=radius;
    }
    @Override
    public double getPermeter()
    {
        return 2*Math.PI*radius; ;
    }
    @Override
    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
}
