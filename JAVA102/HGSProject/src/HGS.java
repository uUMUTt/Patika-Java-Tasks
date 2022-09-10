
import java.util.ArrayList;
import java.util.Date;

public class HGS {

    private int HGSNo;
    private double amount;
    private Vehicle vehicle;
    private Person person;
    private ArrayList<Date> HGSDates = new ArrayList<>();

    public HGS(int HGSNo,double amount, Vehicle vehicle, Person person) {
        this.HGSNo = HGSNo;
        this.vehicle = vehicle;
        this.person = person;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getHGSNo() {
        return HGSNo;
    }

    public void setHGSNo(int HGSNo) {
        this.HGSNo = HGSNo;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Date> getHGSDates() {
        return HGSDates;
    }

    public void setHGSDates(ArrayList<Date> HGSDates) {
        this.HGSDates = HGSDates;
    }

    

}
