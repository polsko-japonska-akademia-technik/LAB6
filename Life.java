
/*
Autor: Adrian Matyszczak 25.05.2019
 */
public class Life extends Insurance
{
    public Life()
    {
        super();
    }

    @Override
    public void setCost()
    {
        monthlyPrice=36.00d;
    }

    @Override
    public void display()
    {
System.out.println(this.monthlyPrice);
    }
}
