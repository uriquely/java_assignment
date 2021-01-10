package member.model.vo;

public class Silver extends Member {
	
	public Silver() {}

	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}

	@Override
	public double getPoint1() {
		return getPoint() * 0.02;
	}

	@Override
	public String toString() {
		return super.toString() + getPoint1();
	}
}