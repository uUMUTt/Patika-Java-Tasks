
package insurance;

import java.util.Date;


public class TravelInsurance extends Insurance {

    public TravelInsurance(String insuranceTitle, double insurancePrice, Date start, Date deadline) {
        super(insuranceTitle, insurancePrice, start, deadline);
    }

    @Override
    public void calculate() {
        System.out.println("Calculate Travel Insurance");
    }
}
