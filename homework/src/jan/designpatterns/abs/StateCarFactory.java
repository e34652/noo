package jan.designpatterns.abs;

public class StateCarFactory extends CarFactory{

	@Override
	public DoorProduct createDoor() {
		return new StateDoorProduct();
	}

	@Override
	public TireProduct createTire() {
		return new StateTireProduct();
	}

}
