
/*
Autor: Adrian Matyszczak 25.05.2019
 */
public class Life
{
    class Life extends UseInsurance
    {
        public Life (String UseInsuranceType)
        {
            super(UseInsuranceType);
            setCost();
        }
        @Override
        public void setCost()
        {
            this.monthlyPrice = 36
        }
        @Override
        public void display()
        {
            System.out.printf("UseInsuranceType")
        }
    }
}
