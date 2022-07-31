package pro.kensait.designpattern2.abstractfactory;

public abstract class AbstractCarFactory {

    public abstract AbstractDoor createDoor();

    public abstract AbstractSeat createSeat();
}