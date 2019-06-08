/*
Autor: Adrian Matyszczak 25.05.2019
 */
public class Health extends Insurance
{
    public Health()
    {
        super();
    }
    @Override
    public void setCost()
    {
        monthlyPrice=196.0d;
    }
    @Override
    public void  display()
    {
        System.out.println(this.monthlyPrice);
    }
}
