package insurance;

import java.util.Date;

public class HealtInsurance extends Insurance {

    public HealtInsurance(String insuranceTitle, double insurancePrice, Date start, Date deadline) {
        super(insuranceTitle, insurancePrice, start, deadline);
    }

    @Override
    public void calculate() {
        System.out.println("Calculate Healt Insurance");
    }
}
