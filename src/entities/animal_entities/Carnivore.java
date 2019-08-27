package entities.animal_entities;

public class Carnivore extends Animal {
	private double maxFoodSize;

	public Carnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		maxFoodSize = 0.0;
	}

	public Carnivore(String name) {
		this(name, 0.0, 0.0, 0.0);
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	@Override
	public String toString() {
		return "Carnivore [Name=" + getName() + ", MaxFoodSize=" + getMaxFoodSize() + ", Weight=" + getWeight()
				+ ", Height=" + getHeight() + ", Length=" + getLength() + "]";
	}

}
