package member.model.vo;

public class Vip extends Member {
	
	public Vip() {}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getPoint1() {
		return getPoint() * 0.1;
	}

	@Override
	public String toString() {
		return super.toString() + getPoint1();
	}
}
