
public class Main {

    public static void main(String[] args) {

        //PERSON1
        Person person1 = new Person("Meltem", "Polat");
        Vehicle car1 = new Car();
        HGS hgs1 = new HGS(1234, 1250, car1, person1);

        //PERSON2
        Person person2 = new Person("Ayse", "Durmus");
        Vehicle car2 = new Car();
        HGS hgs2 = new HGS(1214, 1250, car2, person2);

        //PERSON3
        Person person3 = new Person("Turgut", "Yetkin");
        Vehicle minibus1 = new Minibus();
        HGS hgs3 = new HGS(2345, 1250, minibus1, person3);

        //PERSON4
        Person person4 = new Person("Utku", "Aslan");
        Vehicle bus1 = new Bus();
        HGS hgs4 = new HGS(3456, 1250, bus1, person4);

        Management management = new Management();

        management.getTollBoth().ticketing(hgs1);
        management.getTollBoth().ticketing(hgs2);
        management.getTollBoth().ticketing(hgs3);
        management.getTollBoth().ticketing(hgs4);

        management.calculateTotalTicketing();
    }

}
