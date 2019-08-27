package entities.plant_entities;

public class Plant {
	private String name;
	private double height;

	public Plant(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public Plant(String name) {
		this(name, 0.0);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}
}
