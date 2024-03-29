package entities.animal_entities;

import java.util.HashSet;
import java.util.Set;

import entities.plant_entities.Plant;

public class Omnivore extends Animal {
	private Set<Plant> plantDiet;
	private double maxFoodSize;

	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		maxFoodSize = 0.0;
		plantDiet = null;
	}

	public Omnivore(String name) {
		this(name, 0.0, 0.0, 0.0);
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	public void addPlantToDiet(Plant plant) {
		if (plantDiet == null) {
			// create a set
			plantDiet = new HashSet<Plant>();
		}
		plantDiet.add(plant);
	}

	@Override
	public String toString() {
		//TODO think of performance a String is immutable so in this case i would've rather see a Stringbuilder variable
		// and use the append method
		String plantDietAsString = "(";
		for (Plant plant : getPlantDiet()) {

			plantDietAsString += "'" + plant.getName() + "' ";
		}
		plantDietAsString += ")";
		// TODO you should initialize the plantDietString with this and just return the plantDietString instead
		return "'" + getName() + "' is a Omnivore who eats " + plantDietAsString
				+ ", and eats animals with maximum height of " + getMaxFoodSize() + ", [Weight="
				+ getWeight() + ", Height=" + getHeight() + ", Length=" + getLength() + "]";
	}
}
