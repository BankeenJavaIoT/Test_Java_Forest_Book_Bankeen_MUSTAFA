package entities.plant_entities;

public class Weed extends Plant {
	private double area;

	public Weed(String name, double height) {
		super(name, height);
	}

	public Weed(String name) {
		this(name, 0.0);
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Weed [Name=" + getName() + ", Area=" + getArea() + ", Height=" + getHeight() + "]";
	}

}
