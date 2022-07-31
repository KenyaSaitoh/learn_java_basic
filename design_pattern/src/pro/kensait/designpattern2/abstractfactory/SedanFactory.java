package pro.kensait.designpattern2.abstractfactory;

public class SedanFactory extends AbstractCarFactory {

    public AbstractDoor createDoor() {
        return new SedanDoor();
    }

    public AbstractSeat createSeat() {
        return new SedanSeat();
    }
}