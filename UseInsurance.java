/*
Autor: Adrian Matyszczak 25.05.2019
 */
public class UseInsurance
{
    lass Health extends Insurance {

	public Health(String UseInsuranceType) {
        super(UseInsuranceType);
        setCost();
    }

    @Override
    public void setCost() {
        this.monthlyPrice = 196;
    }

    @Override
    public void display() {
        System.out.printf("InsuranceType : %s\nMonthly Price : %.2f\n", insuranceType, monthlyPrice);
    }

}

    abstract class Insurance {

        public String insuranceType;
        public double monthlyPrice;

        public Insurance(String insuranceType) {
            this.insuranceType = insuranceType;
        }

        public abstract void setCost();

        public abstract void display();

}
