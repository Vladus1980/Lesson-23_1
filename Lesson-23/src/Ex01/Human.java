package Ex01;

public class Human {
	
	private int height;
	private int weigh;
	
	public Human(int height, int weigh) {
		super();
		this.height = height;
		this.weigh = weigh;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeigh() {
		return weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}

	@Override
	public String toString() {
		return "Human [height=" + height + ", weigh=" + weigh + "]";
	}
	
	
}
