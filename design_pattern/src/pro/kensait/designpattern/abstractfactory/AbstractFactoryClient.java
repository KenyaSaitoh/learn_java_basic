package pro.kensait.designpattern.abstractfactory;

public class AbstractFactoryClient {

    public static void main(String[] args) {

        //
        System.out.println("===== Sedan =====");
        AbstractCarFactory factory1 = new SedanFactory();
        AbstractDoor door1 = factory1.createDoor();
        AbstractSeat seat1 = factory1.createSeat();
        door1.doTask();
        seat1.doTask();

        //
        System.out.println("===== Wagon =====");
        AbstractCarFactory factory2 = new WagonFactory();
        AbstractDoor door2 = factory2.createDoor();
        AbstractSeat seat2 = factory2.createSeat();
        door2.doTask();
        seat2.doTask();
    }
}