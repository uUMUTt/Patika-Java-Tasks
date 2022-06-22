package account;

public class IndividualAccount extends Account {

    public IndividualAccount(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy() {
        System.out.println("Individual Insurance Policy is added");
    }

}
