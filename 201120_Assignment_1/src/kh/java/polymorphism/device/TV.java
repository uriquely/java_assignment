package kh.java.polymorphism.device;

public class TV extends Device {
	
	private int channel;
	
	public TV() {}

	public TV(String brand, String deviceName, int price, int channel) {
		super(brand, deviceName, price);
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void channelUp() {
		channel = channel + 1;
	}
	
	public void channelDown() {
		channel =  channel - 1;
	}
	
    @Override
	public String toString() {
    	return "[" + getBrand() + ", " + getDeviceName() + ", " + getPrice() + ", " + getChannel() + "]";
	}

}
