
import java.util.ArrayList;
import java.util.Date;

public class TollBoth implements TicketOperation {

    public final double FIRST_CLASS_PRICE = 100.0;
    public final double SECOND_CLASS_PRICE = 150.0;
    public final double THIRD_CLASS_PRICE = 200.0;
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();
    private double total = 0;

    @Override
    public void ticketing(HGS hgs) {
        Vehicle vehicle = hgs.getVehicle();
        String vehicleClass = vehicle.getVehicleClass();
        double amount = hgs.getAmount();
        hgs.getHGSDates().add(new Date(System.currentTimeMillis()));

        vehicles.add(vehicle);

        //If there is not enough money in the person's account, 
        //the account will have a negative balance and the person will be debited.
        switch (vehicleClass) {
            case "1.Class" -> {
                hgs.setAmount(amount - FIRST_CLASS_PRICE);
                total += FIRST_CLASS_PRICE;
            }
            case "2.Class" -> {
                hgs.setAmount(amount - SECOND_CLASS_PRICE);
                total += SECOND_CLASS_PRICE;
            }
            default -> {
                hgs.setAmount(amount - THIRD_CLASS_PRICE);
                total += THIRD_CLASS_PRICE;
            }
        }
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public double getTotal() {
        return total;
    }

}
