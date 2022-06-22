package account;

public class EnterpriseAccount extends Account {

    public EnterpriseAccount(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy() {
        System.out.println("Enterprise Insurance policy is added");
    }

}
