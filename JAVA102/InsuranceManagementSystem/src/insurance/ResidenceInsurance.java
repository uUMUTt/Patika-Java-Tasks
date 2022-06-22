package insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance {

    public ResidenceInsurance(String insuranceTitle, double insurancePrice, Date start, Date deadline) {
        super(insuranceTitle, insurancePrice, start, deadline);
    }

    @Override
    public void calculate() {
        System.out.println("Calculate Residence Insurance");
    }
}
