package entities.animal_entities;

import java.util.HashSet;
import java.util.Set;

import entities.plant_entities.Plant;

public class Herbivore extends Animal {
	private Set<Plant> plantDiet;

	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		plantDiet = null;
	}

	public Herbivore(String name) {
		this(name, 0.0, 0.0, 0.0);
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public void addPlantToDiet(Plant plant) {
		if (plantDiet == null) {
			// create a set
			plantDiet = new HashSet<Plant>();
		}
		plantDiet.add(plant);
	}

	public void printDiet() {
		if (plantDiet == null) {
			return;
		}
		System.out.println("Diet of " + getName() + " is:");
		plantDiet.forEach(System.out::println);
	}

	@Override
	public String toString() {
		String plantDietAsString = "(";
		for (Plant plant : getPlantDiet()) {
			plantDietAsString += plant.toString() + " ";
		}
		plantDietAsString += ")";
		return "Herbivore [Name=" + getName() + ", PlantDiet=" + plantDietAsString + ", Weight=" + getWeight()
				+ ", Height=" + getHeight() + ", Length=" + getLength() + "]";
	}

}
