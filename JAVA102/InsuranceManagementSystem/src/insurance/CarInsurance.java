package insurance;

import java.util.Date;

public class CarInsurance extends Insurance {

    public CarInsurance(String insuranceTitle, double insurancePrice, Date start, Date deadline) {
        super(insuranceTitle, insurancePrice, start, deadline);
    }

    @Override
    public void calculate() {
        System.out.println("Calculate Car Insurance");
    }

}
