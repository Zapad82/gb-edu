package dip;

public class Switch {
    private Device device;

    public Switch(Lamp lamp) {
        device = new Lamp();
    }

    public void toggle() {
        if (device.getIsOn())
            device.turnOff();
        else
            device.turnOn();
    }
}
