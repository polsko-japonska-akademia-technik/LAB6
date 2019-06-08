public abstract class Insurance
{
    protected String insuranceType;
    protected double monthlyPrice;
    public Insurance()
    {
        this.insuranceType = insuranceType;
        this.monthlyPrice = monthlyPrice;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }
    public abstract  void setCost();
    public abstract void display();
}
