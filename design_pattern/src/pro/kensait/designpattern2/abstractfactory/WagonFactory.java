package pro.kensait.designpattern2.abstractfactory;

public class WagonFactory extends AbstractCarFactory {

    public AbstractDoor createDoor() {
        return new WagonDoor();
    }

    public AbstractSeat createSeat() {
        return new WagonSeat();
    }
}