package entities.plant_entities;

public class Flower extends Plant {
	private Scent smell;

	public Flower(String name, double height) {
		super(name, height);
	}

	public Flower(String name) {
		this(name, 0.0);
	}

	public Scent getSmell() {
		return smell;
	}

	public void setSmell(Scent smell) {
		this.smell = smell;
	}

	@Override
	public String toString() {
		return "'" + getName() + "' is a Flower, [Smell=" + getSmell() + ", Height=" + getHeight() + "]";
	}

}
