package member.model.vo;

public class VVip extends Member {
	
	public VVip() {}

	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getPoint1() {
		return getPoint() * 0.15;
	}

	@Override
	public String toString() {
		return super.toString() + getPoint1();
	}
}
