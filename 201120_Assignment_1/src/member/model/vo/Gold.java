package member.model.vo;

public class Gold extends Member {

	public Gold() {}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getPoint1() {
		return getPoint() * 0.05;
	}

	@Override
	public String toString() {
		return super.toString() + getPoint1();
	}
}
