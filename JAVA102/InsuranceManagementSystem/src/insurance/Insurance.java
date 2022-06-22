package insurance;

import java.util.Date;

public abstract class Insurance {

    protected String insuranceTitle;
    protected double insurancePrice;
    protected Date start;
    protected Date deadline;

    public Insurance(String insuranceTitle, double insurancePrice, Date start, Date deadline) {
        this.insuranceTitle = insuranceTitle;
        this.insurancePrice = insurancePrice;
        this.start = start;
        this.deadline = deadline;
    }

    public abstract void calculate();

    public String getInsuranceTitle() {
        return insuranceTitle;
    }

    public void setInsuranceTitle(String insuranceTitle) {
        this.insuranceTitle = insuranceTitle;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

}
