package entities.plant_entities;

public class Tree extends Plant {
	private LeafType leafType;

	public Tree(String name, double height) {
		super(name, height);
	}

	public Tree(String name) {
		this(name, 0.0);
	}

	public LeafType getLeafType() {
		return leafType;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {
		return "'" + getName() + "' is a Tree, [LeafType=" + getLeafType() + ", Height=" + getHeight() + "]";
	}

}
