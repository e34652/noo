package jan.designpatterns.abs;

public class StateDoorProduct extends DoorProduct {

	@Override
	public String makeAssemble() {
		return "Door is open";
	}

}
