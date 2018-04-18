package structural.adapter;

public class ElectricalSocket {

	public Volt getVolt() {
		return new Volt(20);
	}

}
