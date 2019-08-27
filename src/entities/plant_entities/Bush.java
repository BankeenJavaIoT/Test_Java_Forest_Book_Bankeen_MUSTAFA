package entities.plant_entities;

public class Bush extends Plant {
	private String fruit;
	private LeafType leafType;

	public Bush(String name, double height) {
		super(name, height);
		fruit = "";
	}

	public Bush(String name) {
		this(name, 0.0);
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public LeafType getLeafType() {
		return leafType;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {
		return "Bush [Name=" + getName() + ", Fruit=" + getFruit() + ", LeafType=" + getLeafType() + ", Height="
				+ getHeight() + "]";
	}

}
